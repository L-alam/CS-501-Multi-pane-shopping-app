package com.example.multi_paneshoppingapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.multi_paneshoppingapp.ui.theme.MultipaneShoppingAppTheme
import android.content.res.Configuration
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.unit.dp
import androidx.compose.ui.platform.LocalConfiguration
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MultipaneShoppingAppTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    ShoppingApp()
                }
            }
        }
    }
}

@Composable
fun ShoppingApp() {
    val navController = rememberNavController()
    val configuration = LocalConfiguration.current
    val isLandscape = configuration.orientation == Configuration.ORIENTATION_LANDSCAPE

    var selectedProduct by remember { mutableStateOf<Product?>(null) }

    if (isLandscape) {
        Row(modifier = Modifier.fillMaxSize()) {
            Column(modifier = Modifier.weight(1f)) {
                ProductList(onProductSelected = { selectedProduct = it })
            }
            Column(modifier = Modifier.weight(1f)) {
                ProductDetails(product = selectedProduct)
            }
        }
    } else {
        NavHost(navController = navController, startDestination = "productList") {
            composable("productList") {
                ProductList(onProductSelected = { product ->
                    navController.navigate("productDetails/${product.name}")
                })
            }
            composable("productDetails/{productName}") { backStackEntry ->
                val productName = backStackEntry.arguments?.getString("productName")
                val product = products.find { it.name == productName }
                ProductDetails(product = product, navController = navController)
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun ShoppingAppPreview() {
    ShoppingApp()
}
