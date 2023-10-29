package com.example.movies.view
import com.example.movies.R

sealed class BottomItem(val title: String, val icon: Int, val route: String) {
    object Account: BottomItem("Account", R.drawable.account, "account")
    object AddSession: BottomItem("Add session", R.drawable.add_session, "add_session")
    object Favorite: BottomItem("Favorite", R.drawable.favorite, "favorite")
}
