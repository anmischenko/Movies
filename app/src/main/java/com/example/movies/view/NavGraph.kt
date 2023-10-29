package com.example.movies.view

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@Composable
fun NavGraph(
    navHostController: NavHostController
) {
    NavHost(
        navController = navHostController,
        startDestination = "add_session"
    ) {
        composable("add_session") {
            AddSession()
        }
        composable("account") {
            Account()
        }
        composable("favorite") {
            Favorite()
        }

    }
}