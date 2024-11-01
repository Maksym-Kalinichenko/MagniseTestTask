package com.example.magnisetask.domain.model

data class TokenResponse(
    val access_token: String,
    val expires_in: Int,
    val refresh_expires_in: Int,
    val refresh_token: String,
    val token_type: String
)

data class InstrumentsResponse(
    val paging: Paging,
    val data: List<Instrument>
)

data class Paging(
    val page: Int,
    val pages: Int,
    val items: Int
)

data class Instrument(
    val id: String,
    val symbol: String,
    val kind: String,
    val description: String,
    val tickSize: Double,
    val currency: String,
    val baseCurrency: String,
)
