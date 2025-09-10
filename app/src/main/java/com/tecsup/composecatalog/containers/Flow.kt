package com.tecsup.composecatalog.containers

import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowColumn
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalLayoutApi::class)
@Composable
fun FlowRowExample() {
    FlowRow(modifier = Modifier.padding(16.dp)) {
        repeat(6) { index ->
            Button(
                onClick = {},
                modifier = Modifier.padding(4.dp)
            ) {
                Text(text = "Item $index")
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun FlowRowPreview() {
    FlowRowExample()
}

@OptIn(ExperimentalLayoutApi::class)
@Composable
fun FlowColumnExample() {
    FlowColumn(modifier = Modifier.padding(16.dp)) {
        repeat(6) { index ->
            Button(
                onClick = {},
                modifier = Modifier.padding(4.dp)
            ) {
                Text(text = "Item $index")
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun FlowColumnPreview() {
    FlowColumnExample()
}
