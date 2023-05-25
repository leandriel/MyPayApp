package com.leandroid.system.login.presentation

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.leandroid.system.login.presentation.components.LoginContent
import com.leandroid.system.login.presentation.ui.theme.MyPayAppTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LoginScreen(navController: NavHostController) {
    Scaffold(
        content = { paddingValues ->
            LoginContent(navController = navController,paddingValues)
        }
    )
    
}

@Preview
@Composable
fun LoginScreenPreview() {
    MyPayAppTheme {
        LoginScreen(rememberNavController())
    }
    
}