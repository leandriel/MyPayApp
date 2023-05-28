package com.leandroid.system.dashboard.presentation.graph

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import com.leandroid.system.dashboard.presentation.DashboardScreen


fun NavGraphBuilder.AuthNavGraph(navcontroller: NavHostController) {
    navigation(
        route = Graph.AUTH,
        startDestination = AuthScreen.Dashboard.route
    ) {
        composable(route = AuthScreen.Dashboard.route) {
            DashboardScreen(navcontroller)
        }
    }
}
