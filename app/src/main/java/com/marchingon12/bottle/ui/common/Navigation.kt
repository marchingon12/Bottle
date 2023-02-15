package com.marchingon12.bottle.ui.common

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun NavigationController(
    navController: NavHostController
) {
    // Navigation values
    val onBackPressed: () -> Unit = { navController.navigateUp() }

    Box(
        modifier = Modifier
            .fillMaxSize()
    ) {
        NavHost(
            modifier = Modifier
                .fillMaxWidth(1f)
                .align(Alignment.Center),
            navController = navController,
            startDestination = Route.HOME_GRAPH,
            route = Route.ROOT
        ) {
            homeNavGraph(navController = navController)
            settingsNavGraph(navController = navController, onBackPressed = onBackPressed)
        }
    }
}
