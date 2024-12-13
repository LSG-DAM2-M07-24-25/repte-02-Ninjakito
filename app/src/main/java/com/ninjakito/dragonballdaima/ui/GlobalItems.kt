package com.ninjakito.dragonballdaima.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.ninjakito.dragonballdaima.R

@Composable
fun LogoDragonBall() {
    Image(
        painter = painterResource(id = R.drawable.dragonball_daima_logo),
        contentDescription = stringResource(id = R.string.dragon_ball_img),
        modifier = Modifier.width(320.dp),
        contentScale = ContentScale.FillWidth
    )
}