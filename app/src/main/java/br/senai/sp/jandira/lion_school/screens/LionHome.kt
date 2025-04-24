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
fun LionHome(){
    var nameState = remember  {
        mutableStateOf("")

    }

    var isErrorState = remember {
        mutableStateOf(false)
    }


    val context = LocalContext.current

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 16.dp),
        verticalArrangement = Arrangement.SpaceBetween,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {


        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 40.dp),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            // Imagem da escola
            Image(
                painter = painterResource(R.drawable.img),
                contentDescription = stringResource(R.string.logo),
                modifier = Modifier
                    .size(200.dp)
                    .padding(end = 8.dp)
            )

            // Nome da escola
            Text(
                text = stringResource(R.string.welcome),
                color = Color.Black,
                fontSize = 50.sp,
                fontWeight = FontWeight.Bold
            )
        }
        Spacer(modifier = Modifier.height(32.dp))


        Text(
            text = "Find your favorite course",
            fontSize = 22.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0xFF1A73E8)
        )


        Text(
            text = "Get to your destination faster, study at the best vocational school in Brazil. Be the best version of yourself.",
            fontSize = 20.sp,
            color = Color.Gray,
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(vertical = 16.dp)
        )


        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 24.dp)
                .background(color = Color(0xFFFDBA2D), shape = RoundedCornerShape(50.dp))
                .padding(vertical = 12.dp),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = "Get Started",
                fontWeight = FontWeight.Bold,
                color = Color(0xFF2D3E50)
            )
        }
        Spacer(modifier = Modifier.height(40.dp))

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 45.dp, vertical = 30.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(R.drawable.img_4),
                contentDescription = stringResource(R.string.logo),
                modifier = Modifier.size(30.dp)
            )
            Image(
                painter = painterResource(R.drawable.img_3),
                contentDescription = stringResource(R.string.logo),
                modifier = Modifier.size(30.dp)
            )
            Image(
                painter = painterResource(R.drawable.img_1),
                contentDescription = stringResource(R.string.logo),
                modifier = Modifier.size(30.dp)
            )
            Image(
                painter = painterResource(R.drawable.img_2),
                contentDescription = stringResource(R.string.logo),
                modifier = Modifier.size(30.dp)
            )
        }
    }


}









@Preview(showSystemUi = true)
@Composable
private fun HomeScreenPreview() {
    LionHome()
}
