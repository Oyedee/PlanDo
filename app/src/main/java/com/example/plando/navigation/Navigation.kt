package com.example.plando.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.example.plando.navigation.destinations.listComposable
import com.example.plando.navigation.destinations.taskComposable
import com.example.plando.ui.viewmodel.SharedViewModel
import com.example.plando.util.Constants.LIST_SCREEN

@Composable
fun SetupNavigation(
    navHostController: NavHostController,
    sharedViewModel: SharedViewModel,
) {
    // this var is an instance that keeps track of our composable/screens
    val screen = remember(navHostController) {
        Screens(navHostController = navHostController)
    }

    //calling NavHost and defining our Navigation graph.
    NavHost(
        navController = navHostController,
        startDestination = LIST_SCREEN
    ) {
        //comprises of two composable screens
        listComposable(
            navigateToTaskScreen = screen.task,
            sharedViewModel = sharedViewModel
        )
        taskComposable(
          navigateToListScreen = screen.list
        )
    }
}