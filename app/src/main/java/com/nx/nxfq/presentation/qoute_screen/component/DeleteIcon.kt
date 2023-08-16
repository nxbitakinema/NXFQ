package com.nx.nxfq.presentation.qoute_screen.component

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import com.nx.nxfq.core.Constant.DELETE_QOUTE

@Composable
fun DeleteIcon(
    deleteQoute: () -> Unit
) {
    IconButton(
        onClick = deleteQoute
    ) {
        Icon(
            imageVector = Icons.Default.Close,
            contentDescription = DELETE_QOUTE
        )
    }
}