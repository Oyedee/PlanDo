package com.example.plando.navigation.destinations

import androidx.compose.material.ExperimentalMaterialApi
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavType
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.example.plando.ui.screens.list.ListScreen
import com.example.plando.ui.viewmodel.SharedViewModel
import com.example.plando.util.Constants.LIST_ARGUMENT_KEY
import com.example.plando.util.Constants.LIST_SCREEN

////this composable contain one lambda parameter which is an int type

@ExperimentalMaterialApi
fun NavGraphBuilder.listComposable(
    navigateToTaskScreen: (taskId: Int) -> Unit,
    sharedViewModel: SharedViewModel
) {
    composable(
        route = LIST_SCREEN,
        arguments = listOf(navArgument(LIST_ARGUMENT_KEY) {
            type = NavType.StringType
        })
    ) {
        ListScreen(navigateToTaskScreen = navigateToTaskScreen,
        sharedViewModel = sharedViewModel)
    }
}