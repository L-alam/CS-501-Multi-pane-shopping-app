package com.example.multi_paneshoppingapp

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun ProductDetails(product: Product?, navController: NavController? = null) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.SpaceBetween,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Column(
            modifier = Modifier.weight(1f),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            if (product != null) {
                Text(text = product.name, style = MaterialTheme.typography.headlineMedium)
                Text(text = product.price, style = MaterialTheme.typography.bodyLarge)
                Text(text = product.description, style = MaterialTheme.typography.bodyMedium)
            } else {
                Text(text = "Select a product to view details", style = MaterialTheme.typography.bodyLarge)
            }
        }

        if (navController != null) {
            Button(
                onClick = { navController.popBackStack() },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp),
            ) {
                Text(text = "Back to Product List")
            }
        }
    }
}