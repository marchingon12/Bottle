package com.marchingon12.bottle.ui.common

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.marchingon12.bottle.ui.screens.HomeScreen

fun NavGraphBuilder.homeNavGraph(
    navController: NavHostController,
) {
    navigation(
        startDestination = Route.HOME,
        route = Route.HOME_GRAPH
    ) {
        composable(Route.HOME) {
            HomeScreen(
                navigateToSettings = { navController.navigate(Route.SETTINGS) },
                navController = navController
            )
        }
    }
}