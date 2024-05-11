package org.d3if3133.myapplication.navigation

import org.d3if3133.myapplication.ui.screen.KEY_ID_CATATAN

sealed class Screen(val route: String){
    data object Home: Screen("MainScreen")
    data object Menu: Screen("MainHome")
    data object FormBaru: Screen("AboutScreen")
    data object FormUbah: Screen("AboutScreen/{$KEY_ID_CATATAN}") {
        fun withId(id: Long) = "AboutScreen/$id"
    }
}