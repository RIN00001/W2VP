package com.example.week2

import android.widget.Space
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
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
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color


@Composable
fun Soal1View(){
    var text by remember { mutableStateOf("") }
    Column(

        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFd6d6d6))
            .padding(16.dp)
            .statusBarsPadding()
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 8.dp),

            horizontalArrangement = Arrangement.SpaceBetween

        ) {
            Image(
                painter = painterResource(
                    id = R.drawable.burger
                ) , contentDescription = "Icon Burger"
                , modifier = Modifier
                    .size(40.dp)
            )
                Row (
                    verticalAlignment = Alignment.CenterVertically
                    , modifier = Modifier
                        .background(Color.Red, shape = RoundedCornerShape(20.dp))
                ) {
                    Image(
                        painter = painterResource(
                            id = R.drawable.shopping_cart
                        ), contentDescription = "Icon Shopping Cart"
                        , modifier = Modifier
                            .size(30.dp)
                    )
                    Text("My Basket", color = Color.White, modifier = Modifier.padding(horizontal = 8.dp))
                }
        }

        Spacer(Modifier.height(16.dp))
        Text("Hello Bella,"
        , fontSize = 21.sp
        )
        Text("What food do you do you want today?"
            , fontSize = 24.sp
            , fontWeight = FontWeight.Bold
        )

        Spacer(Modifier.height(16.dp))

            OutlinedTextField(
                value = text,
                onValueChange = { input ->
                    text = input
                },
                label = {Text("Search food")},
                leadingIcon = {
                    Icon(
                        imageVector = Icons.Default.Search,
                        contentDescription = "Search Icon"
                    )
                },
                singleLine = true,
                modifier = Modifier
                    .fillMaxWidth(),
                    shape = RoundedCornerShape(16.dp),
                    colors = TextFieldDefaults.colors(
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

        Spacer(Modifier.height(16.dp))
        Text("Recommended Food"
        , fontSize = 22.sp
        , fontWeight = FontWeight.Bold
        )
        //Food
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 8.dp),
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            Box(
                modifier = Modifier
                    .width(140.dp)
                    .clip(RoundedCornerShape(8.dp))
                    .background(Color.White)
                    .padding(8.dp)
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Spacer(Modifier.height(8.dp))

                    Image(
                        painter = painterResource(id = R.drawable.item_biryani),
                        contentDescription = "Biryani",
                        modifier = Modifier
                            .size(100.dp)
                            .padding(vertical = 8.dp)
                    )

                    Text("Biryani")

                    Spacer(Modifier.height(4.dp))

                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text("Rp.110.000")
                        Icon(
                            imageVector = Icons.Default.Add,
                            contentDescription = "Add Icon",
                            tint = Color.Red,
                            modifier = Modifier.size(18.dp)
                        )
                    }
                }

                Icon(
                    imageVector = Icons.Default.FavoriteBorder,
                    contentDescription = "Favorite Icon",
                    tint = Color.Gray,
                    modifier = Modifier
                        .size(18.dp)
                        .align(Alignment.TopEnd)
                )
            }

            Box(
                modifier = Modifier
                    .width(140.dp)
                    .clip(RoundedCornerShape(8.dp))
                    .background(Color.White)
                    .padding(8.dp)
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Spacer(Modifier.height(8.dp))

                    Image(
                        painter = painterResource(id = R.drawable.item_sticky_honey_roast),
                        contentDescription = "LSteak",
                        modifier = Modifier
                            .size(100.dp)
                            .padding(vertical = 8.dp)
                    )

                    Text("LSteak")

                    Spacer(Modifier.height(4.dp))

                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text("Rp.210.000")
                        Icon(
                            imageVector = Icons.Default.Add,
                            contentDescription = "Add Icon",
                            tint = Color.Red,
                            modifier = Modifier.size(18.dp)
                        )
                    }
                }

                Icon(
                    imageVector = Icons.Default.FavoriteBorder,
                    contentDescription = "Favorite Icon",
                    tint = Color.Gray,
                    modifier = Modifier
                        .size(18.dp)
                        .align(Alignment.TopEnd)
                )
            }
        }

        Spacer(Modifier.height(16.dp))

        Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 2.dp)
            , horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Column {
                Text("Hottest"
                    , fontSize = 22.sp
                    , fontWeight = FontWeight.Bold
                )
            }
            Column {
                Text("Popular"
                    , fontSize = 20.sp
                    , color = Color.Gray
                )
            }
            Column {
                Text("New combo"
                    , fontSize = 20.sp
                    , color = Color.Gray
                )
            }
            Column {
                Text("Top"
                    , fontSize = 20.sp
                    , color = Color.Gray
                )
            }

        }
        Spacer(Modifier.height(16.dp))
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .horizontalScroll(rememberScrollState())
                .padding(vertical = 8.dp),
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            Box(
                modifier = Modifier
                    .width(140.dp)
                    .clip(RoundedCornerShape(8.dp))
                    .background(Color(0xFFFFF9C4))
                    .padding(8.dp)
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Spacer(Modifier.height(8.dp))

                    Image(
                        painter = painterResource(id = R.drawable.item_biryani),
                        contentDescription = "Biryani",
                        modifier = Modifier
                            .size(100.dp)
                            .padding(vertical = 8.dp)
                    )

                    Text("Biryani")

                    Spacer(Modifier.height(4.dp))

                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text("Rp.110.000")
                        Icon(
                            imageVector = Icons.Default.Add,
                            contentDescription = "Add Icon",
                            tint = Color.Red,
                            modifier = Modifier.size(18.dp)
                        )
                    }
                }

                Icon(
                    imageVector = Icons.Default.FavoriteBorder,
                    contentDescription = "Favorite Icon",
                    tint = Color.Gray,
                    modifier = Modifier
                        .size(18.dp)
                        .align(Alignment.TopEnd)
                )
            }

            Box(
                modifier = Modifier
                    .width(140.dp)
                    .clip(RoundedCornerShape(8.dp))
                    .background(Color(0xFFF8BBD0))
                    .padding(8.dp)
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier.fillMaxWidth()

                ) {
                    Spacer(Modifier.height(8.dp))

                    Image(
                        painter = painterResource(id = R.drawable.item_sticky_honey_roast),
                        contentDescription = "LSteak",
                        modifier = Modifier
                            .size(100.dp)
                            .padding(vertical = 8.dp)
                    )

                    Text("LSteak")

                    Spacer(Modifier.height(4.dp))

                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text("Rp.210.000")
                        Icon(
                            imageVector = Icons.Default.Add,
                            contentDescription = "Add Icon",
                            tint = Color.Red,
                            modifier = Modifier.size(18.dp)
                        )
                    }
                }

                Icon(
                    imageVector = Icons.Default.FavoriteBorder,
                    contentDescription = "Favorite Icon",
                    tint = Color.Gray,
                    modifier = Modifier
                        .size(18.dp)
                        .align(Alignment.TopEnd)
                )
            }
            Box(
                modifier = Modifier
                    .width(140.dp)
                    .clip(RoundedCornerShape(8.dp))
                    .background(Color(0xFFC8E6C9))
                    .padding(8.dp)
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier.fillMaxWidth()

                ) {
                    Spacer(Modifier.height(8.dp))

                    Image(
                        painter = painterResource(id = R.drawable.item_fish_and_chips),
                        contentDescription = "Fish & Chips",
                        modifier = Modifier
                            .size(100.dp)
                            .padding(vertical = 8.dp)
                    )

                    Text("Fish & Chips")

                    Spacer(Modifier.height(4.dp))

                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text("Rp.130.000")
                        Icon(
                            imageVector = Icons.Default.Add,
                            contentDescription = "Add Icon",
                            tint = Color.Red,
                            modifier = Modifier.size(18.dp)
                        )
                    }
                }

                Icon(
                    imageVector = Icons.Default.FavoriteBorder,
                    contentDescription = "Favorite Icon",
                    tint = Color.Gray,
                    modifier = Modifier
                        .size(18.dp)
                        .align(Alignment.TopEnd)
                )
            }

        }
    }
}






@Preview(showBackground = true, showSystemUi = true)
@Composable
fun Soal1Preview(){
Soal1View()
}