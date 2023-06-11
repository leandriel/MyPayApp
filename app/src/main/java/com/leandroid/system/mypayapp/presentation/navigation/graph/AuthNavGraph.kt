package com.leandroid.system.mypayapp.presentation.navigation.graph

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.leandroid.system.dashboard.presentation.DashboardScreen
import com.leandroid.system.login.presentation.LoginScreen
import com.leandroid.system.mypayapp.presentation.navigation.Graph
import com.leandroid.system.mypayapp.presentation.navigation.screen.AuthScreen
import com.leandroid.system.newuser.presentation.NewUserScreen

fun NavGraphBuilder.AuthNavGraph(navController: NavHostController){
    navigation(
        route = Graph.AUTH,
        startDestination = AuthScreen.Login.route
    ){
        composable(route = AuthScreen.Login.route){
            LoginScreen(navController)
        }
        composable(route = AuthScreen.Dashboard.route){
            DashboardScreen(navController)
        }
        composable(route = AuthScreen.NewUser.route){
//            NewUserScreen(navController)
            NewUserScreen()
        }
    }
}