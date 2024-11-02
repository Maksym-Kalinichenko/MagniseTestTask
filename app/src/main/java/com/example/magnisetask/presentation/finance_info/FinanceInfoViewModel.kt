package com.example.magnisetask.presentation.finance_info

import android.annotation.SuppressLint
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.magnisetask.data.remote.SocketListener
import com.example.magnisetask.domain.model.FinanceInfoFull
import com.example.magnisetask.domain.model.RealtimeDataSnapShot
import com.example.magnisetask.domain.model.RealtimeDataUpdate
import com.example.magnisetask.domain.repository.MagniseRepository
import com.example.magnisetask.util.Resource
import com.example.magnisetask.util.TimeFormat
import com.google.gson.Gson
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import java.time.Instant
import java.time.LocalDate
import java.time.LocalDateTime
import java.time.OffsetDateTime
import java.time.ZoneId
import java.time.format.DateTimeFormatter
import javax.inject.Inject

@HiltViewModel
class FinanceInfoViewModel @Inject constructor(
    private val savedStateHandle: SavedStateHandle,
    private val repository: MagniseRepository
) : ViewModel(), SocketListener {

    var state by mutableStateOf(FinanceInfoState())

    private val _dateFlow = MutableStateFlow("")
    val dateFlow: StateFlow<String> = _dateFlow.asStateFlow()

    private val _calendarData = MutableStateFlow(0L)
    val calendarData: StateFlow<Long> = _calendarData.asStateFlow()

    private val _realtimeData = MutableStateFlow(0.0)
    val realtimeData: StateFlow<Double> = _realtimeData.asStateFlow()

    init {
        viewModelScope.launch(Dispatchers.IO) {
            val finance = savedStateHandle.get<String>("finance") ?: return@launch
            val data = finance.split(",").toTypedArray()

            updateData(data, repository.getFinanceInfo(data[4]), TimeFormat.MINUTE)
            repository.realTimeWebSocket(data[4], this@FinanceInfoViewModel)
            while (true) {
                if (calendarData.value != 0L) {
                    val startDate = dateFromLong(calendarData.value)
                    val endDate = dateFromLong(calendarData.value + 86400000)
                    val currentDate =
                        LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"))
                    if (currentDate != startDate) {
                        _dateFlow.value = startDate
                        updateData(
                            data,
                            repository.getOldData(data[4], startDate, endDate),
                            TimeFormat.HOUR
                        )
                        _realtimeData.value = setNewPrice()
                    } else {
                        _calendarData.value = 0L
                    }
                    delay(3000)
                } else {
                    _dateFlow.value = LocalDateTime.now()
                        .format(DateTimeFormatter.ofPattern("MMM, d, h:mm a"))
                    delay(1000)
                    updateData(data, repository.getFinanceInfo(data[4]), TimeFormat.MINUTE)
                }
            }
        }
    }

    override fun onNewMessage(message: String) {
        try {
            _realtimeData.value = if (calendarData.value == 0L) {
                if (message.contains("l1-update"))
                    Gson().fromJson(message, RealtimeDataUpdate::class.java).last.price
                else
                    Gson().fromJson(message, RealtimeDataSnapShot::class.java).quote.last.price
            } else setNewPrice()
        } catch (_: Exception) {
        }
    }

    override fun onError(error: String) {

    }

    private fun setNewPrice(): Double =
        if (state.financeInfos.isNotEmpty())
            (state.financeInfos[state.financeInfos.size - 1].c)
        else 0.0

    private suspend fun updateData(
        data: Array<String>,
        function: Resource<List<FinanceInfoFull>>,
        format: TimeFormat
    ) {
        withContext(Dispatchers.Main) {
            state = state.copy(isLoading = true)
        }
        if (data.isNotEmpty()) {
            withContext(Dispatchers.Main) {
                when (function) {
                    is Resource.Success -> {
                        function.data?.let {
                            state.copy(
                                financeInfos = editList(function.data, format),
                                isLoading = false,
                                finance = data[1],
                                error = null
                            ).also { state = it }
                        }
                    }

                    is Resource.Error -> {
                        state = state.copy(
                            isLoading = false, error = function.message, finance = null
                        )
                    }

                    else -> Unit
                }
            }
        }
    }

    private fun editList(
        result: List<FinanceInfoFull>,
        format: TimeFormat
    ): List<FinanceInfoFull> {
        val list = result.map { list ->
            list.copy(t = makeTime(list.t, format))
        }
        return list
    }

    private fun makeTime(utcTimeString: String, format: TimeFormat): String {
        val utcTime = OffsetDateTime.parse(utcTimeString)
        val localTime = utcTime.atZoneSameInstant(ZoneId.systemDefault())
        return when (format) {
            TimeFormat.HOUR -> localTime.hour.toString()
            TimeFormat.MINUTE -> localTime.minute.toString()
        }
    }

    @SuppressLint("NewApi")
    private fun dateFromLong(timestamp: Long): String {
        val localDate = LocalDate.ofInstant(Instant.ofEpochMilli(timestamp), ZoneId.systemDefault())
        val formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd")
        return localDate.format(formatter)
    }

    fun closeWebSocket() {
        repository.closeWebSocket()
    }

    fun updateCalendarData(it: Long) {
        _calendarData.value = it
    }


}