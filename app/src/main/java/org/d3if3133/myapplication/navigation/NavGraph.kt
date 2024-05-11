package org.d3if3133.myapplication.navigation
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import org.d3if3133.myapplication.ui.screen.MainHome
import org.d3if3133.myapplication.ui.screen.AboutScreen
import org.d3if3133.myapplication.ui.screen.KEY_ID_CATATAN
import org.d3if3133.myapplication.ui.screen.MainScreen

@Composable
fun SetupNavGraph(navController: NavHostController = rememberNavController()) {
    NavHost(
        navController = navController,
        startDestination = Screen.Home.route
    ){
        composable(route = Screen.Home.route) {
            MainScreen(navController)
        }
        composable(route = Screen.Menu.route){
            MainHome(navController)
        }
        composable(route = Screen.FormBaru.route){
            AboutScreen(navController)
        }
        composable(
            route = Screen.FormUbah.route,
            arguments = listOf(
                navArgument(KEY_ID_CATATAN) {type = NavType.LongType}
            )
        ) { navBackStackEntry ->
            val id = navBackStackEntry.arguments?.getLong(KEY_ID_CATATAN)
            AboutScreen(navController, id)
        }
    }
}