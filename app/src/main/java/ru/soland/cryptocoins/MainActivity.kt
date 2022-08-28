package ru.soland.cryptocoins

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import ru.soland.cryptocoins.presentation.ui.theme.CryptoCoinsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CryptoCoinsTheme {
                Surface(color = MaterialTheme.colors.background) {


                }
            }
        }
    }
}