package com.example.plando.ui.screens.list

import androidx.compose.material.MaterialTheme
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.plando.ui.theme.topAppBarBackgroundColor

@Composable
fun ListAppBar() {
    DefaultListAppBar()
}

@Composable
fun DefaultListAppBar(){
    TopAppBar(
        modifier = Modifier,
        backgroundColor = MaterialTheme.colors.topAppBarBackgroundColor,
    ) {

    }
}