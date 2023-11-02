package com.example.movies.view

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.movies.R

@Composable
fun AddSession(
    OnClickCreate: () -> Unit,
    OnClickJoin: () -> Unit,
    OnClickAccount: () -> Unit,
    OnClickFavorite: () -> Unit
) {
    Row(modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween) {
        Button(
            onClick = {
                OnClickAccount()
            },
            modifier = Modifier.padding(10.dp)
        ) {
            Icon(
                painter = painterResource(id = R.drawable.account),
                contentDescription = "Back"
            )
        }
        Button(
            onClick = {
                OnClickFavorite()
            },
            modifier = Modifier.padding(10.dp)
        ) {
            Icon(
                painter = painterResource(id = R.drawable.favorite),
                contentDescription = "Back"
            )
        }
    }

    Box(
        modifier = Modifier
            .fillMaxSize()
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Button(
                onClick = {
                    OnClickCreate()
                },
                modifier = Modifier
                    .fillMaxWidth(0.8f)
                    .padding(10.dp),
                shape = RoundedCornerShape(30.dp)
            ) {
                Text(
                    text = "Create a session",
                    fontSize = 25.sp
                )
            }
            Button(
                onClick = {
                    OnClickJoin()
                },
                modifier = Modifier
                    .fillMaxWidth(0.8f)
                    .padding(10.dp),
                shape = RoundedCornerShape(30.dp)
            ) {
                Text(
                    text = "Join a session",
                    fontSize = 25.sp
                )
            }
        }
    }
}