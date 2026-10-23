package me.davidgomez.facebook.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import me.davidgomez.facebook.ui.screens.FeedScreen
import me.davidgomez.facebook.ui.screens.Recuperación

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            val myNavController = rememberNavController()
            NavHost(
                navController = myNavController,
                startDestination = "login",
                modifier = Modifier.fillMaxSize()
            ) {
                composable(route = "login") {
                    Login(onClickRegister = {
                        myNavController.navigate("Register")
                        },
                        onClickIniciarSesion = {
                            myNavController.navigate("feed")
                        },
                        onClickRecuperación = {
                            myNavController.navigate("recuperar")
                        }
                    )
                }
                composable(route = "register") {
                    Register(onClickBack = {
                        myNavController.popBackStack()
                    })
                }
                composable(route = "feed") {
                    FeedScreen()
                }
                composable(route = "recuperar") {
                    Recuperación()
                }
            }
        }
    }
}