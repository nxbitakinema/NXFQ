package com.nx.nxfq.presentation.qoute_screen.component

import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Clear
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun DeleteIcon(
    deleteQoute: () -> Unit
) {
    IconButton(
        onClick = deleteQoute,
    ) {
        Icon(
            imageVector = Icons.Rounded.Clear,
            contentDescription = null,
            tint = Color.LightGray,
            modifier = Modifier.size(14.dp)
        )
    }
}