package com.example.captaingame

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import com.example.captaingame.ui.theme.CaptainGameTheme
import kotlin.random.Random

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CaptainGameTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    CaptainGame(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}

@Composable
fun CaptainGame(modifier: Modifier = Modifier) {
    var treasuresFound by remember { mutableIntStateOf(0) }
    var direction by remember { mutableStateOf("North") }
    var stormOrTreasure by remember { mutableStateOf("") }

    Column(modifier) {
        Text(text = "Treasures Found: ${treasuresFound}")
        Text(text = "Treasures Found: ${direction}")
        Text(text = "Storm or Treasure: ${stormOrTreasure}")
        Button(onClick = {
            direction = "East"

            if (Random.nextBoolean()) {
                treasuresFound += 1
                stormOrTreasure = "Found a Treasure!"
            } else {
                stormOrTreasure = "Storm Ahead!"
            }
        }) {
            Text("Sail East")
        }
        Button(onClick = {
            direction = "West"

            if (Random.nextBoolean()) {
                treasuresFound += 1
                stormOrTreasure = "Found a Treasure!"
            } else {
                stormOrTreasure = "Storm Ahead!"
            }
        }) {
            Text("Sail West")
        }
        Button(onClick = {
            direction = "North"

            if (Random.nextBoolean()) {
                treasuresFound += 1
                stormOrTreasure = "Found a Treasure!"
            } else {
                stormOrTreasure = "Storm Ahead!"
            }
        }) {
            Text("Sail North")
        }
        Button(onClick = {
            direction = "South"

            if (Random.nextBoolean()) {
                treasuresFound += 1
                stormOrTreasure = "Found a Treasure!"
            } else {
                stormOrTreasure = "Storm Ahead!"
            }
        }) {
            Text("Sail South")
        }
    }
}
