package com.ninjakito.dragonballdaima.ui.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ninjakito.dragonballdaima.R
import com.ninjakito.dragonballdaima.ui.LogoDragonBall

@Composable
fun ResultScreen(name: String, character: Int, onClickBack: () -> Unit) {
    Column (modifier = Modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center) {
        Spacer(modifier = Modifier.weight(1f))
        LogoDragonBall()
        Spacer(modifier = Modifier.weight(0.7f))
        Image (
            painter = painterResource(id = character),
            contentDescription = name,
            modifier = Modifier.size(250.dp)
        )
        Spacer(modifier = Modifier.weight(0.2f))
        Text(text = name.trim(), fontWeight = FontWeight.Bold, fontSize = 50.sp)
        Spacer(modifier = Modifier.weight(1.3f))
        Button(
            onClick = onClickBack,
            modifier = Modifier.width(250.dp).height(40.dp),
            shape = RoundedCornerShape(10)
        ) {
            Text(text = stringResource(R.string.back_btn), fontSize = 20.sp)
        }
        Spacer(modifier = Modifier.weight(1f))
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun ResultScreenPreview() {
    ResultScreen("Adrià", R.drawable.goku) { }
}