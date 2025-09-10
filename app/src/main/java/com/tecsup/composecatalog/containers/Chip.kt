package com.tecsup.composecatalog.containers
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.AssistChip
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ChipExample() {
    AssistChip(
        onClick = { },
        label = { Text("Compose") },
        leadingIcon = {
            Icon(
                imageVector = Icons.Default.Star,
                contentDescription = "icono"
            )
        }
    )
}

@Preview(showBackground = true)
@Composable
fun ChipPreview() {
    ChipExample()
}