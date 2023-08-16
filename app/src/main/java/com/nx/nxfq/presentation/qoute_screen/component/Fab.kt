package com.nx.nxfq.presentation.qoute_screen.component

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable

@Composable
fun Fab(
    openDialog: () -> Unit
) {
    FloatingActionButton(
        onClick = openDialog
    ) {
        Icon(
            imageVector = Icons.Default.Add,
            contentDescription = null
        )
    }
}