package com.nx.nxfq.presentation.qoute_screen

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.hilt.navigation.compose.hiltViewModel
import com.nx.nxfq.component.TopAppBarQ
import com.nx.nxfq.presentation.qoute_screen.component.AddAlertDialog
import com.nx.nxfq.presentation.qoute_screen.component.Fab
import com.nx.nxfq.presentation.qoute_screen.component.Qoute
import com.nx.nxfq.presentation.qoute_screen.component.QouteContent

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun QouteScreen(
    viewModel: QouteViewModel = hiltViewModel()
) {

    var openDialog by remember { mutableStateOf(false) }

    Scaffold(
        topBar = {
            TopAppBarQ()
        },
        content = { padding ->
            Qoute(
                qouteContent = { xxx ->
                    QouteContent(
                        padding = padding,
                        qoutes = xxx,
                        deleteQoute = { qouteId -> viewModel.deleteQoute(qouteId) }
                    )
                    if (openDialog) {
                        AddAlertDialog(
                            closeDialog = { openDialog = false },
                            addQoute = { title, author -> viewModel.addQoute(title, author) }
                        )
                    }
                }
            )
        },
        floatingActionButton = {
            Fab(
                openDialog = {
                    openDialog = true
                }
            )
        }
    )
}