package com.marchingon12.bottle.ui.screens.settings.about

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.NewReleases
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.marchingon12.bottle.R

@Composable
fun DonationDialog(onClick: () -> Unit) {
    // Donation Dialog
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