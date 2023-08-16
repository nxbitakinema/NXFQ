package com.nx.nxfq.presentation.qoute_screen.component

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.nx.nxfq.domain.repository.Qoutes

@Composable
fun QouteContent(
    padding: PaddingValues,
    qoutes: Qoutes,
    deleteQoute: (qouteId: String) -> Unit
) {
    LazyColumn(
        modifier = Modifier.padding(padding)
    ) {
        items(
            items = qoutes
        ) { xxx ->
            QouteCard(
                qoute = xxx,
                deleteQoute = {
                    xxx.id?.let { qouteId -> deleteQoute(qouteId) }
                }
            )
        }
    }
}