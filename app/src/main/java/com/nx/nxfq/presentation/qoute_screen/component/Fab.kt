package com.nx.nxfq.presentation.qoute_screen.component

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.FloatingActionButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.SmallFloatingActionButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun Fab(
    openDialog: () -> Unit
) {
    SmallFloatingActionButton(
        onClick = openDialog,
        containerColor = Color.White,
        elevation = FloatingActionButtonDefaults.elevation(0.dp)
    ) {
        Icon(
            imageVector = Icons.Default.Add,
            contentDescription = null
        )
    }

}