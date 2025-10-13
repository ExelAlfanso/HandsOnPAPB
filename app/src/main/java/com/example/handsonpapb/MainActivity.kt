package com.example.handsonpapb

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.rememberNavController
import com.example.handsonpapb.ui.navigation.RootNavGraph
import com.example.handsonpapb.ui.theme.HandsOnPAPBTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HandsOnPAPBTheme {
                val navController = rememberNavController()
                RootNavGraph(navController)
            }
        }
    }
}
