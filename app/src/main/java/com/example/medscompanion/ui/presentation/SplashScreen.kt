package com.example.medscompanion.ui.presentation

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavController
import com.example.medscompanion.R
import kotlinx.coroutines.delay



@Composable
fun SplashScreen(navController: NavController) {
    LaunchedEffect(key1 = true) {
        delay(2000)
        navController.navigate("main_screen") {
            popUpTo("splash_screen") {
                inclusive = true
            }
        }
    }
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.surface),
        Alignment.Center
    ) {
        Icon(
            painterResource(R.drawable.ic_launcher_foreground),
            contentDescription = null,
            tint = MaterialTheme.colorScheme.secondary,
        )
    }
}

