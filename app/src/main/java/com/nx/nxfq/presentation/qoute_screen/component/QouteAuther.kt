package com.nx.nxfq.presentation.qoute_screen.component

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

@Composable
fun QouteAuther(
    qouteAuther: String
) {
    Text(
        text = qouteAuther,
        color = Color.Gray,
        fontWeight = FontWeight.Bold,
        fontSize = 22.sp,
        fontStyle = FontStyle.Italic
    )
}