package com.leandroid.system.login.presentation

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class LoginViewModel @Inject constructor(): ViewModel() {
    var state by mutableStateOf(LoginState())
        private set

    var errorMessage by mutableStateOf("")
        private set

    fun onUserNameInput(userName: String){
        state = state.copy(userName = userName)
    }

    fun onPasswordInput(password: String){
        state = state.copy(password = password)
    }

    fun validateForm() = viewModelScope.launch{
        if (state.userName.isEmpty()){
            errorMessage = "Por favor ingrese un nombre de usuario"
        }
        else if (state.password.isEmpty()){
            errorMessage = "Por favor ingrese una contraseña"
        }

        delay(3000)
        errorMessage = ""
    }
}