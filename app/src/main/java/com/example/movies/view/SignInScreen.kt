package com.example.movies.view

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.material.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview(showBackground = true)
@Composable
fun SignInScreen() {
    Box(
        modifier = Modifier
            .fillMaxSize()
//            .background(color = Color.Gray)
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                text = "Hello!",
                fontSize = 50.sp
            )
            Text(
                text = "Sign in your account",
                fontSize = 30.sp
            )
            Spacer(modifier = Modifier.height(30.dp))
            TextField(
                value = "",
                onValueChange = {

                },
                label = {
                        Text(text = "Login")
                },
                colors = TextFieldDefaults.textFieldColors(
                    focusedIndicatorColor = Color.Transparent,
                    unfocusedIndicatorColor = Color.Transparent
                ),
                shape = RoundedCornerShape(30.dp),
                singleLine = true
                )
            TextField(
                value = "",
                onValueChange = {

                },
                modifier = Modifier.padding(
                    top = 20.dp,
                    bottom = 10.dp
                ),
                label = {
                    Text(text = "Password")
                },
                colors = TextFieldDefaults.textFieldColors(
                    focusedIndicatorColor = Color.Transparent,
                    unfocusedIndicatorColor = Color.Transparent
                ),
                shape = RoundedCornerShape(30.dp),
                singleLine = true
            )
            Text(
                modifier = Modifier
                    .clickable {

                    },
                text = "Forgot your password?",
                fontSize = 14.sp,
                color = Color.Gray

            )
            Button(
                onClick = { /*TODO*/ },
                modifier = Modifier.fillMaxWidth(0.4f)
                    .padding(10.dp),
                shape = RoundedCornerShape(20.dp)
            ) {
                Text(text = "Sign in",
                    fontSize = 18.sp)
            }
            Row {
                Text(text = "Don't have an account? ")
                Text(
                    modifier = Modifier
                        .clickable {

                        },
                    text = "Create"
                )
            }

        }
    }

}