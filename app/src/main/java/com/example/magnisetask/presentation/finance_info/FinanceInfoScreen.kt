package com.example.magnisetask.presentation.finance_info

import android.annotation.SuppressLint
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.Center
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import com.ramcosta.composedestinations.annotation.Destination

@SuppressLint("NewApi")
@Composable
@Destination
fun CompanyInfoScreen(
    finance: String,
    viewModel: FinanceInfoViewModel = hiltViewModel()
) {
    val state = viewModel.state
    val date by viewModel.dateFlow.collectAsState()
    val calendarData = viewModel.calendarData.collectAsState()
    val minuteColor = remember { mutableStateOf(Color.Yellow) }
    val hourColor = remember { mutableStateOf(Color.White) }
    val symbol = remember(date) {
        derivedStateOf { state.finance.toString() }
    }
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background)
            .padding(16.dp)
            .verticalScroll(rememberScrollState())
    ) {
        if (calendarData.value == 0L) {
            minuteColor.value = Color.Yellow
            hourColor.value = Color.White
        } else {
            minuteColor.value = Color.White
            hourColor.value = Color.Yellow
        }
        Text(
            text = symbol.value,
            fontWeight = FontWeight.Bold,
            fontSize = 18.sp,
            overflow = TextOverflow.Ellipsis,
            modifier = Modifier
                .fillMaxWidth()
                .border(BorderStroke(1.dp, Color.White))
                .padding(10.dp)
        )
        Spacer(modifier = Modifier.height(8.dp))
        Text(
            text = "Market Data:",
            fontSize = 18.sp,
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(8.dp))
        Row(
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .fillMaxWidth()
                .border(BorderStroke(1.dp, Color.White))
                .padding(10.dp),
        ) {
            TextColumn("Symbol", symbol.value)
            TextColumn(
                "Price",
                if (state.financeInfos.isNotEmpty()) (state.financeInfos[state.financeInfos.size - 1].c).toString() else "0"
            )
            TextColumn("Time", date)
        }
        Spacer(modifier = Modifier.height(8.dp))
        Text(
            text = "Charting Data:",
            fontSize = 18.sp,
            modifier = Modifier
                .fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(8.dp))
        if (state.financeInfos.isNotEmpty()) {
            Spacer(modifier = Modifier.height(16.dp))
            Row(modifier = Modifier.fillMaxWidth()) {
                Text(text = "Time: ")
                Text(text = "1m ", color = minuteColor.value)
                Text(text = " 1h", color = hourColor.value)
            }
            Spacer(modifier = Modifier.height(50.dp))
            FinanceChart(
                infos = state.financeInfos,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(250.dp)
                    .align(CenterHorizontally)
            )
        }
        Spacer(modifier = Modifier.height(8.dp))
        DatePicker({ viewModel.updateCalendarData(it) }, {})
    }

    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Center
    ) {
        if (state.isLoading) {
            CircularProgressIndicator()
        } else if (state.error != null) {
            Text(
                text = state.error,
                color = MaterialTheme.colorScheme.error
            )
        }
    }
}

@Composable
fun RowScope.TextColumn(name: String, text: String) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .weight(1f),
        horizontalAlignment = CenterHorizontally
    ) {
        Text(
            text = name,
            fontSize = 12.sp,
            maxLines = 1
        )
        Text(
            text = text,
            fontSize = 12.sp,
            maxLines = 1
        )
    }
}