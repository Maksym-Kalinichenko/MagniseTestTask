package com.example.magnisetask.presentation.finance_listings

import com.example.magnisetask.domain.model.Instrument

data class FinanceListingsState(
    val companies: List<Instrument> = emptyList(),
    val isLoading: Boolean = false,
    val isRefreshing: Boolean = false
)
