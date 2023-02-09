package com.marchingon12.bottle.ui.screens.settings

import androidx.compose.runtime.Composable
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material.icons.*
import androidx.compose.material.icons.filled.*
import androidx.compose.material.icons.outlined.*

import androidx.compose.material3.*
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.res.stringResource
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.marchingon12.bottle.ui.components.SettingsItem
import com.marchingon12.bottle.ui.common.Route
import com.marchingon12.bottle.R

@OptIn(ExperimentalMaterial3Api::class)
@ExperimentalMaterial3Api
@Composable
fun SettingsScreen(navController: NavController) {
    val scrollBehavior = TopAppBarDefaults.exitUntilCollapsedScrollBehavior()
    Scaffold(
        modifier = Modifier
            .fillMaxSize()
            .nestedScroll(scrollBehavior.nestedScrollConnection),
        topBar = {
            LargeTopAppBar(
                title = {
                    Text(
                        "Settings",
                        maxLines = 1,
                        overflow = TextOverflow.Ellipsis
                    )
                },
                navigationIcon = {
                    IconButton(modifier = Modifier, onClick = { navController.navigateUp() }) {
                        Icon(
                            imageVector = Icons.Filled.ArrowBack,
                            contentDescription = stringResource(id = R.string.back_button)
                        )
                    }
                },
                scrollBehavior = scrollBehavior
            )
        }) {

        LazyColumn(
            Modifier.padding(it),
        ) {
            item {
                SettingsItem(
                    title = stringResource(id = R.string.general_settings),
                    description = stringResource(
                        id = R.string.general_settings_desc
                    ),
                    icon = Icons.Outlined.Tune
                ) {
                    navController.navigate(Route.GENERAL) {
                        launchSingleTop = true
                    }
                }
            }
            item {
                SettingsItem(
                    title = stringResource(id = R.string.appearance),
                    description = stringResource(
                        id = R.string.appearance_desc
                    ),
                    icon = Icons.Outlined.Palette
                ) {
                    navController.navigate(Route.APPEARANCE) {
                        launchSingleTop = true
                    }
                }
            }
            item {
                SettingsItem(
                    title = stringResource(id = R.string.directory),
                    description = stringResource(
                        id = R.string.directory_desc
                    ),
                    icon = Icons.Outlined.Folder
                ) {
                    navController.navigate(Route.DIRECTORY) {
                        launchSingleTop = true
                    }
                }
            }
            item {
                SettingsItem(
                    title = stringResource(id = R.string.security),
                    description = stringResource(
                        id = R.string.security_desc
                    ),
                    icon = Icons.Outlined.Shield
                ) {
                    navController.navigate(Route.SECURITY) {
                        launchSingleTop = true
                    }
                }
            }
            item {
                SettingsItem(
                    title = stringResource(id = R.string.about),
                    description = stringResource(
                        id = R.string.about_desc
                    ),
                    icon = Icons.Outlined.Info
                ) {
                    navController.navigate(Route.ABOUT) {
                        launchSingleTop = true
                    }
                }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Preview
@Composable
fun SettingsPreview() {
    SettingsScreen(navController = rememberNavController())
}