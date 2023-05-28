package com.leandroid.system.dashboard.presentation.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavHostController
import com.leandroid.system.dashboard.R
import com.leandroid.system.dashboard.presentation.components.DefaultButton
import com.leandroid.system.dashboard.presentation.graph.AuthScreen

@Composable
fun DashboardContent(navController: NavHostController, paddingValues: PaddingValues) {
    Box(
    modifier = Modifier
        .padding(paddingValues = paddingValues)
        .fillMaxSize()
    ) {
        Image(
            modifier = Modifier.fillMaxSize(),
            painter = painterResource(id = R.drawable.login_image),
            contentDescription = "Fondo login",
            contentScale = ContentScale.Crop
        )
        DefaultButton(
            modifier = Modifier.fillMaxWidth(),
            text = "Ir a pantalla New User",
            onClick = { navController.navigate(route = com.leandroid.system.newuser.presentation.graph.AuthScreen.NewUser.route) }
        )

    }
}