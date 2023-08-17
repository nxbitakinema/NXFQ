package com.nx.nxfq.presentation.qoute_screen.component

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.nx.nxfq.core.Constant.AUTHOR
import com.nx.nxfq.core.Constant.BUTTON_ADD
import com.nx.nxfq.core.Constant.BUTTON_CANCEL
import com.nx.nxfq.core.Constant.EMPTY_STRING
import com.nx.nxfq.core.Constant.QOUTE_TEXT

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AddAlertDialog(
    closeDialog: () -> Unit,
    addQoute: (title: String, auther: String) -> Unit
) {

    var title by remember { mutableStateOf(EMPTY_STRING) }
    var auther by remember { mutableStateOf(EMPTY_STRING) }

    AlertDialog(
        shape = RoundedCornerShape(4.dp),
        onDismissRequest = closeDialog,
        text = {
            Column {
                OutlinedTextField(
                    value = title,
                    onValueChange = { title = it },
                    placeholder = { Text(text = QOUTE_TEXT) },
                    modifier = Modifier.height(380.dp),
                    maxLines = 20
                )
                Spacer(
                    modifier = Modifier.height(16.dp)
                )
                OutlinedTextField(
                    value = auther,
                    onValueChange = { auther = it },
                    placeholder = { Text(text = AUTHOR) },
                    maxLines = 1,
                    singleLine = true,
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
                    text = BUTTON_CANCEL,
                    fontSize = 12.sp
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
                    text = BUTTON_ADD,
                    fontSize = 12.sp

                )
            }
        }
    )
}