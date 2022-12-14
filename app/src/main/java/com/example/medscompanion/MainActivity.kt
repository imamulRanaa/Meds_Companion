package com.example.medscompanion

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.medscompanion.ui.presentation.AllMedsPrev
import com.example.medscompanion.ui.presentation.SplashScreen
import com.example.medscompanion.ui.theme.MedsCompanionTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MedsCompanionTheme {
                val navController = rememberNavController()
                NavHost(navController = navController, startDestination = "splash_screen") {
                    composable("splash_screen") {
                        SplashScreen(navController = navController)
                    }
                    composable("main_screen") {
                        AllMedsPrev()
                    }
                }
            }
        }
    }
}
