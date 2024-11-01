package com.example.magnisetask.domain.repository

import com.example.magnisetask.domain.model.FinanceInfoFull
import com.example.magnisetask.domain.model.Instrument
import com.example.magnisetask.util.Resource
import kotlinx.coroutines.flow.Flow

interface MagniseRepository {

    suspend fun getFinanceListings(): Flow<Resource<List<Instrument>>>
    suspend fun getFinanceInfo(id: String): Resource<List<FinanceInfoFull>>
    suspend fun getOldData(
        id: String,
        startDate: String,
        endDate: String
    ): Resource<List<FinanceInfoFull>>

}