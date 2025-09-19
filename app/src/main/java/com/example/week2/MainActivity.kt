package com.example.week2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.week2.ui.theme.Week2Theme
import com.example.week3.Soal3View
import androidx.compose.material3.Button

//Todo Adapt all soal from other file to this project
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Week2Theme {
                Menu()
            }
        }
    }
}
@Preview(showBackground = true, showSystemUi = true)
@Composable
fun Menu() {
    var curScreen by remember { mutableStateOf("Menu") }

    Scaffold { innerPadding ->
        Box(modifier = Modifier
            .fillMaxSize()
            .padding(innerPadding)) {

            when (curScreen) {
                "Menu" -> {
                    Column (
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(24.dp),
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Text("Pilih Soal", fontSize = 24.sp, fontWeight = FontWeight.Bold)

                        Spacer(modifier = Modifier.padding(16.dp))

                        Button(onClick = { curScreen = "Soal1" }, modifier = Modifier.fillMaxWidth()) {
                            Text("Soal 1")
                        }
                        Spacer(modifier = Modifier.padding(8.dp))

                        Button(onClick = { curScreen = "Soal2" }, modifier = Modifier.fillMaxWidth()) {
                            Text("Soal 2")
                        }
                        Spacer(modifier = Modifier.padding(8.dp))

                        Button(onClick = { curScreen = "Soal3" }, modifier = Modifier.fillMaxWidth()) {
                            Text("Soal 3")
                        }
                        Spacer(modifier = Modifier.padding(8.dp))

                        Button(onClick = { curScreen = "Soal4" }, modifier = Modifier.fillMaxWidth()) {
                            Text("Soal 4")
                        }
                    }
                }

                "Soal1" -> Soal1View(onNavigate = { curScreen = it })
                "Soal2" -> Soal2View(onNavigate = { curScreen = it })
                "Soal3" -> Soal3View(onNavigate = { curScreen = it })
                "Soal4" -> Soal4View(onNavigate = { curScreen = it })
            }
        }
    }
}


