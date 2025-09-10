package com.tecsup.composecatalog.containers

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Composable
fun Grid(){
    val lista = (1..20).toList()
    LazyVerticalGrid(
        columns = GridCells.Fixed(3),
    ) {
        items(lista){
            item ->
            Text("Item: $item")
        }
    }
}


@Preview(showBackground = true)
@Composable
fun PreviewGrid(){
    Grid()
}
