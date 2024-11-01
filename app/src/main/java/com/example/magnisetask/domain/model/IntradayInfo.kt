package com.example.magnisetask.domain.model


data class FinanceInfo(
    val data: List<FinanceInfoFull>?
)

data class FinanceInfoFull(
    val t: String,  //time
    val o: Double,  //open
    val h: Double,  //high
    val l: Double,  //low
    val c: Double,  //close
    val v: Double   //volume
)