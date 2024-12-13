package com.ninjakito.dragonballdaima.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.content.MediaType.Companion.Text
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ninjakito.dragonballdaima.R

@Composable
fun NameScreen(onShowClick: (String) -> Unit) {
    var name by remember { mutableStateOf("") }
    Column (modifier = Modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center) {
        Spacer(modifier = Modifier.weight(1f))
        Image(
            painter = painterResource(id = R.drawable.dragonball_daima_logo),
            contentDescription = stringResource(id = R.string.dragon_ball_img),
            modifier = Modifier.width(320.dp),
            contentScale = ContentScale.FillWidth
        )
        Spacer(modifier = Modifier.weight(2f))
        TextField(
            value = name,
            onValueChange = { name = it },
            maxLines = 1,
            placeholder = { Text(text = stringResource(R.string.name_tf)) }
        )
        Spacer(modifier = Modifier.weight(3f))
        Button(
            onClick = { onShowClick(name) },
            modifier = Modifier.width(250.dp).height(40.dp),
            shape = RoundedCornerShape(10)
        ) {
            Text(text = stringResource(R.string.show_btn), fontSize = 20.sp)
        }
        Spacer(modifier = Modifier.weight(1f))
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun NameScreenPreview() {
    NameScreen() {  }
}
