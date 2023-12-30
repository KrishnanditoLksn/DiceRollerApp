package com.example.dicerollerapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.dicerollerapp.ui.theme.DiceRollerAppTheme
import com.example.dicerollerapp.utils.gambarDadu1
import com.example.dicerollerapp.utils.gambarDadu2
import com.example.dicerollerapp.utils.gambarDadu3
import com.example.dicerollerapp.utils.gambarDadu4
import com.example.dicerollerapp.utils.gambarDadu5

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DiceRollerAppTheme {
                // A surface container using the 'background' color from the theme
                DiceRollerApp()
            }
        }
    }
}

@Composable
@Preview
fun DiceRollerApp() {
    DiceWithButtonAndImage(
        modifier = Modifier
            .fillMaxSize()
            .wrapContentSize()
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DiceAppBar() {
    TopAppBar(
        title = {
            Text(
                text = "Aplikasi dadu ",
                textAlign = TextAlign.Center,
            )
        }
    )
}

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
                result++
                if (result == 6) {
                    result = 1
                }
            }) {
                Text(stringResource(R.string.roll1))
            }

            Spacer(modifier = Modifier.height(20.dp))
            Column(
                verticalArrangement = Arrangement.Center
            ) {
                Button(onClick = {
                    result--
                    if (result == 6) {
                        result = 1
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