package com.example.composequadrant

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Surface(
                modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background
            ) {
                QuadrantAppCompose()
            }
        }
    }
}


@Composable
fun Quadrant(title: String, description: String, modifier: Modifier = Modifier, color: Color) {
    Column(
        modifier = modifier
            .fillMaxHeight()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Text(
            text = title,
            Modifier.padding(0.dp, 0.dp, 0.dp, 16.dp),
            fontStyle = FontStyle.Italic,
            color = color
        )
        Text(
            text = description, textAlign = TextAlign.Justify,
            color = color
        )
    }
}


@Composable
fun QuadrantAppCompose() {
    Column(
        Modifier.fillMaxSize()
    ) {
        Row(
            Modifier.weight(1F)
        ) {
            Quadrant(
                title = "Android", description = "By Kotlin", modifier = Modifier
                    .weight(1F)
                    .background(color = Color.Magenta),
                color = Color.Black

            )
            Quadrant(
                title = "Java", description = "Oracle", modifier = Modifier
                    .weight(1F)
                    .background(color = Color.Red),
                color = Color.Gray
            )

        }

        Row(Modifier.weight(1F)) {

            Quadrant(
                title = "C++", description = "Bjarne Strostroup",
                modifier = Modifier
                    .weight(1F)
                    .background(color = Color.Green),
                color = Color.DarkGray,
            )

            Quadrant(
                title = "JavaScript", description = "Gio Rossum", modifier = Modifier
                    .weight(1F)
                    .background(color = Color.LightGray),
                color = Color.Green
            )
        }
    }
}


@Preview(showBackground = true)
@Composable
fun ComposeQuadrantPreview() {
    QuadrantAppCompose()
}