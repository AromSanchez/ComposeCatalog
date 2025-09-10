package com.tecsup.composecatalog.containers

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.constraintlayout.compose.ConstraintLayout

@Composable
fun ConstraintLayoutScreens(){
    ConstraintLayout {
        val (text1, button1, text2) = createRefs()

        Text(
            text = "Texto arriba a la izquierda",
            modifier = Modifier.constrainAs(text1) {
                top.linkTo(parent.top)
                start.linkTo(parent.start)
            }
        )

        Button(
            onClick = {},
            modifier = Modifier.constrainAs(button1) {
                top.linkTo(parent.top)
                end.linkTo(parent.end)
            }
        ) {
            Text("Botón")
        }

        Text(
            text = "Texto en el medio",
            modifier = Modifier.constrainAs(text2) {
                top.linkTo(text1.bottom)
                start.linkTo(text1.end)
                end.linkTo(button1.start)
            }
        )
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewConstraintLayout() {
    ConstraintLayoutScreens()
}