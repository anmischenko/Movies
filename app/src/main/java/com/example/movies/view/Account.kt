package com.example.movies.view

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.movies.R

@Preview(showBackground = true)
@Composable
fun Account() {
    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        Box(
            modifier = Modifier.fillMaxWidth(),
            contentAlignment = Alignment.TopEnd
        )
        {
            IconButton(
                modifier = Modifier.padding(10.dp),
                onClick = {
                }
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.exit),
                    contentDescription = "Sign out",
                    modifier = Modifier.size(40.dp)
                )
            }
        }
        Column(modifier = Modifier.padding(top = 70.dp)) {
            Icon(
                painter = painterResource(id = R.drawable.account),
                contentDescription = "Account",
                modifier = Modifier.size(230.dp)
            )
        }
        Text(
            modifier = Modifier
                .fillMaxSize()
                .wrapContentHeight(),
            text = "Account",
            textAlign = TextAlign.Center
        )
    }
}