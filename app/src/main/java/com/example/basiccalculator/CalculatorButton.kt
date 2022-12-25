package com.example.basiccalculator

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.sp

@Composable
fun CalculatorButton(
    symbol: String,
    modifier: Modifier,
    onClick: ()->Unit //respond to click events outside of button composable(like another viewmodel)
){
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier //apply our following properties
            .clip(CircleShape)
            .clickable { onClick() }
            .then(modifier) // then our own properties

    ){
        Text(text = symbol, fontSize = 36.sp, color = Color.White)
    }

}