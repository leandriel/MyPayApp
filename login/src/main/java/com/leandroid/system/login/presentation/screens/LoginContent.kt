package com.leandroid.system.login.presentation.components

import android.widget.Toast
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
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import com.leandroid.system.login.R
import com.leandroid.system.login.presentation.LoginViewModel

@Composable
fun LoginContent(navController: NavHostController, paddingValues: PaddingValues, viewModel : LoginViewModel = hiltViewModel()) {


    val state = viewModel.state
    val context = LocalContext.current

    LaunchedEffect(key1 = viewModel.errorMessage ){
        if (viewModel.errorMessage != ""){
            Toast.makeText(context, viewModel.errorMessage, Toast.LENGTH_LONG).show()
        }
    }

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
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 50.dp)
                .padding(horizontal = 20.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Image(
                modifier = Modifier
                    .height(200.dp)
                    .width(200.dp),
                painter = painterResource(id = R.drawable.logo_login),
                contentDescription = "Logo"
            )


            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(300.dp)
                    .alpha(0.98f),
                shape = RoundedCornerShape(
                    size = 30.dp
                )
            )
            {
                Column(Modifier.padding(10.dp)) {
                    Text(
                        modifier = Modifier
                            .align(Alignment.CenterHorizontally)
                            .padding(bottom = 10.dp),
                        text = stringResource(R.string.log_in_title),
                        color = Color.Black,
                        fontWeight = FontWeight.Bold,
                        fontSize = 20.sp
                    )

                    DefaultTextField(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(bottom = 20.dp),
                        value = state.userName,
                        onValueChange = {
                            viewModel.onUserNameInput(it)
                        },
                        label = stringResource(R.string.user),
                        icon = Icons.Default.AccountBox,
                        keyboardType = KeyboardType.Text

                    )
                    DefaultTextField(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(bottom = 20.dp),
                        value = state.password,
                        onValueChange = {
                            viewModel.onPasswordInput(it)
                        },
                        label = stringResource(R.string.password),
                        icon = Icons.Default.Lock,
                        keyboardType = KeyboardType.Password,
                        hideText = true
                    )

                    DefaultButton(
                        modifier = Modifier.fillMaxWidth(),
                        text = stringResource(R.string.log_in_button),
                        onClick = { viewModel.validateForm() }
                    )

                    Row(
                        Modifier
                            .fillMaxWidth()
                            .padding(top = 5.dp),
                        horizontalArrangement = Arrangement.Center
                    ) {
                        Text(stringResource(R.string.no_account))
                        Text(stringResource(R.string.contact_us), color = Color.Blue)
                    }
                }

            }

        }
    }
}