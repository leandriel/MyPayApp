package com.leandroid.system.newuser.presentation.graph

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import com.leandroid.system.newuser.presentation.NewUserScreen

fun NavGraphBuilder.AuthNavGraph(navController: NavHostController) {
    navigation(
        route = Graph.AUTH,
        startDestination = AuthScreen.NewUser.route
    ) {
        composable(route = AuthScreen.NewUser.route) {
            NewUserScreen(navController)
        }
    }
}
