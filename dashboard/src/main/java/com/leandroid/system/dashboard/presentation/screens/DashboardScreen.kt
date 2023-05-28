package com.leandroid.system.dashboard.presentation

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.leandroid.system.dashboard.presentation.screens.DashboardContent
import com.leandroid.system.dashboard.presentation.ui.theme.MyPayAppTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DashboardScreen(navController: NavHostController) {
    Scaffold(
        content = { paddingValues ->
            DashboardContent(navController = navController ,paddingValues)
        }
    )

}

@Preview
@Composable
fun LoginScreenPreview() {
    MyPayAppTheme {
        DashboardScreen(rememberNavController())
    }

}