package com.leandroid.system.dashboard.presentation.graph

sealed class AuthScreen(val route: String){
    object Dashboard: AuthScreen("dashboard")
}
