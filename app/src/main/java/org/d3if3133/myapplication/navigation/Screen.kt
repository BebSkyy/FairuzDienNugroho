package org.d3if3133.myapplication.navigation

sealed class Screen(val route: String){
    data object Home: Screen("MainScreen")
    data object Menu: Screen("MainHome")
    data object About: Screen("AboutScreen")
}