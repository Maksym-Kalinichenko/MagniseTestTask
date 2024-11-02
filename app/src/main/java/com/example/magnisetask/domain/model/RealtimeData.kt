package com.example.magnisetask.domain.model

data class RealtimeDataUpdate(
    val type: String = "",
    val instrumentId: String = "",
    val provider: String = "",
    val last: LastData = LastData()
)

data class LastData(
    val timestamp: String = "",
    val price: Double = 0.0,
    val volume: Double = 0.0,
    val change: Double = 0.0,
    val changePct: Double = 0.0,
)

data class RealtimeDataSnapShot(
    val type: String = "",
    val instrumentId: String = "",
    val provider: String = "",
    val quote: Quote = Quote(),
    val change: Double = 0.0,
    val changePct: Double = 0.0,
)

data class Quote(
    val ask: Data = Data(),
    val bid: Data = Data(),
    val last: Data = Data(),
)

data class Data(
    val timestamp: String = "",
    val price: Double = 0.0,
    val volume: Double = 0.0,
)
