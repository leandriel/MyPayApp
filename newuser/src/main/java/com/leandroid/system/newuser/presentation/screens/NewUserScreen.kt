package com.leandroid.system.newuser.presentation

import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.leandroid.system.newuser.presentation.components.DefaultTopBar
import com.leandroid.system.newuser.presentation.ui.theme.MyPayAppTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
//fun NewUserScreen(navController: NavHostController) {
fun NewUserScreen() {

    Scaffold(
        topBar = {
            DefaultTopBar(
                title = "Crear nuevo usuario",
                upAvailable = true,
//                navController = navController,
            )
        }
    ) { paddingValues ->
        NewUserContent(paddingValues = paddingValues)

    }

}

@Preview
@Composable
fun NewUserScreenPreview() {
    MyPayAppTheme {
//        NewUserScreen(rememberNavController())
        NewUserScreen()
    }

}