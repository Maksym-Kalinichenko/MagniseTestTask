package com.example.magnisetask.presentation.finance_info

import com.example.magnisetask.domain.model.FinanceInfoFull

data class FinanceInfoState(
    val financeInfos: List<FinanceInfoFull> = emptyList(),
    val finance: String? = null,
    val isLoading: Boolean = false,
    val error: String? = null
)
