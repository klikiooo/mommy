package com.example.mommycare.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.mommycare.ui.theme.screens.login.LoginScreen
import com.example.mommycare.ui.theme.screens.signup.SignupScreen

@Composable
fun AppNavHost(modifier: Modifier = Modifier,
               navController: NavHostController = rememberNavController(),
               startDestination: String = LOGIN_URL){
    NavHost(navController = navController, startDestination = startDestination,
        modifier = Modifier) {
        composable(LOGIN_URL) {
            LoginScreen(navController = navController)
        }

        composable(SIGNUP_URL) {
            SignupScreen(navController = navController)
        }
    }
}


