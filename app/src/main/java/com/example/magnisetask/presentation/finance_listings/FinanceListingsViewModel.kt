package com.example.magnisetask.presentation.finance_listings

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.magnisetask.util.Resource
import com.example.magnisetask.domain.repository.MagniseRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class FinanceListingsViewModel @Inject constructor(
    private val repository: MagniseRepository
) : ViewModel() {

    var state by mutableStateOf(FinanceListingsState())

    init {
        getCompanyListings()
    }

    private fun getCompanyListings() {
        viewModelScope.launch {
            repository
                .getFinanceListings()
                .collect { result ->
                    when (result) {
                        is Resource.Success -> {
                            result.data?.let { listings ->
                                state = state.copy(
                                    companies = listings
                                )
                            }
                        }

                        is Resource.Error -> Unit
                        is Resource.Loading -> {
                            state = state.copy(isLoading = result.isLoading)
                        }
                    }
                }
        }
    }
}