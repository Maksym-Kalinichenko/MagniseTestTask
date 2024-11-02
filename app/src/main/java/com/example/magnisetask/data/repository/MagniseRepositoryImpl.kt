package com.example.magnisetask.data.repository

import com.example.magnisetask.data.remote.MagniseApi
import com.example.magnisetask.data.remote.MagniseApi.Companion.BASE_URL
import com.example.magnisetask.data.remote.MagniseApi.Companion.TOKEN
import com.example.magnisetask.data.remote.MagniseApi.Companion.WSS_URL
import com.example.magnisetask.data.remote.SocketListener
import com.example.magnisetask.domain.model.FinanceInfo
import com.example.magnisetask.domain.model.FinanceInfoFull
import com.example.magnisetask.domain.model.Instrument
import com.example.magnisetask.domain.model.InstrumentsResponse
import com.example.magnisetask.domain.model.TokenResponse
import com.example.magnisetask.domain.repository.MagniseRepository
import com.example.magnisetask.util.Resource
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.suspendCancellableCoroutine
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.WebSocket
import okhttp3.WebSocketListener
import okio.ByteString
import org.json.JSONArray
import org.json.JSONObject
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class MagniseRepositoryImpl @Inject constructor() :
    MagniseRepository {

    private lateinit var webSocket: WebSocket

    private val retrofit = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    private val okHttpClient = OkHttpClient.Builder()
        .addInterceptor(Interceptor { chain ->
            val newRequest = chain.request().newBuilder()
                .addHeader("Authorization", "Bearer $TOKEN")
                .build()
            chain.proceed(newRequest)
        })
        .build()

    private val retrofitAuth = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .client(okHttpClient)
        .build()


    @OptIn(ExperimentalCoroutinesApi::class)
    private suspend fun getTokenAsync(): TokenResponse? {
        return suspendCancellableCoroutine { continuation ->
            val tokenService = retrofit.create(MagniseApi::class.java).getToken()
            tokenService.enqueue(object : Callback<TokenResponse> {
                override fun onResponse(
                    call: Call<TokenResponse>,
                    response: Response<TokenResponse>
                ) {
                    if (response.isSuccessful) {
                        continuation.resume(response.body()) { }
                    } else {
                        continuation.resume(null) { }
                    }
                }

                override fun onFailure(call: Call<TokenResponse>, t: Throwable) {
                    continuation.resume(null) { }
                }
            })
        }
    }

    @OptIn(ExperimentalCoroutinesApi::class)
    private suspend fun getDataAsync(): InstrumentsResponse? {
        return suspendCancellableCoroutine { continuation ->
            val authService = retrofitAuth.create(MagniseApi::class.java).getInstruments()
            authService.enqueue(object : Callback<InstrumentsResponse> {
                override fun onResponse(
                    call: Call<InstrumentsResponse>,
                    response: Response<InstrumentsResponse>
                ) {
                    if (response.isSuccessful) {
                        continuation.resume(response.body()) { }
                    } else {
                        continuation.resume(null) { }
                    }
                }

                override fun onFailure(call: Call<InstrumentsResponse>, t: Throwable) {
                    continuation.resume(null) { }
                }
            })
        }
    }

    override suspend fun getFinanceListings(): Flow<Resource<List<Instrument>>> {
        return flow {
            emit(Resource.Loading(true))
            val tokenResult = getTokenAsync()

            if (tokenResult != null) {
                TOKEN = tokenResult.access_token
                val data = getDataAsync()
                if (data != null) {
                    emit(Resource.Success(data.data))
                } else
                    emit(Resource.Error("Failed to fetch data"))
            } else {
                emit(Resource.Error("Failed to fetch token"))
            }
            emit(Resource.Loading(false))
        }
    }

    override suspend fun getFinanceInfo(
        id: String
    ): Resource<List<FinanceInfoFull>> {
        val authService = retrofitAuth.create(MagniseApi::class.java)
            .getFinanceInfo(instrumentId = id)
        val data = getFinanceAsync(authService)

        return if (data != null) {
            Resource.Success(data.data)
        } else {
            Resource.Error("Failed to fetch finance data")
        }
    }

    @OptIn(ExperimentalCoroutinesApi::class)
    private suspend fun getFinanceAsync(authService: Call<FinanceInfo>): FinanceInfo? {
        return suspendCancellableCoroutine { continuation ->
            authService.enqueue(object : Callback<FinanceInfo> {
                override fun onResponse(
                    call: Call<FinanceInfo>,
                    response: Response<FinanceInfo>
                ) {
                    if (response.isSuccessful) {
                        continuation.resume(response.body()) { }
                    } else {
                        continuation.resume(null) { }
                    }
                }

                override fun onFailure(call: Call<FinanceInfo>, t: Throwable) {
                    continuation.resume(null) { }
                }
            })
        }
    }

    override suspend fun getOldData(
        id: String,
        startDate: String,
        endDate: String
    ): Resource<List<FinanceInfoFull>> {
        val authService = retrofitAuth.create(MagniseApi::class.java)
            .getOldData(instrumentId = id, startDate = startDate, endDate = endDate)
        val data = getFinanceAsync(authService)
        return if (data != null) {
            Resource.Success(data.data)
        } else {
            Resource.Error("Failed to fetch historical prices")
        }
    }

    override fun realTimeWebSocket(id: String, socketListener: SocketListener) {
        val request = Request.Builder()
            .url(WSS_URL)
            .addHeader("Authorization", "Bearer $TOKEN")
            .build()

        webSocket = OkHttpClient().newWebSocket(request, object : WebSocketListener() {

            override fun onOpen(webSocket: WebSocket, response: okhttp3.Response) {
                sendEvent(id)
            }

            override fun onMessage(webSocket: WebSocket, text: String) {
                socketListener.onNewMessage(text)
            }

            override fun onMessage(webSocket: WebSocket, bytes: ByteString) {
            }

            override fun onClosing(webSocket: WebSocket, code: Int, reason: String) {
                closeWebSocket()
            }

            override fun onClosed(webSocket: WebSocket, code: Int, reason: String) {

            }

            override fun onFailure(
                webSocket: WebSocket,
                t: Throwable,
                response: okhttp3.Response?
            ) {
                socketListener.onError(t.toString())
            }
        })
    }

    override fun closeWebSocket() {
        webSocket.close(1000, null)
    }

    fun sendEvent(id: String) {
        val event = JSONObject().apply {
            put("type", "l1-subscription")
            put("id", "1")
            put("instrumentId", id)
            put("provider", "oanda")
            put("subscribe", true)
            put("kinds", JSONArray(listOf("last")))
        }
        webSocket.send(event.toString())
    }
}

