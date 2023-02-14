package com.marchingon12.bottle.ui.screens

import android.content.res.Resources.Theme
import android.provider.Settings
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.MaterialTheme.colorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.marchingon12.bottle.ui.common.Route
import com.marchingon12.bottle.ui.common.homeNavGraph
import com.marchingon12.bottle.ui.common.settingsNavGraph
import com.marchingon12.bottle.ui.screens.settings.SettingsScreen
import com.marchingon12.bottle.ui.screens.settings.about.AboutScreen
import com.marchingon12.bottle.ui.screens.settings.appearance.ThemeScreen
import com.marchingon12.bottle.ui.screens.settings.directory.DownloadSettingsScreen
import com.marchingon12.bottle.ui.screens.settings.general.GeneralSettingsScreen
import com.marchingon12.bottle.ui.screens.settings.security.SecuritySettingsScreen

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
