package com.marchingon12.bottle.ui.common

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import androidx.navigation.navArgument
import com.marchingon12.bottle.ui.screens.settings.SettingsScreen
import com.marchingon12.bottle.ui.screens.settings.about.AboutScreen
import com.marchingon12.bottle.ui.screens.settings.about.CreditsScreen
import com.marchingon12.bottle.ui.screens.settings.about.UpdateScreen
import com.marchingon12.bottle.ui.screens.settings.appearance.ThemeScreen
import com.marchingon12.bottle.ui.screens.settings.directory.DownloadSettingsScreen
import com.marchingon12.bottle.ui.screens.settings.general.GeneralSettingsScreen
import com.marchingon12.bottle.ui.screens.settings.security.SecuritySettingsScreen

@OptIn(ExperimentalMaterial3Api::class)
fun NavGraphBuilder.settingsNavGraph(
    navController: NavHostController,
    onBackPressed: () -> Unit = {},
) {
    navigation(
        startDestination = Route.SETTINGS,
        route = Route.SETTINGS_GRAPH
    ) {
        composable(Route.SETTINGS) {
            SettingsScreen(navController = navController)
        }
        composable(Route.GENERAL) {
            GeneralSettingsScreen(navController = navController)
        }
        composable(Route.APPEARANCE) {
            ThemeScreen(navController = navController)
        }
        composable(Route.DIRECTORY) {
            DownloadSettingsScreen(navController = navController)
        }
        composable(Route.SECURITY) {
            SecuritySettingsScreen(navController = navController)
        }
        composable(Route.CREDITS) { CreditsScreen { onBackPressed() } }
        composable(Route.AUTO_UPDATE) { UpdateScreen { onBackPressed() } }
        composable(Route.ABOUT) {
            AboutScreen(
                navController = navController,
                onBackPressed = onBackPressed,
                onNavigateToCreditsPage = { navController.navigate(Route.CREDITS) },
                onNavigateToUpdatePage = { navController.navigate(Route.AUTO_UPDATE) }
            )
        }

    }
}