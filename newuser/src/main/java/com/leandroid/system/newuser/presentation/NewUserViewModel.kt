package com.leandroid.system.newuser.presentation

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
class NewUserViewModel @Inject constructor() : ViewModel() {
    var state by mutableStateOf(NewUserState())
        private set

    var errorMessage by mutableStateOf("")
        private set

    fun onNameInput(name: String) {
        state = state.copy(name = name)
    }

    fun onSurnameInput(surname: String) {
        state = state.copy(surname = surname)
    }

    fun onIdNumberInput(idNumber: String) {
        state = state.copy(idNumber = idNumber)
    }

    fun onPhoneNumberInput(phoneNumber: String) {
        state = state.copy(phoneNumber = phoneNumber)
    }

    fun onEmailInput(email: String) {
        state = state.copy(email = email)
    }

    fun onDivisionInput(division: String) {
        state = state.copy(division = division)
    }

    fun onUserNameInput(userName: String) {
        state = state.copy(userName = userName)
    }

    fun onPasswordInput(password: String) {
        state = state.copy(password = password)
    }

    fun onConfirmPasswordInput(confirmPassword: String) {
        state = state.copy(confirmPassword = confirmPassword)
    }

    fun validateForm() = viewModelScope.launch{
        if (state.name.isEmpty()){
            errorMessage = "Por favor ingrese un nombre"
        }
        else if (state.surname.isEmpty()){
            errorMessage = "Por favor ingrese un apellido"
        }
        else if (state.idNumber.isEmpty()){
            errorMessage = "Por favor ingrese un DNI"
        }
        else if (state.phoneNumber.isEmpty()){
            errorMessage = "Por favor ingrese un telefono"
        }
        else if (state.division.isEmpty()){
            errorMessage = "Por favor seleccione una division"
        }
        else if (state.userName.isEmpty()){
            errorMessage = "Por favor ingrese un nombre de usuario"
        }
        else if (state.password.isEmpty()){
            errorMessage = "Por favor ingrese una contraseña"
        }
        else if (state.confirmPassword.isEmpty()){
            errorMessage = "Por favor confirme la contraseña"
        }
        else if (state.confirmPassword !== state.password){
            errorMessage = "Las contraseñas no coincidenwww"
        }

        delay(3000)
        errorMessage = ""
    }
}