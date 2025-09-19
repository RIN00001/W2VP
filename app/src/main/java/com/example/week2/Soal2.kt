package com.example.week2

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Soal2View(){
    var name by remember { mutableStateOf("") }
    var number by remember { mutableStateOf("") }
    var date by remember { mutableStateOf("") }
    var ccv by remember { mutableStateOf("") }
    Column(

        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(100.dp)
                .background(Color(0xFFE0A64A))
                .padding(12.dp)
        ) {

            Box(
                modifier = Modifier
                    .align(Alignment.CenterStart)
                    .background(Color.LightGray, shape = RoundedCornerShape(50))
                    .padding(horizontal = 12.dp, vertical = 6.dp)
            ) {
                Text("<-- Go back", color = Color.White)
            }

            Text(
                "My Basket",
                color = Color.White,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.align(Alignment.Center),
                fontSize = 20.sp
            )
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.LightGray)
                .padding(12.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Image(
                    painter = painterResource(R.drawable.item_fish_and_chips),
                    contentDescription = "Fish and Chips",
                    modifier = Modifier.height(100.dp)
                )
                Spacer(Modifier.width(8.dp))
                Column {
                    Text("Fish & Chips", fontWeight = FontWeight.Bold)
                    Text("2 portion", color = Color.Gray)
                    Spacer(Modifier.height(8.dp))
                    Text("Rp120.000", fontWeight = FontWeight.Bold)
                }
            }
            Text("Rp240.000", fontSize = 20.sp ,fontWeight = FontWeight.Bold)
        }

        Spacer(Modifier.height(24.dp))

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.White)
                .padding(16.dp)
        ){
            Icon(
                imageVector = Icons.Default.Close,
                contentDescription = "Close Icon",
                tint = Color.Gray,
                modifier = Modifier
                    .size(24.dp)
                    .align(Alignment.TopEnd)
            )
        }

        Column (
            modifier = Modifier
                .fillMaxWidth()

                .padding(12.dp),
        ){

            Text("Card Holders Name", fontSize = 18.sp ,fontWeight = FontWeight.Bold)
            OutlinedTextField(
                value = name,
                onValueChange = { name = it },
                placeholder = {Text("Rifki Indra")},
                modifier = Modifier.fillMaxWidth()
                    .padding(vertical = 8.dp)
                ,   colors = TextFieldDefaults.colors(
                    focusedContainerColor = Color.White,
                    unfocusedTextColor = Color.White,
                    disabledTextColor =  Color.White,
                    errorContainerColor = Color.White,
                    focusedIndicatorColor = Color.Transparent,
                    unfocusedIndicatorColor = Color.Transparent,
                    disabledIndicatorColor = Color.Transparent,
                    errorIndicatorColor = Color.Transparent
                )
            )

            Spacer(Modifier.height(12.dp))

            Text("Card Number", fontSize = 18.sp ,fontWeight = FontWeight.Bold)
            OutlinedTextField(
                value = number,
                onValueChange = { number = it },
                placeholder = { Text("1234 5678 9012 1314") },
                modifier = Modifier.fillMaxWidth()
                    .padding(vertical = 8.dp)
                ,   colors = TextFieldDefaults.colors(
                    focusedContainerColor = Color.White,
                    unfocusedTextColor = Color.White,
                    disabledTextColor =  Color.White,
                    errorContainerColor = Color.White,
                    focusedIndicatorColor = Color.Transparent,
                    unfocusedIndicatorColor = Color.Transparent,
                    disabledIndicatorColor = Color.Transparent,
                    errorIndicatorColor = Color.Transparent
                )
            )

            Spacer(Modifier.height(12.dp))
            Row (modifier = Modifier.fillMaxWidth()
                , horizontalArrangement = Arrangement.spacedBy(12.dp)
            ){
                Column(modifier = Modifier.weight(1f)) {
                    Text("Date", fontSize = 18.sp ,fontWeight = FontWeight.Bold)
                    OutlinedTextField(
                        value = date,
                        onValueChange = { date = it },
                        placeholder = { Text("10/30") },
                        modifier = Modifier.fillMaxWidth()
                            .padding(vertical = 8.dp)
                        ,   colors = TextFieldDefaults.colors(
                            focusedContainerColor = Color.White,
                            unfocusedTextColor = Color.White,
                            disabledTextColor =  Color.White,
                            errorContainerColor = Color.White,
                            focusedIndicatorColor = Color.Transparent,
                            unfocusedIndicatorColor = Color.Transparent,
                            disabledIndicatorColor = Color.Transparent,
                            errorIndicatorColor = Color.Transparent
                        )
                    )
                }
                Column (
                    modifier = Modifier.weight(1f)
                ){
                    Text("CVV", fontSize = 18.sp ,fontWeight = FontWeight.Bold)
                    OutlinedTextField(
                        value = ccv,
                        onValueChange = { ccv = it },
                        placeholder = { Text("123") },
                        modifier = Modifier.fillMaxWidth()
                            .padding(vertical = 8.dp)
                        ,   colors = TextFieldDefaults.colors(
                            focusedContainerColor = Color.White,
                            unfocusedTextColor = Color.White,
                            disabledTextColor =  Color.White,
                            errorContainerColor = Color.White,
                            focusedIndicatorColor = Color.Transparent,
                            unfocusedIndicatorColor = Color.Transparent,
                            disabledIndicatorColor = Color.Transparent,
                            errorIndicatorColor = Color.Transparent
                        )
                    )
                }
            }
            Spacer(Modifier.height(24.dp))

            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color(0xFFE0A64A), RoundedCornerShape(30.dp))
                    .padding(vertical = 16.dp),
                contentAlignment = Alignment.Center
                ){
                Text("Complete Order", color = Color.White, fontSize = 18.sp ,fontWeight = FontWeight.Bold)
            }
        }


    }
}
@Preview(showBackground = true, showSystemUi = true)
@Composable
fun Soal2Preview(){
    Soal2View()
}
