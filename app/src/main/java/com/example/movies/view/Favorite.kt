package com.example.movies.view

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign

@Composable
fun Favorite() {
    Text(modifier = Modifier.fillMaxSize().wrapContentHeight(),
        text = "Favorite",
        textAlign = TextAlign.Center)
}