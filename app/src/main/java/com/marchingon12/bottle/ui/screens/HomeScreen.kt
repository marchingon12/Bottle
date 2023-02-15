package com.marchingon12.bottle.ui.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Settings
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.marchingon12.bottle.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(
    navController: NavController,
    navigateToSettings: () -> Unit = {},
) {
    // Navigation values
    val onBackPressed: () -> Unit = { navController.popBackStack() }

    Scaffold(
        modifier = Modifier
            .fillMaxSize(),
        topBar = {
            CenterAlignedTopAppBar(
                title = {
                    Text(
                        "Bottle",
                        maxLines = 1,
                        overflow = TextOverflow.Ellipsis
                    )
                },
                actions = {
                    IconButton(onClick = { navigateToSettings() }) {
                        Icon(
                            imageVector = Icons.Rounded.Settings,
                            contentDescription = stringResource(
                                id = R.string.settings_button
                            )
                        )
                    }
                }
            )
        }
    )
    {
        LazyColumn(
            // consume insets as scaffold doesn't do it by default
            modifier = Modifier.padding(it),
        ) {
            item {
                Box(
                    Modifier
                        .fillMaxWidth()

                        .padding(50.dp)
                ) {
                    Text(text = "hello world", modifier = Modifier.align(Alignment.Center))
                }
            }
        }
    }

}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun HomePreview() {
    HomeScreen(navController = rememberNavController())
}
