package com.nx.nxfq.presentation.qoute_screen.component

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp

@Composable
fun QouteText(
    qouteText: String
) {
    Text(
        text = qouteText,
        color = Color.DarkGray,
        fontWeight = FontWeight.ExtraBold,
        fontSize = 28.sp,
        fontStyle = FontStyle.Italic,
        textAlign = TextAlign.End
    )
}