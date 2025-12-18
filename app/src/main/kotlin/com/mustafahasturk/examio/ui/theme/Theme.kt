package com.mustafahasturk.examio.ui.theme

import android.app.Activity
import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext

private val DarkColorScheme = darkColorScheme(
    primary = PrimaryDark,
    onPrimary = androidx.compose.ui.graphics.Color.White,
    primaryContainer = PrimaryVariantDark,
    onPrimaryContainer = androidx.compose.ui.graphics.Color.White,
    secondary = SecondaryDark,
    onSecondary = androidx.compose.ui.graphics.Color.White,
    secondaryContainer = SecondaryVariantDark,
    onSecondaryContainer = androidx.compose.ui.graphics.Color.White,
    tertiary = TertiaryDark,
    onTertiary = androidx.compose.ui.graphics.Color.White,
    background = BackgroundDark,
    onBackground = androidx.compose.ui.graphics.Color(0xFFE0E0E0),
    surface = SurfaceDark,
    onSurface = androidx.compose.ui.graphics.Color(0xFFE0E0E0)
)

private val LightColorScheme = lightColorScheme(
    primary = Primary,
    onPrimary = androidx.compose.ui.graphics.Color.White,
    primaryContainer = androidx.compose.ui.graphics.Color(0xFFBBDEFB),
    onPrimaryContainer = androidx.compose.ui.graphics.Color(0xFF0D47A1),
    secondary = Secondary,
    onSecondary = androidx.compose.ui.graphics.Color.White,
    secondaryContainer = androidx.compose.ui.graphics.Color(0xFFB2DFDB),
    onSecondaryContainer = androidx.compose.ui.graphics.Color(0xFF004D40),
    tertiary = Tertiary,
    onTertiary = androidx.compose.ui.graphics.Color.White,
    tertiaryContainer = androidx.compose.ui.graphics.Color(0xFFD1C4E9),
    onTertiaryContainer = androidx.compose.ui.graphics.Color(0xFF4A148C),
    background = BackgroundLight,
    onBackground = androidx.compose.ui.graphics.Color(0xFF1C1C1E),
    surface = SurfaceLight,
    onSurface = androidx.compose.ui.graphics.Color(0xFF1C1C1E),
    surfaceVariant = androidx.compose.ui.graphics.Color(0xFFF0F0F0),
    onSurfaceVariant = androidx.compose.ui.graphics.Color(0xFF5F6368)
)

@Composable
fun ExamioTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    // Dynamic color is available on Android 12+
    dynamicColor: Boolean = true,
    content: @Composable () -> Unit
) {
    val colorScheme = when {
        dynamicColor && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S -> {
            val context = LocalContext.current
            if (darkTheme) dynamicDarkColorScheme(context) else dynamicLightColorScheme(context)
        }

        darkTheme -> DarkColorScheme
        else -> LightColorScheme
    }

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content
    )
}