package com.example.magnisetask.data.remote

import com.example.magnisetask.domain.model.FinanceInfo
import com.example.magnisetask.domain.model.InstrumentsResponse
import com.example.magnisetask.domain.model.TokenResponse
import retrofit2.Call
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path
import retrofit2.http.Query

interface MagniseApi {

    @FormUrlEncoded
    @POST("/identity/realms/{realm}/protocol/openid-connect/token")
    fun getToken(
        @Path("realm") realm: String = REALM,
        @Field("client_id") client_id: String = CLIENT_ID,
        @Field("grant_type") grantType: String = GRAND_TYPE,
        @Field("username") username: String = USERNAME,
        @Field("password") password: String = PASSWORD
    ): Call<TokenResponse>

    @GET("/api/instruments/v1/instruments")
    fun getInstruments(
        @Query("provider") provider: String = PROVIDER,
        @Query("kind") kind: String = KIND
    ): Call<InstrumentsResponse>

    @GET("/api/bars/v1/bars/count-back")
    fun getFinanceInfo(
        @Query("instrumentId") instrumentId: String,
        @Query("provider") provider: String = PROVIDER,
        @Query("interval") interval: Int = INTERVAL,
        @Query("periodicity") periodicity: String = PERIODICITY_M,
        @Query("barsCount") barsCount: Int = BARS_COUNT
    ): Call<FinanceInfo>

    @GET("/api/bars/v1/bars/date-range")
    fun getOldData(
        @Query("instrumentId") instrumentId: String,
        @Query("provider") provider: String = PROVIDER,
        @Query("interval") interval: Int = INTERVAL,
        @Query("periodicity") periodicity: String = PERIODICITY_H,
        @Query("startDate") startDate: String,
        @Query("endDate") endDate: String
    ): Call<FinanceInfo>

    companion object {
        const val REALM = "fintatech"
        const val GRAND_TYPE = "password"
        const val CLIENT_ID = "app-cli"
        const val USERNAME = "r_test@fintatech.com"
        const val PASSWORD = "kisfiz-vUnvy9-sopnyv"
        const val PROVIDER = "oanda"
        const val KIND = "forex"
        const val BASE_URL = "https://platform.fintacharts.com"
        const val PERIODICITY_M = "minute"
        const val PERIODICITY_H = "hour"
        const val INTERVAL = 1
        const val BARS_COUNT = 10
        const val WSS_URL = "wss://platform.fintacharts.com/api/streaming/ws/v1/realtime"
        lateinit var TOKEN: String
    }

}

