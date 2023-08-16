package com.nx.nxfq.presentation.qoute_screen.component

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.focusRequester
import androidx.compose.ui.unit.dp
import com.nx.nxfq.core.Constant
import com.nx.nxfq.core.Constant.ADD
import com.nx.nxfq.core.Constant.ADD_QOUTE
import com.nx.nxfq.core.Constant.AUTHOR
import com.nx.nxfq.core.Constant.EMPTY_STRING
import com.nx.nxfq.core.Constant.QOUTE_TITLE
import kotlinx.coroutines.job

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AddAlertDialog(
    closeDialog: () -> Unit,
    addQoute: (title: String, auther: String) -> Unit
) {

    var title by remember { mutableStateOf(EMPTY_STRING) }
    var auther by remember { mutableStateOf(EMPTY_STRING) }
    val focusRequester = FocusRequester()

    AlertDialog(
        onDismissRequest = closeDialog,
        title = {
            Text(
                text = ADD_QOUTE
            )
        },
        text = {
            Column {
                TextField(
                    value = title,
                    onValueChange = { title = it },
                    placeholder = {
                        Text(
                            text = QOUTE_TITLE
                        )
                    },
                    modifier = Modifier.focusRequester(focusRequester)
                )
                LaunchedEffect(Unit) {
                    coroutineContext.job.invokeOnCompletion {
                        focusRequester.requestFocus()
                    }
                }
                Spacer(
                    modifier = Modifier.height(16.dp)
                )
                TextField(
                    value = auther,
                    onValueChange = { auther = it },
                    placeholder = {
                        Text(
                            text = AUTHOR
                        )
                    }
                )
            }
        },
        dismissButton = {
            TextButton(
                onClick = {
                    closeDialog()
                }
            ) {
                Text(
                    text = Constant.CANCEL
                )
            }
        },
        confirmButton = {
            TextButton(
                onClick = {
                    closeDialog()
                    addQoute(title, auther)
                }
            ) {
                Text(
                    text = ADD
                )
            }
        }
    )
}