package br.senai.sp.jandira.lion_school.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Card
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
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
fun StudentsScreen() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.White)
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(vertical = 30.dp, horizontal = 10.dp)
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Start
            ) {
                Image(
                    contentDescription = stringResource(R.string.Logo_name),
                    painter = painterResource(id = R.drawable.img),
                    modifier = Modifier
                        .width(60.dp)
                        .height(60.dp)
                )
                Column(
                    modifier = Modifier.weight(1f)
                ) {
                    Text(
                        modifier = Modifier
                            .padding(bottom = 5.dp),
                        text = stringResource(R.string.Logo_name),
                        fontSize = 15.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color(0xFF3347B0)
                    )
                }
                Card(
                    modifier = Modifier
                        .size(45.dp),
                    shape = RoundedCornerShape(50.dp)
                ) {
                    Box(
                        modifier = Modifier
                            .fillMaxSize()
                            .background(color = Color(0xFFFFC23D)),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(
                            text = "DS",
                            fontWeight = FontWeight.Bold,
                            fontSize = 22.sp,
                            color = Color(0xFF3347B0)
                        )
                    }
                }
            }
            HorizontalDivider(
                modifier = Modifier
                    .padding(top = 10.dp, bottom = 25.dp),
                color = Color(0xFFFFC23D)
            )
            OutlinedTextField(
                value = "",
                onValueChange = {},
                modifier = Modifier
                    .fillMaxWidth(),
                shape = RoundedCornerShape(10.dp),
                label = {
                    Text(
                        modifier = Modifier
                            .padding(5.dp),
                        text = stringResource(R.string.search),
                        fontSize = 18.sp
                    )
                },
                trailingIcon = {
                    Icon(
                        imageVector = Icons.Default.Search,
                        contentDescription = ""
                    )
                },
                keyboardOptions = KeyboardOptions(
                    keyboardType = KeyboardType.Text,
                    capitalization = KeyboardCapitalization.Words
                )
            )
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 25.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(12.dp)
            ) {
                Card(
                    modifier = Modifier
                        .height(28.dp)
                        .weight(1f),
                    shape = RoundedCornerShape(50.dp)
                ) {
                    Box(
                        modifier = Modifier
                            .fillMaxSize()
                            .background(color = Color(0xFF3347B0)),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(
                            text = stringResource(R.string.todos),
                            fontWeight = FontWeight.Bold,
                            fontSize = 12.sp,
                            color = Color.White
                        )
                    }
                }

                Card(
                    modifier = Modifier
                        .height(28.dp)
                        .weight(1f),
                    shape = RoundedCornerShape(50.dp)
                ) {
                    Box(
                        modifier = Modifier
                            .fillMaxSize()
                            .background(color = Color(0xFFFFC23D)),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(
                            text = stringResource(R.string.curse),
                            fontWeight = FontWeight.Bold,
                            fontSize = 12.sp,
                            color = Color(0xFF3347B0)
                        )
                    }
                }

                Card(
                    modifier = Modifier
                        .height(28.dp)
                        .weight(1f),
                    shape = RoundedCornerShape(50.dp)
                ) {
                    Box(
                        modifier = Modifier
                            .fillMaxSize()
                            .background(color = Color(0xFFFFC23D)),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(
                            text = stringResource(R.string.finish),
                            fontWeight = FontWeight.Bold,
                            fontSize = 12.sp,
                            color = Color(0xFF3347B0)
                        )
                    }
                }
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 15.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Start
            ) {
                Image(
                    contentDescription = "",
                    painter = painterResource(id = R.drawable.chapeu),
                    modifier = Modifier
                        .width(35.dp)
                        .height(35.dp)
                )
                Text(
                    modifier = Modifier.padding(start = 5.dp),
                    text = stringResource(R.string.list),
                    fontWeight = FontWeight.Bold,
                    fontSize = 22.sp,
                    color = Color(0xFF3347B0)
                )
            }
            Column(
                modifier = Modifier
                    .weight(1f)
            ) {
                Card(
                    modifier = Modifier
                        .fillMaxWidth(1f)
                        .height(100.dp)
                        .padding(top = 5.dp, bottom = 5.dp)
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxSize()
                            .background(
                                brush = Brush.horizontalGradient(
                                    colors = listOf(
                                        Color(0xFFCFD4EA),
                                        Color(0xFFB4BDE3)
                                    )
                                )
                            )
                    ) {
                        Spacer(
                            modifier = Modifier
                                .fillMaxHeight()
                                .width(15.dp)
                                .background(color = Color(0xFFFFC23D))
                        )

                        Row(
                            modifier = Modifier
                                .fillMaxSize()
                                .padding(start = 10.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Card(
                                modifier = Modifier
                                    .size(50.dp),
                                shape = RoundedCornerShape(150.dp)
                            ) {
                                Box(
                                    modifier = Modifier
                                        .fillMaxSize(),
                                    contentAlignment = Alignment.Center,
                                ) {
                                    Image(
                                        contentDescription = "",
                                        painter = painterResource(R.drawable.luana),
                                        modifier = Modifier
                                            .width(50.dp)
                                            .height(50.dp)
                                    )
                                }
                            }
                            Column(
                                modifier = Modifier
                                    .fillMaxHeight()
                                    .padding(start = 10.dp),
                                verticalArrangement = Arrangement.Center
                            ) {
                                Text(
                                    text = "Luana oliveira Dias",
                                    color = Color.White,
                                    fontWeight = FontWeight.Bold,
                                    fontSize = 17.sp
                                )
                                Row(
                                    verticalAlignment = Alignment.CenterVertically
                                ) {
                                    Image(
                                        modifier = Modifier
                                            .width(15.dp)
                                            .height(15.dp),
                                        contentDescription = "",
                                        painter = painterResource(R.drawable.identidade)
                                    )

                                    Text(
                                        modifier = Modifier
                                            .padding(start = 3.dp),
                                        text = "20151001018",
                                        color = Color.White,
                                        fontSize = 11.sp
                                    )
                                }
                            }
                            Row(
                                modifier = Modifier
                                    .padding(start = 100.dp, top = 60.dp),
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                Image(
                                    modifier = Modifier
                                        .width(15.dp)
                                        .height(15.dp),
                                    contentDescription = "",
                                    painter = painterResource(R.drawable.calendario)
                                )
                                Text(
                                    modifier = Modifier
                                        .padding(start = 2.dp),
                                    text = "2022",
                                    color = Color(0xFFFFC23D),
                                    fontSize = 11.sp,
                                    fontWeight = FontWeight.Bold
                                )
                            }
                        }
                    }
                }

                Card(
                    modifier = Modifier
                        .fillMaxWidth(1f)
                        .height(100.dp)
                        .padding(top = 5.dp, bottom = 5.dp)
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxSize()
                            .background(
                                brush = Brush.horizontalGradient(
                                    colors = listOf(
                                        Color(0xFFCFD4EA),
                                        Color(0xFFB4BDE3)
                                    )
                                )
                            )
                    ) {
                        Spacer(
                            modifier = Modifier
                                .fillMaxHeight()
                                .width(15.dp)
                                .background(color = Color(0xFFFFC23D))
                        )

                        Row(
                            modifier = Modifier
                                .fillMaxSize()
                                .padding(start = 10.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Card(
                                modifier = Modifier
                                    .size(50.dp),
                                shape = RoundedCornerShape(150.dp)
                            ) {
                                Box(
                                    modifier = Modifier
                                        .fillMaxSize(),
                                    contentAlignment = Alignment.Center,
                                ) {
                                    Image(
                                        contentDescription = "",
                                        painter = painterResource(R.drawable.pedro_silva),
                                        modifier = Modifier
                                            .width(50.dp)
                                            .height(50.dp)
                                    )
                                }
                            }
                            Column(
                                modifier = Modifier
                                    .fillMaxHeight()
                                    .padding(start = 10.dp),
                                verticalArrangement = Arrangement.Center
                            ) {
                                Text(
                                    text = "Pedro da Silva Borges",
                                    color = Color.White,
                                    fontWeight = FontWeight.Bold,
                                    fontSize = 17.sp
                                )
                                Row(
                                    verticalAlignment = Alignment.CenterVertically
                                ) {
                                    Image(
                                        modifier = Modifier
                                            .width(15.dp)
                                            .height(15.dp),
                                        contentDescription = "",
                                        painter = painterResource(R.drawable.identidade)
                                    )
                                    Text(
                                        modifier = Modifier
                                            .padding(start = 3.dp),
                                        text = "20151001018",
                                        color = Color.White,
                                        fontSize = 11.sp
                                    )
                                }
                            }
                            Row(
                                modifier = Modifier
                                    .padding(start = 100.dp, top = 60.dp),
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                Image(
                                    modifier = Modifier
                                        .width(15.dp)
                                        .height(15.dp),
                                    contentDescription = "",
                                    painter = painterResource(R.drawable.calendario)
                                )
                                Text(
                                    modifier = Modifier
                                        .padding(start = 2.dp),
                                    text = "2022",
                                    color = Color(0xFFFFC23D),
                                    fontSize = 11.sp,
                                    fontWeight = FontWeight.Bold
                                )
                            }
                        }
                    }
                }


                Card(
                    modifier = Modifier
                        .fillMaxWidth(1f)
                        .height(100.dp)
                        .padding(top = 5.dp, bottom = 5.dp)
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxSize()
                            .background(
                                brush = Brush.horizontalGradient(
                                    colors = listOf(
                                        Color(0xFFCFD4EA),
                                        Color(0xFFB4BDE3)
                                    )
                                )
                            )
                    ) {
                        Spacer(
                            modifier = Modifier
                                .fillMaxHeight()
                                .width(15.dp)
                                .background(color = Color(0xFF3741D9))
                        )

                        Row(
                            modifier = Modifier
                                .fillMaxSize()
                                .padding(start = 10.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Card(
                                modifier = Modifier
                                    .size(50.dp),
                                shape = RoundedCornerShape(150.dp)
                            ) {
                                Box(
                                    modifier = Modifier
                                        .fillMaxSize(),
                                    contentAlignment = Alignment.Center,
                                ) {
                                    Image(
                                        contentDescription = "",
                                        painter = painterResource(R.drawable.ana_clara),
                                        modifier = Modifier
                                            .width(50.dp)
                                            .height(50.dp)
                                    )
                                }
                            }
                            Column(
                                modifier = Modifier
                                    .fillMaxHeight()
                                    .padding(start = 10.dp),
                                verticalArrangement = Arrangement.Center
                            ) {
                                Text(
                                    text = "Ana Clara Gomes",
                                    color = Color.White,
                                    fontWeight = FontWeight.Bold,
                                    fontSize = 17.sp
                                )
                                Row(
                                    verticalAlignment = Alignment.CenterVertically
                                ) {
                                    Image(
                                        modifier = Modifier
                                            .width(15.dp)
                                            .height(15.dp),
                                        contentDescription = "",
                                        painter = painterResource(R.drawable.identidade)
                                    )
                                    Text(
                                        modifier = Modifier
                                            .padding(start = 3.dp),
                                        text = "20151001018",
                                        color = Color.White,
                                        fontSize = 11.sp
                                    )
                                }
                            }
                            Row(
                                modifier = Modifier
                                    .padding(start = 100.dp, top = 60.dp),
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                Image(
                                    modifier = Modifier
                                        .width(15.dp)
                                        .height(15.dp),
                                    contentDescription = "",
                                    painter = painterResource(R.drawable.calendario)
                                )
                                Text(
                                    modifier = Modifier
                                        .padding(start = 2.dp),
                                    text = "2022",
                                    color = Color(0xFFFFC23D),
                                    fontSize = 11.sp,
                                    fontWeight = FontWeight.Bold
                                )
                            }
                        }
                    }
                }

                Card(
                    modifier = Modifier
                        .fillMaxWidth(1f)
                        .height(100.dp)
                        .padding(top = 5.dp, bottom = 5.dp)
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxSize()
                            .background(
                                brush = Brush.horizontalGradient(
                                    colors = listOf(
                                        Color(0xFFCFD4EA),
                                        Color(0xFFB4BDE3)
                                    )
                                )
                            )
                    ) {
                        Spacer(
                            modifier = Modifier
                                .fillMaxHeight()
                                .width(15.dp)
                                .background(color = Color(0xFFFFC23D))
                        )

                        Row(
                            modifier = Modifier
                                .fillMaxSize()
                                .padding(start = 10.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Card(
                                modifier = Modifier
                                    .size(50.dp),
                                shape = RoundedCornerShape(150.dp)
                            ) {
                                Box(
                                    modifier = Modifier
                                        .fillMaxSize(),
                                    contentAlignment = Alignment.Center,
                                ) {
                                    Image(
                                        contentDescription = "",
                                        painter = painterResource(R.drawable.fabiana),
                                        modifier = Modifier
                                            .width(50.dp)
                                            .height(50.dp)
                                    )
                                }
                            }
                            Column(
                                modifier = Modifier
                                    .fillMaxHeight()
                                    .padding(start = 10.dp),
                                verticalArrangement = Arrangement.Center
                            ) {
                                Text(
                                    text = "Fabiana Luz Moraes",
                                    color = Color.White,
                                    fontWeight = FontWeight.Bold,
                                    fontSize = 17.sp
                                )
                                Row(
                                    verticalAlignment = Alignment.CenterVertically
                                ) {
                                    Image(
                                        modifier = Modifier
                                            .width(15.dp)
                                            .height(15.dp),
                                        contentDescription = "",
                                        painter = painterResource(R.drawable.identidade)
                                    )
                                    Text(
                                        modifier = Modifier
                                            .padding(start = 3.dp),
                                        text = "20151001018",
                                        color = Color.White,
                                        fontSize = 11.sp
                                    )
                                }
                            }
                            Row(
                                modifier = Modifier
                                    .padding(start = 100.dp, top = 60.dp),
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                Image(
                                    modifier = Modifier
                                        .width(15.dp)
                                        .height(15.dp),
                                    contentDescription = "",
                                    painter = painterResource(R.drawable.calendario)
                                )
                                Text(
                                    modifier = Modifier
                                        .padding(start = 2.dp),
                                    text = "2022",
                                    color = Color(0xFFFFC23D),
                                    fontSize = 11.sp,
                                    fontWeight = FontWeight.Bold
                                )
                            }
                        }
                    }
                }
                Card(
                    modifier = Modifier
                        .fillMaxWidth(1f)
                        .height(100.dp)
                        .padding(top = 5.dp, bottom = 5.dp)
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxSize()
                            .background(
                                brush = Brush.horizontalGradient(
                                    colors = listOf(
                                        Color(0xFFCFD4EA),
                                        Color(0xFFB4BDE3)
                                    )
                                )
                            )
                    ) {
                        Spacer(
                            modifier = Modifier
                                .fillMaxHeight()
                                .width(15.dp)
                                .background(color = Color(0xFF3741D9))
                        )

                        Row(
                            modifier = Modifier
                                .fillMaxSize()
                                .padding(start = 10.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Card(
                                modifier = Modifier
                                    .size(50.dp),
                                shape = RoundedCornerShape(150.dp)
                            ) {
                                Box(
                                    modifier = Modifier
                                        .fillMaxSize(),
                                    contentAlignment = Alignment.Center,
                                ) {
                                    Image(
                                        contentDescription = "",
                                        painter = painterResource(R.drawable.carlos),
                                        modifier = Modifier
                                            .width(50.dp)
                                            .height(50.dp)
                                    )
                                }
                            }
                            Column(
                                modifier = Modifier
                                    .fillMaxHeight()
                                    .padding(start = 10.dp),
                                verticalArrangement = Arrangement.Center
                            ) {
                                Text(
                                    text = "Carlos Augusto Nobre",
                                    color = Color.White,
                                    fontWeight = FontWeight.Bold,
                                    fontSize = 17.sp
                                )
                                Row(
                                    verticalAlignment = Alignment.CenterVertically
                                ) {
                                    Image(
                                        modifier = Modifier
                                            .width(15.dp)
                                            .height(15.dp),
                                        contentDescription = "",
                                        painter = painterResource(R.drawable.identidade)
                                    )
                                    Text(
                                        modifier = Modifier
                                            .padding(start = 3.dp),
                                        text = "20151001018",
                                        color = Color.White,
                                        fontSize = 11.sp
                                    )
                                }
                            }
                            Row(
                                modifier = Modifier
                                    .padding(start = 100.dp, top = 60.dp),
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                Image(
                                    modifier = Modifier
                                        .width(15.dp)
                                        .height(15.dp),
                                    contentDescription = "",
                                    painter = painterResource(R.drawable.calendario)
                                )
                                Text(
                                    modifier = Modifier
                                        .padding(start = 2.dp),
                                    text = "2022",
                                    color = Color(0xFFFFC23D),
                                    fontSize = 11.sp,
                                    fontWeight = FontWeight.Bold
                                )
                            }
                        }
                    }
                }



                            }
                        }
                    }
                }


@Preview(showSystemUi = true)
@Composable
private fun StudentsScreenPreview() {
    StudentsScreen()
}