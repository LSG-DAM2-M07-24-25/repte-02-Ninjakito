package com.ninjakito.dragonballdaima.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.ninjakito.dragonballdaima.ui.screens.LaunchScreen
import com.ninjakito.dragonballdaima.ui.screens.NameScreen
import com.ninjakito.dragonballdaima.ui.screens.SelectScreen

@Composable
fun NavigationWrapper() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "launch") {
        // Navigate to Launch Screen
        composable("launch") {
            LaunchScreen {
                navController.navigate("select")
            }
        }

        // Navigate to SelectorScreen
        composable("select") {
            SelectScreen { character: String ->
                navController.navigate("name/$character")
            }
        }

        // Navigate to NameScreen
        composable("name/{character}") { backStackEntry ->
            val character = backStackEntry.arguments?.getString("character") ?: ""
            NameScreen { name: String ->
                navController.navigate("result/$character/$name")
            }
        }
    }
}