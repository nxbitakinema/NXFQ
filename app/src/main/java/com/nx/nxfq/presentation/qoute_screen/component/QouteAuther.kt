package com.nx.nxfq.presentation.qoute_screen.component

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.sp

@Composable
fun QouteAuther(
    qouteAuther: String
) {
    Text(
        text = qouteAuther,
        fontSize = 12.sp,
        color = Color.DarkGray
    )
}