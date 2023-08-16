package com.nx.nxfq.component

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.nx.nxfq.core.Constant.HEAD_NAME

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopAppBarQ() {
    TopAppBar(
        title = {
            Text(
                text = HEAD_NAME,
                fontSize = 28.sp,
                fontWeight = FontWeight.ExtraBold,
                fontStyle = FontStyle.Italic
            )
        }
    )
}