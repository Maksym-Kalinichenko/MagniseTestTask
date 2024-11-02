package com.example.magnisetask.presentation.destinations

import androidx.compose.runtime.Composable
import androidx.navigation.NavBackStackEntry
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.navArgument
import com.ramcosta.composedestinations.navigation.DestinationDependenciesContainer
import com.ramcosta.composedestinations.navargs.DestinationsStringNavType
import com.ramcosta.composedestinations.spec.Direction
import androidx.compose.runtime.remember
import androidx.lifecycle.SavedStateHandle
import com.example.magnisetask.presentation.finance_info.CompanyInfoScreen
import com.ramcosta.composedestinations.navigation.DestinationsNavController

object CompanyInfoScreenDestination : TypedDestination<CompanyInfoScreenDestination.NavArgs> {
         
    operator fun invoke(
		finance: String,
    ): Direction {
        return object : Direction {
            override val route = "company_info_screen" + 
					"/${DestinationsStringNavType.encodeForRoute(finance, true)}"
        }
    }
    
    override val route = "company_info_screen/{finance}"
    
	override val arguments get() = listOf(
		navArgument("finance") {
			type = DestinationsStringNavType
		}
	)

    @Composable
    override fun Content(
        navController: NavHostController,
        navBackStackEntry: NavBackStackEntry,
        dependencyContainer: DestinationDependenciesContainer
    ) {
		val (finance) = remember { argsFrom(navBackStackEntry) }
		CompanyInfoScreen(
			finance = finance, 
			navigator = DestinationsNavController(navController, navBackStackEntry)
		)
    }
                    
	override fun argsFrom(navBackStackEntry: NavBackStackEntry): NavArgs {
	    return NavArgs(
			finance = navBackStackEntry.arguments?.getString("finance") ?: throw RuntimeException("'finance' argument is mandatory, but was not present!"),
	    )
	}
                
	override fun argsFrom(savedStateHandle: SavedStateHandle): NavArgs {
	    return NavArgs(
			finance = savedStateHandle.get<String>("finance") ?: throw RuntimeException("'finance' argument is mandatory, but was not present!"),
	    )
	}

	data class NavArgs(
		val finance: String,
	)
}