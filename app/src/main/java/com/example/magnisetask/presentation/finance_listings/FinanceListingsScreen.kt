package com.example.magnisetask.presentation.finance_listings

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.HorizontalDivider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.magnisetask.presentation.destinations.CompanyInfoScreenDestination
import com.ramcosta.composedestinations.annotation.Destination
import com.ramcosta.composedestinations.navigation.DestinationsNavigator

@Composable
@Destination(start = true)
fun FinanceListingsScreen(
    navigator: DestinationsNavigator,
    viewModel: FinanceListingsViewModel = hiltViewModel()
) {
    val state = viewModel.state
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        LazyColumn(
            modifier = Modifier.fillMaxSize()
        ) {
            items(state.companies.size) { i ->
                val finance = state.companies[i]
                FinanceItem(
                    finance = finance,
                    modifier = Modifier
                        .fillMaxWidth()
                        .clickable {
                            val stringVal =
                                "${finance.baseCurrency},${finance.symbol},${finance.currency},${finance.kind},${finance.id}"

                            navigator.navigate(
                                CompanyInfoScreenDestination(stringVal)
                            )
                        }
                        .padding(16.dp)
                )
                if (i < state.companies.size) {
                    HorizontalDivider(
                        modifier = Modifier.padding(
                            horizontal = 16.dp
                        )
                    )
                }
            }
        }
    }
}