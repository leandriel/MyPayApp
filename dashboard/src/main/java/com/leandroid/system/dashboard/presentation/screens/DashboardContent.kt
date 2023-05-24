package com.leandroid.system.dashboard.presentation.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import com.leandroid.system.dashboard.R

@Composable
fun DashboardContent(paddingValues: PaddingValues) {
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
    }
}