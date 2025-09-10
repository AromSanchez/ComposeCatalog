package com.tecsup.composecatalog.controls

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.selection.toggleable
import androidx.compose.material3.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Star
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

// ---------- ALERTDIALOG ----------
@Composable
fun AlertDialogExample() {
    var openDialog by remember { mutableStateOf(true) }

    if (openDialog) {
        AlertDialog(
            onDismissRequest = { openDialog = false },
            title = { Text("Título") },
            text = { Text("Este es un AlertDialog de ejemplo") },
            confirmButton = {
                TextButton(onClick = { openDialog = false }) {
                    Text("OK")
                }
            },
            dismissButton = {
                TextButton(onClick = { openDialog = false }) {
                    Text("Cancelar")
                }
            }
        )
    }
}

@Preview(showBackground = true)
@Composable
fun AlertDialogPreview() {
    AlertDialogExample()
}

// ---------- CARD ----------
@Composable
fun CardExample() {
    Card(modifier = Modifier.padding(16.dp)) {
        Text("Soy un Card", modifier = Modifier.padding(16.dp))
    }
}

@Preview(showBackground = true)
@Composable
fun CardPreview() {
    CardExample()
}

// ---------- CHECKBOX ----------
@Composable
fun CheckboxExample() {
    var checked by remember { mutableStateOf(false) }
    Row(modifier = Modifier.padding(16.dp)) {
        Checkbox(checked = checked, onCheckedChange = { checked = it })
        Spacer(modifier = Modifier.width(8.dp))
        Text("Checkbox")
    }
}

@Preview(showBackground = true)
@Composable
fun CheckboxPreview() {
    CheckboxExample()
}

// ---------- FLOATINGACTIONBUTTON ----------
@Composable
fun FabExample() {
    FloatingActionButton(onClick = { }) {
        Text("+")
    }
}

@Preview(showBackground = true)
@Composable
fun FabPreview() {
    FabExample()
}

// ---------- ICON ----------
@Composable
fun IconExample() {
    Icon(
        imageVector = Icons.Default.Star,
        contentDescription = "Estrella",
        tint = Color.Yellow,
        modifier = Modifier.size(48.dp)
    )
}

@Preview(showBackground = true)
@Composable
fun IconPreview() {
    IconExample()
}

// ---------- IMAGE ----------
@Composable
fun ImageExample() {
    // Reemplaza R.drawable.ic_launcher_foreground por alguna imagen en tu proyecto
    Image(
        painter = painterResource(id = android.R.drawable.ic_menu_camera),
        contentDescription = "Imagen de ejemplo",
        modifier = Modifier.size(64.dp)
    )
}

@Preview(showBackground = true)
@Composable
fun ImagePreview() {
    ImageExample()
}

// ---------- PROGRESSBAR ----------
@Composable
fun ProgressBarExample() {
    var progress by remember { mutableStateOf(0.5f) }
    LinearProgressIndicator(progress = progress, modifier = Modifier.fillMaxWidth().padding(16.dp))
}

@Preview(showBackground = true)
@Composable
fun ProgressBarPreview() {
    ProgressBarExample()
}

// ---------- RADIOBUTTON ----------
@Composable
fun RadioButtonExample() {
    var selected by remember { mutableStateOf("Opción 1") }
    Column(modifier = Modifier.padding(16.dp)) {
        Row {
            RadioButton(
                selected = selected == "Opción 1",
                onClick = { selected = "Opción 1" }
            )
            Spacer(modifier = Modifier.width(8.dp))
            Text("Opción 1")
        }
        Row {
            RadioButton(
                selected = selected == "Opción 2",
                onClick = { selected = "Opción 2" }
            )
            Spacer(modifier = Modifier.width(8.dp))
            Text("Opción 2")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun RadioButtonPreview() {
    RadioButtonExample()
}

// ---------- SLIDER ----------
@Composable
fun SliderExample() {
    var value by remember { mutableStateOf(0.5f) }
    Slider(value = value, onValueChange = { value = it }, modifier = Modifier.padding(16.dp))
}

@Preview(showBackground = true)
@Composable
fun SliderPreview() {
    SliderExample()
}

// ---------- SPACER ----------
@Composable
fun SpacerExample() {
    Column(modifier = Modifier.padding(16.dp)) {
        Text("Arriba")
        Spacer(modifier = Modifier.height(24.dp))
        Text("Abajo")
    }
}

@Preview(showBackground = true)
@Composable
fun SpacerPreview() {
    SpacerExample()
}

// ---------- SWITCH ----------
@Composable
fun SwitchExample() {
    var checked by remember { mutableStateOf(false) }
    Row(modifier = Modifier.padding(16.dp)) {
        Switch(checked = checked, onCheckedChange = { checked = it })
        Spacer(modifier = Modifier.width(8.dp))
        Text("Switch")
    }
}

@Preview(showBackground = true)
@Composable
fun SwitchPreview() {
    SwitchExample()
}

// ---------- TOPAPPBAR ----------
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopAppBarExample() {
    TopAppBar(title = { Text("TopAppBar ejemplo") })
}

@Preview(showBackground = true)
@Composable
fun TopAppBarPreview() {
    TopAppBarExample()
}
