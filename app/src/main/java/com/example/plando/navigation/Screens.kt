package com.example.plando.navigation

import androidx.navigation.NavHostController
import com.example.plando.util.Action
import com.example.plando.util.Constants.LIST_SCREEN

// this class keeps track of all our composable or screens

class Screens(navHostController: NavHostController) {
    val list: (Action) -> Unit = { action ->
        navHostController.navigate("list/${action.name}") {
            popUpTo(LIST_SCREEN) { inclusive = true}
        }
    }

    val task: (Int) -> Unit = { taskId ->
        navHostController.navigate("task/$taskId")
    }
}