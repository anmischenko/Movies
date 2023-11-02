package com.example.movies.view

import android.annotation.SuppressLint
import androidx.activity.compose.BackHandler
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun MainScreen() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = "add_session"
    ) {
        composable("add_session") {
            AddSession(
                OnClickCreate = {
                    navController.navigate("create_session")
                },
                OnClickJoin = {
                    navController.navigate("favorite")
                },
                OnClickAccount = {
                    navController.navigate("account")
                },
                OnClickFavorite = {
                    navController.navigate("favorite")
                }
            )
        }
        composable("account") {
            Account()
        }
        composable("favorite") {
            Favorite()
        }
        composable("create_session") {
            CreateSession {
                navController.popBackStack()
            }
        }

    }

}
