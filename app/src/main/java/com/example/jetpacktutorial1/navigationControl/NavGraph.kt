package com.example.jetpacktutorial1.navigationControl

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavDestination
import androidx.navigation.NavGraph
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.jetpacktutorial1.screens.DashboardScreen
import com.example.jetpacktutorial1.screens.InvoiceStatsScreen

@Composable
fun NavGraph(navController: NavHostController) {

    NavHost(navController = navController, startDestination = "A"){

        composable("A"){
            DashboardScreen(navController)
        }
        composable("B"){
            InvoiceStatsScreen(navController)
        }
    }
}