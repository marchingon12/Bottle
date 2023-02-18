package com.marchingon12.bottle

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.marchingon12.bottle.ui.common.NavigationController
import com.marchingon12.bottle.ui.theme.BottleTheme
import timber.log.Timber

class MainActivity : ComponentActivity() {
    lateinit var navController: NavHostController
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BottleTheme {
                // A surface container using the 'background' color from the theme
                navController = rememberNavController()
                NavigationController(navController = navController)

                Timber.d("App launched :D")
            }
        }
    }
}
