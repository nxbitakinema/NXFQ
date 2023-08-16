package com.nx.nxfq.presentation.qoute_screen.component

import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import com.nx.nxfq.component.ProgressBarQ
import com.nx.nxfq.domain.model.Response.Failure
import com.nx.nxfq.domain.model.Response.Loading
import com.nx.nxfq.domain.model.Response.Success
import com.nx.nxfq.domain.repository.Qoutes
import com.nx.nxfq.presentation.qoute_screen.QouteViewModel

@Composable
fun Qoute(
    viewModel: QouteViewModel = hiltViewModel(),
    qouteContent: @Composable (qoutes: Qoutes) -> Unit
) {
    when (val qouteResponse = viewModel.appResponse) {
        is Loading -> ProgressBarQ()
        is Success -> qouteContent(qouteResponse.data)
        is Failure -> print(qouteResponse.e)
    }
}