package com.ninjakito.dragonballdaima.ui.screens

import android.util.Log
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ninjakito.dragonballdaima.R

@Composable
fun SelectScreen(onClickNext: (String) -> Unit) {
    Column (modifier = Modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center) {
        Spacer(modifier = Modifier.weight(1f))
        Image(
            painter = painterResource(id = R.drawable.dragonball_daima_logo),
            contentDescription = stringResource(id = R.string.dragon_ball_img),
            modifier = Modifier.width(320.dp),
            contentScale = ContentScale.FillWidth
        )
        Spacer(modifier = Modifier.weight(0.5f))
        LazyVerticalGrid(
            columns = GridCells.Fixed(3),
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            horizontalArrangement = Arrangement.spacedBy(8.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            item {
                CharacterButton(character = stringResource(R.string.gomah_img), image = painterResource(R.drawable.gomah)) {
                    character -> Log.d("SELECTOR", character)
                }
            }
            item {
                CharacterButton(character = stringResource(R.string.goku_img), image = painterResource(R.drawable.goku), selected = true) {
                    character -> Log.d("SELECTOR", character)
                }
            }
            item {
                CharacterButton(character = stringResource(R.string.vegeta_img), image = painterResource(R.drawable.vegeta)) {
                    character -> Log.d("SELECTOR", character)
                }
            }
            item {
                CharacterButton(character = stringResource(R.string.piccolo_img), image = painterResource(R.drawable.piccolo)) {
                    character -> Log.d("SELECTOR", character)
                }
            }
            item {
                CharacterButton(character = stringResource(R.string.supreme_img), image = painterResource(R.drawable.supreme)) {
                    character -> Log.d("SELECTOR", character)
                }
            }
            item {
                CharacterButton(character = stringResource(R.string.masked_majin_img), image = painterResource(R.drawable.masked_majin)) {
                    character -> Log.d("SELECTOR", character)
                }
            }
        }
        Spacer(modifier = Modifier.weight(1f))
        Button(
            onClick = { onClickNext("goku") },
            modifier = Modifier.width(250.dp).height(40.dp),
            shape = RoundedCornerShape(10)
        ) {
            Text(text = stringResource(R.string.continue_btn), fontSize = 20.sp)
        }
        Spacer(modifier = Modifier.weight(1f))
    }
}

@Composable
fun CharacterButton(character: String, image: Painter, selected: Boolean = false, onClickCharacter: (String) -> Unit) {
    var borderSize = -1.dp

    if (selected) {
        borderSize = 1.dp
    }

    Image (
        painter = image,
        contentDescription = character,
        modifier = Modifier
            .size(150.dp)
            .border(border = BorderStroke(borderSize, Color.Black))
            .clickable { onClickCharacter(character) },
    )
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun SelectScreenPreview() {
    SelectScreen {  }
}