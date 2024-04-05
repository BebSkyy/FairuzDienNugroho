package org.d3if3133.myapplication.navigation
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import org.d3if3133.myapplication.ui.screen.MainHome
import org.d3if3133.myapplication.ui.screen.AboutScreen
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
        composable(route = Screen.About.route){
            AboutScreen(navController)
        }
    }
}