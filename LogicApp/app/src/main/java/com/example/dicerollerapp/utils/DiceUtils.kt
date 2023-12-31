package com.example.dicerollerapp.utils

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.dicerollerapp.R

@Composable
fun SpacerScreen() {
    return Spacer(modifier = Modifier.height(100.dp))
}



@Composable
fun gambarDadu1(): Int {
    Column(
        modifier = Modifier
            .wrapContentSize()
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        SpacerScreen()
        Text(
            text = "Ini dadu 1 ",
            textAlign = TextAlign.Center
        )
        R.drawable.dice_1
    }
    return R.drawable.dice_1
}

@Composable
fun gambarDadu2(): Int {
    Column(
        modifier = Modifier
            .wrapContentSize()
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        SpacerScreen()
        Text(
            text = "Ini dadu 2 ",
            textAlign = TextAlign.Center
        )
        SpacerScreen()
        R.drawable.dice_2
    }
    return R.drawable.dice_2
}

@Composable
fun gambarDadu3(): Int {
    Column(
        modifier = Modifier
            .wrapContentSize()
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        SpacerScreen()
        Text(
            text = "Ini dadu 3 ",
            textAlign = TextAlign.Center
        )
        R.drawable.dice_3
    }
    return R.drawable.dice_3
}

@Composable
fun gambarDadu4(): Int {
    Column(
        modifier = Modifier
            .wrapContentSize()
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        SpacerScreen()
        Text(
            text = "Ini dadu 4 ",
            textAlign = TextAlign.Center
        )
        R.drawable.dice_4
    }
    return R.drawable.dice_4
}

@Composable
fun gambarDadu5(): Int {
    Column(
        modifier = Modifier
            .wrapContentSize()
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        SpacerScreen()
        Text(
            text = "Ini dadu 5 ",
            textAlign = TextAlign.Center
        )
        R.drawable.dice_5
    }
    return R.drawable.dice_5
}