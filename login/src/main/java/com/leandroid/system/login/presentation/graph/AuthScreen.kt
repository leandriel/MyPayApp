package com.leandroid.system.login.presentation.graph

sealed class AuthScreen(val route: String){
    object Login: AuthScreen("login")
}
