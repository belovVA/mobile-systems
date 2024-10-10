package com.example.artproject

import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.artproject.ui.theme.ArtProjectTheme


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.artproject.ui.theme.ArtProjectTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ArtProjectTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ArtSpaceApp()
                }
            }
        }
    }
}

@Composable
fun ArtSpaceApp(modifier: Modifier = Modifier) {
    val firstArtwork = R.drawable.devochka_s_persikami
    val secondArtwork = R.drawable.bogaturi
    val thirdArtwork = R.drawable.burlaki_na_volge
    val fourthArtwork = R.drawable.utro_v_sosnovom_lesu

    var artName by remember { mutableStateOf(R.string.art_1_name) }

    var artist by remember {
        mutableStateOf(R.string.art_1_artist)
    }

    var currentArtwork by remember {
        mutableStateOf(firstArtwork)
    }

    var artYear by remember {
        mutableStateOf(R.string.art_1_year)
    }

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        ArtSpaceImage(
            currentArtwork = currentArtwork
        )
        Spacer(modifier = Modifier.height(50.dp))
        Artist(
            modifier = Modifier.padding(bottom = 40.dp),
            artName = artName,
            artist = artist,
            artYear = artYear
        )
        Spacer(modifier = Modifier.height(50.dp))
        Row (
            verticalAlignment = Alignment.Bottom,
            horizontalArrangement = Arrangement.SpaceAround,
            modifier = Modifier.fillMaxWidth()
        ){
            // Previous Button
            Button(
                onClick = {
                    when (currentArtwork) {
                        firstArtwork -> {
                            currentArtwork = fourthArtwork
                            artName = R.string.art_4_name
                            artist = R.string.art_4_artist
                            artYear = R.string.art_4_year
                        }

                        fourthArtwork-> {
                            currentArtwork = thirdArtwork
                            artName = R.string.art_3_name
                            artist = R.string.art_3_artist
                            artYear = R.string.art_3_year
                        }

                        thirdArtwork -> {
                            currentArtwork = secondArtwork
                            artName = R.string.art_2_name
                            artist = R.string.art_2_artist
                            artYear = R.string.art_2_year
                        }

                        else -> {
                            currentArtwork = firstArtwork
                            artName = R.string.art_1_name
                            artist = R.string.art_1_artist
                            artYear = R.string.art_1_year
                        }
                    }
                },
                modifier = Modifier
                    .height(35.dp)
                    .width(150.dp)
            ) {
                Text(stringResource(R.string.previous_button))

            }

            // Next Button
            Button(onClick = {
                when (currentArtwork) {
                    firstArtwork -> {
                        currentArtwork = secondArtwork
                        artName = R.string.art_2_name
                        artist = R.string.art_2_artist
                        artYear = R.string.art_2_year
                    }
                    secondArtwork -> {
                        currentArtwork = thirdArtwork
                        artName = R.string.art_3_name
                        artist = R.string.art_3_artist
                        artYear = R.string.art_3_year
                    }
                    thirdArtwork -> {
                        currentArtwork = fourthArtwork
                        artName = R.string.art_4_name
                        artist = R.string.art_4_artist
                        artYear = R.string.art_4_year
                    }
                    else -> {
                        currentArtwork = firstArtwork
                        artName = R.string.art_1_name
                        artist = R.string.art_1_artist
                        artYear = R.string.art_1_year
                    }
                }
            },
                modifier = Modifier
                    .height(35.dp)
                    .width(150.dp))  {
                Text(stringResource(R.string.next_button))
            }

        }
    }
}

@Composable
fun ArtSpaceImage(
    @DrawableRes currentArtwork: Int,
    modifier: Modifier = Modifier
) {
    Surface(
        modifier = Modifier
            .height(470.dp)
            .width(380.dp)
            .padding(5.dp),
        color = Color(0xD3D3D3),
        //border = BorderStroke(),
        tonalElevation = 5.dp,
        shadowElevation = 5.dp,
        //shape = RoundedCornerShape(20.dp)

    ) {
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.fillMaxWidth()
        ) {
            Image(
                painter = painterResource(currentArtwork),
                contentDescription = null,
                contentScale = ContentScale
                    .FillBounds,
                modifier = Modifier
                    .height(390.dp)
                    .width(310.dp)
                    .fillMaxWidth()
            )
        }
    }
}

@Composable
fun Artist(
    @StringRes artName: Int,
    @StringRes artist: Int,
    @StringRes artYear: Int,
    modifier: Modifier = Modifier
) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Text(
            text = stringResource(id = artName),
            textAlign = TextAlign.Center,
            style = MaterialTheme.typography.headlineMedium, // Сделаем текст поменьше
            modifier = Modifier.padding(bottom = 8.dp)
        )
        Text(
            text = stringResource(id = artist),
                    style = MaterialTheme.typography.headlineMedium, // Еще меньше, чем название
            modifier = Modifier.padding(bottom = 8.dp)
        )
        Text(
            text = stringResource(id = artYear),
                    style = MaterialTheme.typography.headlineMedium, // Сделаем больше
            modifier = Modifier.padding(top = 8.dp) // Добавим верхний отступ
        )
    }
}

@Composable
fun ArtSpaceButton(
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Row(
        verticalAlignment = Alignment.Bottom,
        horizontalArrangement = Arrangement.SpaceAround,
        modifier = Modifier.fillMaxWidth()
    ) {
        Button(onClick = { onClick },
            modifier = Modifier
                .height(35.dp)
                .width(150.dp)) {
            Text(stringResource(R.string.previous_button))
        }
        Button(onClick = { onClick },
            modifier = Modifier
                .height(35.dp)
                .width(150.dp)) {
            Text(stringResource(R.string.next_button))
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ArtProjectTheme() {
        ArtSpaceApp()
    }
}