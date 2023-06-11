@file:OptIn(ExperimentalMaterial3Api::class)

package com.leandroid.system.newuser.presentation

import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.KeyboardArrowUp
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CardElevation
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ExposedDropdownMenuBox
import androidx.compose.material3.ExposedDropdownMenuDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.onGloballyPositioned
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.unit.toSize
import androidx.hilt.navigation.compose.hiltViewModel
import com.leandroid.system.newuser.R
import com.leandroid.system.newuser.presentation.components.DefaultButton
import com.leandroid.system.newuser.presentation.components.DefaultTextField

@Composable
fun NewUserContent(paddingValues: PaddingValues, viewModel: NewUserViewModel = hiltViewModel()) {

    val state = viewModel.state
    val context = LocalContext.current

    LaunchedEffect(key1 = viewModel.errorMessage) {
        if (viewModel.errorMessage != "") {
            Toast.makeText(context, viewModel.errorMessage, Toast.LENGTH_LONG).show()
        }
    }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(paddingValues = paddingValues)
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .verticalScroll(rememberScrollState())
                .padding(5.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                modifier = Modifier
                    .height(100.dp)
                    .width(100.dp)
                    .padding(vertical = 10.dp),
                painter = painterResource(id = R.drawable.add_account_image),
                contentDescription = ""
            )
            Text(
                text = "Agregar foto de perfil",
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp,
                color = Color.Black
            )
            Card(
                modifier = Modifier
                    .fillMaxSize(),
                colors = CardDefaults.cardColors(
                    containerColor = Color.White,
                ), elevation = CardDefaults.cardElevation(10.dp)
            ) {
                Text(
                    modifier = Modifier.padding(10.dp),
                    text = "Ingrese los datos",
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp
                )
                DefaultTextField(
                    modifier = Modifier
                        .fillMaxWidth(),
                    value = state.name,
                    onValueChange = { viewModel.onNameInput(it) },
                    label = "Nombre",
                    icon = Icons.Default.Person
                )
                DefaultTextField(
                    modifier = Modifier.fillMaxWidth(),
                    value = state.surname,
                    onValueChange = { viewModel.onSurnameInput(it) },
                    label = "Apellido",
                    icon = Icons.Default.Person
                )
                DefaultTextField(
                    modifier = Modifier.fillMaxWidth(),
                    value = state.idNumber,
                    onValueChange = { viewModel.onIdNumberInput(it) },
                    label = "DNI",
                    icon = Icons.Default.Face
                )
                DefaultTextField(
                    modifier = Modifier.fillMaxWidth(),
                    value = state.phoneNumber,
                    onValueChange = { viewModel.onEmailInput(it) },
                    label = "Email",
                    icon = Icons.Default.Email
                )
                DefaultTextField(
                    modifier = Modifier.fillMaxWidth(),
                    value = state.phoneNumber,
                    onValueChange = { viewModel.onPhoneNumberInput(it) },
                    label = "Telefono",
                    icon = Icons.Default.Phone
                )
                dropDownMenu()
                DefaultTextField(
                    modifier = Modifier.fillMaxWidth(),
                    value = state.userName,
                    onValueChange = { viewModel.onUserNameInput(it) },
                    label = "Nombre de usuario",
                    icon = Icons.Default.AccountBox
                )
                DefaultTextField(
                    modifier = Modifier.fillMaxWidth(),
                    value = state.password,
                    onValueChange = { viewModel.onPasswordInput(it) },
                    label = "Contraseña",
                    icon = Icons.Default.Lock,
                    hideText = true
                )
                DefaultTextField(
                    modifier = Modifier.fillMaxWidth(),
                    value = state.confirmPassword,
                    onValueChange = { viewModel.onConfirmPasswordInput(it) },
                    label = "Confirmar contraseña",
                    icon = Icons.Default.Lock,
                    hideText = true
                )
                DefaultButton(modifier = Modifier.fillMaxWidth(),
                    text = "Registrar",
                    onClick = { viewModel.validateForm() }
                )


            }
        }
    }
}

@Composable
fun dropDownMenu() {

    var expanded by remember { mutableStateOf(false) }
    var gender by remember { mutableStateOf("") }

    val division =
        listOf("Primera LIFUBA", "Primera ADEFUL", "Reserva", "Cuarta", "Quinta", "Sexta")
    
    Box(modifier = Modifier.fillMaxWidth(),
    contentAlignment = Alignment.Center
    ){
        ExposedDropdownMenuBox(
            expanded = expanded,
            onExpandedChange = {expanded = it}
        ) {
            TextField(
                value = gender,
                onValueChange = {},
                readOnly = true,
                trailingIcon = {
                    ExposedDropdownMenuDefaults.TrailingIcon(expanded = expanded)
                },
                colors = ExposedDropdownMenuDefaults.textFieldColors(),
                modifier = Modifier.menuAnchor()
                )
            
            ExposedDropdownMenu(
                expanded = expanded,
                onDismissRequest = { expanded = false }
            ) {
                DropdownMenuItem(
                    text = { Text(text = "Primera") },
                    onClick = {
                        gender = "Primera"
                        expanded = false
                    }
                )
                DropdownMenuItem(
                    text = { Text(text = "Reserva") },
                    onClick = {
                        gender = "Reserva"
                        expanded = false
                    }
                )
                
            }

            
        }
    }

//    Column(Modifier.padding(20.dp)) {
//        OutlinedTextField(
//            value = selectedText,
//            onValueChange = { selectedText = it },
//            modifier = Modifier
//                .fillMaxWidth()
//                .onGloballyPositioned { coordinates ->
//                    //This value is used to assign to the DropDown the same width
//                    textfieldSize = coordinates.size.toSize()
//                },
//            label = { Text("Label") },
//            trailingIcon = {
//                Icon(icon, "contentDescription",
//                    Modifier.clickable { expanded = !expanded })
//            }
//        )
//        DropdownMenu(
//            expanded = expanded,
//            onDismissRequest = { expanded = false },
//            modifier = Modifier
//                .width(with(LocalDensity.current) { textfieldSize.width.toDp() })
//        ) {
//            division.forEach { label ->
//                DropdownMenuItem(onClick = {
//                    selectedText = label
//                    expanded = false
//                }) {
//                    Text(text = label)
//                }
//            }
//        }
//    }

}