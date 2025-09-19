package com.example.week3

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Receipt
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.week2.Poppins
import com.example.week2.R

@Composable
fun Soal3View(onNavigate: (String) -> Unit) {
    Box(
        modifier = Modifier.fillMaxSize()
    ){
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(Color(0xFF2F5D50))
        ) {

            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 16.dp)
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 16.dp, vertical = 12.dp),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text("Beranda", color = Color.White, fontSize = 20.sp, fontWeight = FontWeight.Bold)
                    Icon(Icons.Default.Notifications, contentDescription = "Notif", tint = Color.White)
                }


                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(150.dp)
                        .padding(horizontal = 16.dp),
                    contentAlignment = Alignment.Center
                ) {
                    Image(
                        painter = painterResource(R.drawable.green_simple_welcome_banner),
                        contentDescription = "Banner",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .clip(RoundedCornerShape((12.dp)))
                            .fillMaxSize()
                    )
                }
            }

            Spacer(Modifier.height(16.dp))


            Spacer(Modifier.height(24.dp))

            Column(modifier = Modifier
                .fillMaxSize()
                .clip(RoundedCornerShape(topStart = 24.dp, topEnd = 24.dp))
                .background(Color.White)
                .padding(horizontal = 16.dp)

            ) {
                Spacer(Modifier.height(24.dp))
                Text("Pengajuan Permohonan dan Status",
                    fontSize = 28.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color(0xFF1A237E)
                )

                Spacer(Modifier.height(16.dp))

                Row(
                    modifier = Modifier
                        .background(Color(0xFF0D47A1), RoundedCornerShape(8.dp))
                        .padding(horizontal = 16.dp, vertical = 10.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text("Pengajuan Permohonan", fontSize = 18.sp, color = Color.White, fontWeight = FontWeight.Bold)
                    Spacer(Modifier.width(8.dp))
                    Icon(Icons.Default.Add, contentDescription = "Add", tint = Color.White)
                }

                Spacer(Modifier.height(16.dp))


                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(Color(0xFF2F5D50), RoundedCornerShape(12.dp))
                        .padding(16.dp)
                ) {
                    Text("Rifki Indra Nugroho", color = Color.White, fontWeight = FontWeight.Bold)
                    Spacer(Modifier.height(8.dp))
                    Text("Jumlah Pemohon           : 1 orang", color = Color.White)
                    Text("Tanggal Kedatangan      : Selasa, 2 September 2025", color = Color.White)
                    Text("Jam Kedatangan            : (10:01 - 11:00)", color = Color.White)
                    Text("Status                                : NGUTANG ", color = Color.White, fontWeight = FontWeight.Bold)
                }
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Button(
                        onClick = {onNavigate("Menu")},
                        colors = ButtonDefaults.buttonColors(containerColor = Color.Red),
                        modifier = Modifier.weight(1f)
                    ) {
                        Text("Back to menu", color = Color.White, fontFamily = Poppins)
                    }
                }
            }

            Spacer(Modifier.weight(1f))

        }
        Row(
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .fillMaxWidth()
                .clip(RoundedCornerShape(topStart = 16.dp, topEnd = 16.dp))
                .background(Color(0xFF0D47A1))
                .padding(vertical = 12.dp),
            horizontalArrangement = Arrangement.SpaceEvenly,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Box(
                modifier = Modifier
                    .clip(RoundedCornerShape(50))
                    .background(Color.White.copy(alpha = 0.2f))
                    .padding(horizontal = 16.dp, vertical = 6.dp),
                contentAlignment = Alignment.Center
            ){
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    Icon(Icons.Default.Home, contentDescription = "Home", tint = Color.White)
                    Text("Beranda", color = Color.White, fontSize = 12.sp)
                }
            }

            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Icon(Icons.Default.Receipt, contentDescription = "Riwayat", tint = Color.LightGray)
                Text("Riwayat", color = Color.LightGray, fontSize = 12.sp)
            }
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Icon(Icons.Default.Info, contentDescription = "Informasi", tint = Color.LightGray)
                Text("Informasi", color = Color.LightGray, fontSize = 12.sp)
            }
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Icon(Icons.Default.Person, contentDescription = "Profile", tint = Color.LightGray)
                Text("Profile", color = Color.LightGray, fontSize = 12.sp)
            }
        }
    }

}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun Soal3Preview() {
    Soal3View(onNavigate = {})
}
