package com.example.magnisetask.presentation

import com.example.magnisetask.presentation.destinations.*

/**
 * Class generated if any Composable is annotated with `@Destination`.
 * It aggregates all [TypedDestination]s in their [NavGraph]s.
 */
object NavGraphs {

    val root = NavGraph(
        route = "root",
        startDestination = FinanceListingsScreenDestination,
        destinations = listOf(
            CompanyInfoScreenDestination,
			FinanceListingsScreenDestination
        )
    )
}