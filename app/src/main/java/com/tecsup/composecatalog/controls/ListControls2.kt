package com.tecsup.composecatalog.controls

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material3.*
import androidx.compose.material3.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Dialog
import kotlinx.coroutines.launch

// ---------- BOTTOMNAVIGATION ----------
@Composable
fun BottomNavigationExample() {
    var selectedItem by remember { mutableStateOf(0) }
    val items = listOf("Home", "Search", "Profile")
    NavigationBar {
        items.forEachIndexed { index, item ->
            NavigationBarItem(
                selected = selectedItem == index,
                onClick = { selectedItem = index },
                icon = { Icon(Icons.Filled.Menu, contentDescription = item) },
                label = { Text(item) }
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun BottomNavigationPreview() {
    BottomNavigationExample()
}

// ---------- DIALOG ----------
@Composable
fun DialogExample() {
    var showDialog by remember { mutableStateOf(true) }
    if (showDialog) {
        Dialog(onDismissRequest = { showDialog = false }) {
            Surface(
                shape = MaterialTheme.shapes.medium,
                tonalElevation = 8.dp
            ) {
                Column(modifier = Modifier.padding(16.dp)) {
                    Text("Dialog personalizado")
                    Spacer(modifier = Modifier.height(8.dp))
                    Button(onClick = { showDialog = false }) {
                        Text("Cerrar")
                    }
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DialogPreview() {
    DialogExample()
}

// ---------- DIVIDER ----------
@Composable
fun DividerExample() {
    Column(modifier = Modifier.padding(16.dp)) {
        Text("Arriba")
        Divider(modifier = Modifier.padding(vertical = 8.dp))
        Text("Abajo")
    }
}

@Preview(showBackground = true)
@Composable
fun DividerPreview() {
    DividerExample()
}

// ---------- DROPDOWNMENU ----------
@Composable
fun DropDownMenuExample() {
    var expanded by remember { mutableStateOf(false) }
    var selectedText by remember { mutableStateOf("Selecciona") }

    Box(modifier = Modifier.padding(16.dp)) {
        Button(onClick = { expanded = true }) {
            Text(selectedText)
        }
        DropdownMenu(expanded = expanded, onDismissRequest = { expanded = false }) {
            DropdownMenuItem(text = { Text("Opción 1") }, onClick = {
                selectedText = "Opción 1"
                expanded = false
            })
            DropdownMenuItem(text = { Text("Opción 2") }, onClick = {
                selectedText = "Opción 2"
                expanded = false
            })
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DropDownMenuPreview() {
    DropDownMenuExample()
}

// ---------- LAZYVERTICALGRID ----------
@OptIn(ExperimentalMaterial3Api::class) // necesario porque LazyVerticalGrid aún es experimental
@Composable
fun LazyVerticalGridExample() {
    LazyVerticalGrid(columns = GridCells.Fixed(2), modifier = Modifier.padding(16.dp)) {
        items(6) { index ->
            Button(onClick = {}, modifier = Modifier.padding(8.dp)) {
                Text("Item $index")
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun LazyVerticalGridPreview() {
    LazyVerticalGridExample()
}

// ---------- NAVIGATIONRAIL ----------
@Composable
fun NavigationRailExample() {
    var selectedItem by remember { mutableStateOf(0) }
    val items = listOf("Home", "Search", "Profile")
    NavigationRail {
        items.forEachIndexed { index, item ->
            NavigationRailItem(
                selected = selectedItem == index,
                onClick = { selectedItem = index },
                icon = { Icon(Icons.Filled.Menu, contentDescription = item) },
                label = { Text(item) }
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun NavigationRailPreview() {
    NavigationRailExample()
}

// ---------- OUTLINEDTEXTFIELD ----------
@Composable
fun OutlinedTextFieldExample() {
    var text by remember { mutableStateOf("") }
    OutlinedTextField(
        value = text,
        onValueChange = { text = it },
        label = { Text("Nombre") },
        modifier = Modifier.padding(16.dp)
    )
}

@Preview(showBackground = true)
@Composable
fun OutlinedTextFieldPreview() {
    OutlinedTextFieldExample()
}

// ---------- SNACKBAR ----------
@Composable
fun SnackbarExample() {
    val snackbarHostState = remember { SnackbarHostState() }
    val scope = rememberCoroutineScope() // Necesario para lanzar la corrutina del Snackbar
    Column(modifier = Modifier.padding(16.dp)) {
        Button(onClick = {
            scope.launch { // showSnackbar es una función suspend, debe llamarse desde una corrutina
                snackbarHostState.showSnackbar("Este es un Snackbar")
            }
        }) {
            Text("Mostrar Snackbar")
        }
        SnackbarHost(hostState = snackbarHostState)
    }
}

@Preview(showBackground = true)
@Composable
fun SnackbarPreview() {
    SnackbarExample()
}

// ---------- TABROW ----------
@Composable
fun TabRowExample() {
    var selectedTab by remember { mutableStateOf(0) }
    val tabs = listOf("Tab 1", "Tab 2", "Tab 3")
    Column(modifier = Modifier.fillMaxWidth()) {
        TabRow(selectedTabIndex = selectedTab) {
            tabs.forEachIndexed { index, title ->
                Tab(selected = selectedTab == index, onClick = { selectedTab = index }) {
                    Text(title, modifier = Modifier.padding(16.dp))
                }
            }
        }
        Spacer(modifier = Modifier.height(8.dp))
        Text("Contenido de ${tabs[selectedTab]}", modifier = Modifier.padding(16.dp))
    }
}

@Preview(showBackground = true)
@Composable
fun TabRowPreview() {
    TabRowExample()
}

// ---------- TOOLTIP ----------
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TooltipExample() {
    val tooltipState = rememberTooltipState(isPersistent = true) // Make tooltip persistent
    TooltipBox(
        positionProvider = TooltipDefaults.rememberPlainTooltipPositionProvider(),
        tooltip = { Text("Tooltip de ejemplo") },
        state = tooltipState
    ) {
        Button(onClick = { /* Handle button click if needed */ }) {
            Text("Hover o presiona")
        }
    }
}
@Preview(showBackground = true)
@Composable
fun TooltipPreview() {
    TooltipExample()
}
