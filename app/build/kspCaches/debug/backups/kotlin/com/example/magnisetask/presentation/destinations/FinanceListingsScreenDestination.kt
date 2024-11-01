package com.example.magnisetask.presentation.destinations

import androidx.compose.runtime.Composable
import androidx.navigation.NavBackStackEntry
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.navArgument
import com.ramcosta.composedestinations.navigation.DestinationDependenciesContainer
import com.ramcosta.composedestinations.navargs.DestinationsStringNavType
import com.ramcosta.composedestinations.spec.Direction
import com.example.magnisetask.presentation.finance_listings.FinanceListingsScreen
import com.ramcosta.composedestinations.navigation.DestinationsNavController

object FinanceListingsScreenDestination : DirectionDestination {
         
    operator fun invoke() = this
    
    override val route = "finance_listings_screen"
    
    @Composable
    override fun Content(
        navController: NavHostController,
        navBackStackEntry: NavBackStackEntry,
        dependencyContainer: DestinationDependenciesContainer
    ) {
		FinanceListingsScreen(
			navigator = DestinationsNavController(navController, navBackStackEntry)
		)
    }
    
}