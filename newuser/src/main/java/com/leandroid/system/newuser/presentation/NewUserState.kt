package com.leandroid.system.newuser.presentation

data class NewUserState(
    val name: String = "",
    val surname: String = "",
    val idNumber: String = "",
    val email: String = "",
    val phoneNumber: String = "",
    val division: String = "",
    val userName: String = "",
    val password: String = "",
    val confirmPassword: String = ""
)