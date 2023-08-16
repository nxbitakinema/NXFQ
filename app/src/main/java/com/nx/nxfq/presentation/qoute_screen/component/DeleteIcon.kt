package com.nx.nxfq.presentation.qoute_screen.component

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.ArrowDropDown
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import com.nx.nxfq.core.Constant.DELETE_QOUTE

@Composable
fun DeleteIcon(
    deleteQoute: () -> Unit
) {
    IconButton(
        onClick = deleteQoute,
    ) {
        Icon(
            imageVector = Icons.Outlined.ArrowDropDown,
            contentDescription = DELETE_QOUTE,
            tint = Color.LightGray
        )
    }
}