package br.senai.sp.jandira.lion_school.screens

import android.content.Context
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
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardCapitalization
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.lion_school.R

@Composable
fun CursesScreen() {

    val searchText = remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(16.dp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(R.drawable.img),
                contentDescription = "Logo",
                modifier = Modifier.size(64.dp)
            )
            Spacer(modifier = Modifier.width(12.dp))
            Column {
                Text(
                    text = "Lion",
                    fontSize = 24.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color(0xFF2B3C88)
                )
                Text(
                    text = "School",
                    fontSize = 24.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color(0xFF2B3C88)
                )
            }
        }

        TextField(
            value = searchText.value,
            onValueChange = { searchText.value = it },
            placeholder = { Text("Find your course") },
            leadingIcon = { Icon(Icons.Default.Search, contentDescription = "Search") },
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 24.dp),
            shape = RoundedCornerShape(12.dp),
        )

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 8.dp)
                .clip(RoundedCornerShape(20.dp))
                .background(
                    Brush.horizontalGradient(
                        colors = listOf(Color(0xFF2B3C88),
                            Color(0xFFB2BDED))
                    )
                )
                .padding(16.dp)
        ) {
            Column {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Image(
                        painter = painterResource(R.drawable.ds),
                        contentDescription = null,
                        modifier = Modifier.size(90.dp)
                    )
                    Spacer(modifier = Modifier.width(12.dp))
                    Text(
                        text = "DS",
                        fontSize = 70.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color(0xFFFFC93C)
                    )
                }
                Spacer(modifier = Modifier
                    .height(8.dp))
                Text("Desenvolvimento de Sistemas",
                    fontWeight = FontWeight.Bold,
                    color = Color.White,
                    fontSize = 18.sp)
                Text("Learn to develop web and mobile applications.",
                    color = Color.White,
                    fontSize = 14.sp)
                Row(modifier = Modifier
                    .padding(top = 8.dp),
                    verticalAlignment = Alignment.CenterVertically) {
                    Icon(
                        painter = painterResource(R.drawable.semestre),
                        contentDescription = null,
                        tint = Color.Yellow,
                        modifier = Modifier.size(16.dp)
                    )
                    Spacer(modifier = Modifier.width(4.dp))
                    Text("3 semesters", color = Color.White, fontSize = 12.sp)
                }
            }
        }

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 8.dp)
                .clip(RoundedCornerShape(20.dp))
                .background(
                    Brush.horizontalGradient(
                        colors = listOf(Color(0xFF2B3C88), Color(0xFFB2BDED))
                    )
                )
                .padding(16.dp)
        ) {
            Column {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Image(
                        painter = painterResource(R.drawable.internet),
                        contentDescription = null,
                        modifier = Modifier.size(90.dp)
                    )
                    Spacer(modifier = Modifier.width(12.dp))
                    Text("RDS", fontSize = 70.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color(0xFFFFC93C))
                }
                Spacer(modifier = Modifier
                    .height(8.dp))
                Text("Redes de Computadores",
                    fontWeight = FontWeight.Bold,
                    color = Color.White, fontSize = 18.sp)
                Text("Learn to design communication networks.",
                    color = Color.White,
                    fontSize = 14.sp)
                Row(modifier = Modifier
                    .padding(top = 8.dp),
                    verticalAlignment = Alignment.CenterVertically) {
                    Icon(
                        painter = painterResource(R.drawable.semestre),
                        contentDescription = null,
                        tint = Color.Yellow,
                        modifier = Modifier.size(16.dp)
                    )
                    Spacer(modifier = Modifier.width(4.dp))
                    Text("3 semesters", color = Color.White, fontSize = 12.sp)
                }
            }
        }


        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 8.dp)
                .clip(RoundedCornerShape(20.dp))
                .background(
                    Brush.horizontalGradient(
                        colors = listOf(Color(0xFF2B3C88), Color(0xFFB2BDED))
                    )
                )
                .padding(16.dp)
        ) {
            Column {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Image(
                        painter = painterResource(R.drawable.eletro),
                        contentDescription = null,
                        modifier = Modifier.size(90.dp)
                    )
                    Spacer(modifier = Modifier.width(12.dp))
                    Text("ELE", fontSize = 70.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color(0xFFFFC93C))
                }
                Spacer(modifier = Modifier.height(8.dp))
                Text("Eletroeletrônica",
                    fontWeight = FontWeight.Bold,
                    color = Color.White,
                    fontSize = 18.sp)
                Text("Learn to design communication networks.",
                    color = Color.White,
                    fontSize = 14.sp)
                Row(modifier = Modifier
                    .padding(top = 8.dp),
                    verticalAlignment = Alignment.CenterVertically) {
                    Icon(
                        painter = painterResource(R.drawable.semestre),
                        contentDescription = null,
                        tint = Color.Yellow,
                        modifier = Modifier.size(16.dp)
                    )
                    Spacer(modifier = Modifier.width(4.dp))
                    Text("3 semesters", color = Color.White, fontSize = 12.sp)
                }
            }
        }
    }
}


    @Preview(showSystemUi = true)
    @Composable
    private fun CursesScreenPreview() {
        CursesScreen()
    }