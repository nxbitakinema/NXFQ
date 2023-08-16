package com.nx.nxfq.presentation.qoute_screen.component

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.nx.nxfq.domain.model.Qoute

@Composable
fun QouteCard(
    qoute: Qoute,
    deleteQoute: () -> Unit
) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(all = 14.dp)
            //.height(500.dp)
    ) {
        Row(
            modifier = Modifier.fillMaxWidth().padding(14.dp)
        ) {
            Column {
                QouteText(
                    qouteText = qoute.title.orEmpty()
                )
                QouteAuther(
                    qouteAuther = qoute.author.orEmpty()
                )
            }

            Spacer(
                modifier = Modifier.weight(1f)
            )
            DeleteIcon(
                deleteQoute = deleteQoute
            )
        }
    }
}