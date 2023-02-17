package com.marchingon12.bottle.ui.screens.settings.about

import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.NewReleases
import androidx.compose.runtime.Composable
import androidx.compose.material3.*
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.marchingon12.bottle.R


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ChangelogDialog(onClick: () -> Unit) {

    // Changelog Dialog
    AlertDialog(
        onDismissRequest = onClick,
        icon = { Icon(Icons.Filled.NewReleases, contentDescription = null) },
        title = { Text(text = stringResource(id = R.string.changelog)) },
        text = {
            Text(
                text = stringResource(id = R.string.changelog_desc)
            )
        },
        confirmButton = {
            TextButton(
                onClick = {
                    onClick()
                }
            ) { Text("Confirm") }
        },
        dismissButton = {
            TextButton(
                onClick = {
                    onClick()
                }
            ) { Text("Dismiss") }
        }
    )
}


@Preview
@Composable
fun ChangelogDialogPreview() {
    /*ChangelogDialog()*/
}