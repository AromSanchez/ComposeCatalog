package com.tecsup.composecatalog.containers

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun LazyRowScreen(){
    val lista = (1..10).toList()
    LazyRow (
        contentPadding = PaddingValues(16.dp)
    ){
        items(lista){
            item ->
                Text("Item: $item")
                Spacer(Modifier.width(16.dp))
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewLazyRow(){
    LazyRowScreen()
}