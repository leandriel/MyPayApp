package com.leandroid.system.newuser.presentation.graph

sealed class AuthScreen(val route: String){
    object NewUser: AuthScreen("new_user")
}
