package com.leandroid.system.mypayapp.presentation.navigation.screen

sealed class AuthScreen (val route: String){

    object Login: AuthScreen("login")
    object Dashboard: AuthScreen("dashboard")
    object NewUser: AuthScreen("new_user")

}

