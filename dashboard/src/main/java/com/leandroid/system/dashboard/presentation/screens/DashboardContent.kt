package com.leandroid.system.dashboard.presentation.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.leandroid.system.dashboard.R
import com.leandroid.system.dashboard.presentation.components.DefaultButton
import com.leandroid.system.dashboard.presentation.graph.AuthScreen

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DashboardContent(navController: NavHostController, paddingValues: PaddingValues) {
    Box(
        modifier = Modifier
            .padding(paddingValues = paddingValues)
            .fillMaxSize()
    ) {
        Box(modifier = Modifier.fillMaxWidth()) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center
            ) {
                Card(
                    modifier = Modifier
                        .width(160.dp)
                        .height(120.dp)
                        .padding(10.dp),
                    shape = RoundedCornerShape(size = 30.dp),
                    elevation = CardDefaults.cardElevation(10.dp),
                    colors = CardDefaults.cardColors(Color.White),
                    onClick = { navController.navigate(route = com.leandroid.system.newuser.presentation.graph.AuthScreen.NewUser.route) }
                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(15.dp),
                        horizontalAlignment = Alignment.CenterHorizontally

                    ) {

                        Image(
                            modifier = Modifier
                                .width(50.dp)
                                .height(50.dp),
                            painter = painterResource(id = R.drawable.add_user_card),
                            contentDescription = ""
                        )

                        Text(
                            text = "Crear usuario"
                        )
                    }

                }
                Card(
                    modifier = Modifier
                        .width(160.dp)
                        .height(120.dp)
                        .padding(10.dp),
                    shape = RoundedCornerShape(size = 30.dp),
                    elevation = CardDefaults.cardElevation(10.dp),
                    colors = CardDefaults.cardColors(Color.White),
                    onClick = { navController.navigate(route = com.leandroid.system.newuser.presentation.graph.AuthScreen.NewUser.route) }
                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(15.dp),
                        horizontalAlignment = Alignment.CenterHorizontally

                    ) {

                        Image(
                            modifier = Modifier
                                .width(50.dp)
                                .height(50.dp),
                            painter = painterResource(id = R.drawable.edit_profile),
                            contentDescription = ""
                        )

                        Text(
                            text = "Editar usuario"
                        )
                    }

                }
            }


        }


    }
}