package com.marchingon12.bottle.ui.screens.settings.about

// TODO: add components for transparent social icon buttons on screen below

import android.provider.Settings
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.twotone.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.platform.LocalUriHandler
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.marchingon12.bottle.R
import com.marchingon12.bottle.ui.common.Route
import com.marchingon12.bottle.ui.components.SettingsItem

// Links and shit
private const val repoUrl = "https://github.com/marchingon12/Bottle/"
private const val releasesUrl = repoUrl + "releases"
private const val issuesUrl = repoUrl + "issues"
private const val changelogUrl = repoUrl + "blob/master/CHANGELOG.md"
private const val privacyUrl = repoUrl + "blob/master/Privacy-Policy.md"
private const val discordUrl = "https://dsc.gg/the-cattery"


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AboutScreen(
    navController: NavController,
    onBackPressed: () -> Unit,
    onOpenChangelogDialog: () -> Unit,
    onNavigateToCreditsPage: () -> Unit,
    onNavigateToUpdatePage: () -> Unit
) {

    // Url opener
    val uriHandler = LocalUriHandler.current
    fun openUrl(url: String) {
        uriHandler.openUri(url)
    }

    val scrollBehavior = TopAppBarDefaults.exitUntilCollapsedScrollBehavior(
        rememberTopAppBarState(),
        canScroll = { true }
    )

    Scaffold(modifier = Modifier
        .fillMaxSize()
        .nestedScroll(scrollBehavior.nestedScrollConnection),
        topBar = {
            LargeTopAppBar(
                title = {
                    Text(text = stringResource(id = R.string.about))
                },
                navigationIcon = {
                    IconButton(
                        modifier = Modifier,
                        onClick = { onBackPressed() }
                    ) {
                        Icon(
                            imageVector = Icons.Filled.ArrowBack,
                            contentDescription = stringResource(id = R.string.back_button)
                        )
                    }
                },
                scrollBehavior = scrollBehavior
            )
        }) {

        LazyColumn(modifier = Modifier.padding(it)) {
            item {
                SettingsItem(
                    title = stringResource(id = R.string.discord),
                    description = "Join the support server",
                    icon = Icons.TwoTone.Gamepad
                ) {
                    openUrl(discordUrl)
                }
            }
            item {
                SettingsItem(
                    title = stringResource(id = R.string.gh_issue),
                    description = "Submit an issue",
                    icon = Icons.TwoTone.BugReport
                ) {
                    openUrl(issuesUrl)
                }
            }
            item {
                SettingsItem(
                    title = stringResource(id = R.string.version),
                    description = "placeholder",
                    icon = Icons.TwoTone.Info
                ) {
                    //TODO: copy devices & app info to clipboard
                }
            }
            item {
                SettingsItem(
                    title = stringResource(id = R.string.changelog) ,
                    description = "See latest changelog notes",
                    icon = Icons.TwoTone.NewReleases) {
                    //TODO: bottom sheet dialogue changelog
                    onOpenChangelogDialog()
                }
            }
            item {
                SettingsItem(
                    title = stringResource(id = R.string.credits),
                    description = "Open Source Licenses & ",
                    icon = Icons.TwoTone.Bookmarks
                ) {
                    onNavigateToCreditsPage()
                }
            }
            item {
                SettingsItem(
                    title = stringResource(id = R.string.updates),
                    description = "placeholder",
                    icon = Icons.TwoTone.Update
                ) {
                    onNavigateToUpdatePage()
                }
            }
            item {
                SettingsItem(
                    title = stringResource(id = R.string.donation),
                    description = "Buy us a cup of tea!",
                    icon = Icons.TwoTone.VolunteerActivism
                ) {

                }
            }
            item { 
                SettingsItem(
                    title = stringResource(id = R.string.help), 
                    description = "How to use Bottle",
                    icon = Icons.TwoTone.TipsAndUpdates) {
                    //TODO: Open welcome dialogue
                }
            }
        }
    }
}

