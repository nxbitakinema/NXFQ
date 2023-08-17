package com.nx.nxfq.presentation.qoute_screen.component

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.ExperimentalTextApi
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

@OptIn(ExperimentalTextApi::class)
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


        //  this is text - gradient color

//        style = TextStyle(
//            brush = Brush.linearGradient(
//                colors = listOf(Color.Magenta, Color.Cyan) ))


    )
}


