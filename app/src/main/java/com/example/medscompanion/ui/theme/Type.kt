package com.example.medscompanion.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.medscompanion.R

// Set of Material typography styles to start with
val Spartan = FontFamily(
    Font(R.font.spartan_regular, weight = FontWeight.Normal),
    Font(R.font.spartan_medium, weight = FontWeight.Medium),
    Font(R.font.spartan_bold, weight = FontWeight.Bold)
)
val SpartanTypography = Typography(
    titleLarge = TextStyle(
        fontFamily = Spartan,
        fontWeight = FontWeight.Bold,
        fontSize = 28.sp
    ),
    bodyLarge = TextStyle(
        fontFamily = Spartan,
        fontWeight = FontWeight.Bold,
        fontSize = 24.sp
    ),
    bodyMedium = TextStyle(
        fontFamily = Spartan,
        fontWeight = FontWeight.Normal,
        fontSize = 18.sp
    ),
    bodySmall = TextStyle(
        fontFamily = Spartan,
        fontWeight = FontWeight.Normal,
        lineHeight = 14.sp,
        fontSize = 14.sp
    )
)