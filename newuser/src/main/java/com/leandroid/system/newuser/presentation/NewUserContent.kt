package com.leandroid.system.newuser.presentation

import androidx.compose.foundation.Image
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
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CardElevation
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.leandroid.system.newuser.R
import com.leandroid.system.newuser.presentation.components.DefaultButton
import com.leandroid.system.newuser.presentation.components.DefaultTextField

@Composable
fun NewUserContent(paddingValues: PaddingValues) {
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
                    value = "",
                    onValueChange = {},
                    label = "Nombre",
                    icon = Icons.Default.Person
                )
                DefaultTextField(
                    modifier = Modifier.fillMaxWidth(),
                    value = "",
                    onValueChange = {},
                    label = "Apellido",
                    icon = Icons.Default.Person
                )
                DefaultTextField(
                    modifier = Modifier.fillMaxWidth(),
                    value = "",
                    onValueChange = {},
                    label = "DNI",
                    icon = Icons.Default.Face
                )
                DefaultTextField(
                    modifier = Modifier.fillMaxWidth(),
                    value = "",
                    onValueChange = {},
                    label = "Telefono",
                    icon = Icons.Default.Phone
                )
                DefaultTextField(
                    modifier = Modifier.fillMaxWidth(),
                    value = "",
                    onValueChange = {},
                    label = "Division",
                    icon = Icons.Default.Info
                )
                DefaultTextField(
                    modifier = Modifier.fillMaxWidth(),
                    value = "",
                    onValueChange = {},
                    label = "Nombre de usuario",
                    icon = Icons.Default.AccountBox
                )
                DefaultTextField(
                    modifier = Modifier.fillMaxWidth(),
                    value = "",
                    onValueChange = {},
                    label = "Contraseña",
                    icon = Icons.Default.Lock
                )
                DefaultButton(modifier = Modifier.fillMaxWidth(), text = "Registrar", onClick = { /*TODO*/ })


            }
        }
    }
}