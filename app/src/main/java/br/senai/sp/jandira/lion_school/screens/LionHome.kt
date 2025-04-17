package br.senai.sp.jandira.lion_school.screens

import android.content.Context
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
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
                .fillMaxSize(),
            verticalArrangement = Arrangement.SpaceBetween,
            horizontalAlignment = Alignment.CenterHorizontally


            ) {


                //Row para a imagem e o texto "Welcome"
                Row(
                    modifier = Modifier
                        .padding(top = 40.dp)
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.Center,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    // Imagem do logo
                    Image(
                        painter = painterResource(R.drawable.img),
                        contentDescription = stringResource(R.string.logo),
                        modifier = Modifier
                            .size(200.dp)
                    )


                    Text(
                        text = stringResource(R.string.welcome),
                        color = Color.Black,
                        fontSize = 55.sp,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier.padding(start = 16.dp) // Adiciona espaçamento entre a imagem e o texto
                    )
                }

            Row (
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 45.dp, vertical = 30.dp),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically

            ) {
                Image(
                    painter = painterResource(R.drawable.img_4),
                    contentDescription = stringResource(R.string.logo),
                    modifier = Modifier
                        .size(30.dp),
                )
                Image(
                    painter = painterResource(R.drawable.img_3),
                    contentDescription = stringResource(R.string.logo),
                    modifier = Modifier
                        .size(30.dp)
                )
                Image(
                    painter = painterResource(R.drawable.img_1),
                    contentDescription = stringResource(R.string.logo),
                    modifier = Modifier
                        .size(30.dp)
                )
                Image(
                    painter = painterResource(R.drawable.img_2),
                    contentDescription = stringResource(R.string.logo),
                    modifier = Modifier
                        .size(30.dp)
                )
            }
        }
}









@Preview(showSystemUi = true)
@Composable
private fun HomeScreenPreview() {
    LionHome()
}
