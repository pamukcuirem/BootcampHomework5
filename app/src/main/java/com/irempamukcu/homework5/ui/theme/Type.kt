package com.irempamukcu.homework5.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.irempamukcu.homework5.R

// Set of Material typography styles to start with
val Typography = Typography(
    bodyLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.5.sp
    )
    /* Other default text styles to override
    titleLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 22.sp,
        lineHeight = 28.sp,
        letterSpacing = 0.sp
    ),
    labelSmall = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Medium,
        fontSize = 11.sp,
        lineHeight = 16.sp,
        letterSpacing = 0.5.sp
    )
    */
)

//my fonts

val amazonEmberBold = FontFamily(Font(R.font.amazonemberbold))
val amazonEmberBoldItalic = FontFamily(Font(R.font.amazonemberbolditalic))
val amazonEmberHeavy = FontFamily(Font(R.font.amazonemberheavy))
val amazonEmberHeavyItalic = FontFamily(Font(R.font.amazonemberheavyitalic))
val amazonEmberLight = FontFamily(Font(R.font.amazonemberlight))
val amazonEmberLightItalic = FontFamily(Font(R.font.amazonemberlightitalic))
val amazonEmberMedium = FontFamily(Font(R.font.amazonembermedium))
val amazonEmberMediumItalic = FontFamily(Font(R.font.amazonembermediumitalic))
val amazonEmberRegular = FontFamily(Font(R.font.amazonemberregular))
val amazonEmberRegularItalic = FontFamily(Font(R.font.amazonemberregularitalic))
val amazonEmberThin = FontFamily(Font(R.font.amazonemberthin))
val amazonEmberThinItalic = FontFamily(Font(R.font.amazonemberthinitalic))