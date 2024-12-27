package com.irempamukcu.homework5


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent

import androidx.activity.viewModels

import com.irempamukcu.homework5.ui.theme.Homework5Theme

import com.irempamukcu.homework5.ui.screen.AllPagesComposable


import com.irempamukcu.homework5.ui.viewmodels.MainPageViewModel


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        window.statusBarColor = android.graphics.Color.BLACK

        val mainPageViewModel : MainPageViewModel by viewModels()

        setContent {
            Homework5Theme {
                AllPagesComposable(mainPageViewModel = mainPageViewModel)
            }
        }
    }
}

