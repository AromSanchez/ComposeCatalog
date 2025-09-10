package com.tecsup.composecatalog.containers

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ScaffoldExample() {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Scaffold Example") }
            )
        },
        floatingActionButton = {
            FloatingActionButton(onClick = { }) {
                Text("+")
            }
        }
    ) { innerPadding ->
        Text(
            text = "Hola desde el cuerpo del Scaffold",
            modifier = androidx.compose.ui.Modifier.padding(innerPadding)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewScaffoldExample() {
    ScaffoldExample()
}