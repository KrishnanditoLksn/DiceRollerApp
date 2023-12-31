package com.example.dicerollerapp.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.dicerollerapp.R
import com.example.dicerollerapp.utils.gambarDadu1
import com.example.dicerollerapp.utils.gambarDadu2
import com.example.dicerollerapp.utils.gambarDadu3
import com.example.dicerollerapp.utils.gambarDadu4
import com.example.dicerollerapp.utils.gambarDadu5

@Composable
fun DiceWithButtonAndImage(
    modifier: Modifier = Modifier
) {
    DiceAppBar()
    var result by remember {
        mutableIntStateOf(1)
    }
    val imageResource = when (result) {
        1 -> gambarDadu1()
        2 -> gambarDadu2()
        3 -> gambarDadu3()
        4 -> gambarDadu4()
        5 -> gambarDadu5()
        else -> R.drawable.dice_6
    }
    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(painter = painterResource(id = imageResource), contentDescription = result.toString())
        Spacer(modifier = Modifier.height(16.dp))


        Row(
            horizontalArrangement = Arrangement.spacedBy(10.dp)
        ) {
            Button(onClick = {

                if (result == 6) {
                    result = 1
                } else {
                    result++
                }
            }) {
                Text(stringResource(R.string.roll1))
            }

            Spacer(modifier = Modifier.height(20.dp))
            Column(
                verticalArrangement = Arrangement.Center
            ) {
                Button(onClick = {
                    if (result == 6) {
                        result = 1
                    } else {
                        result--
                    }
                }) {
                    Text(text = stringResource(R.string.roll2))
                }

                Button(onClick = {
                    result = 6
                }) {
                    Text(text = stringResource(R.string.reset))
                }
            }
        }
    }
}