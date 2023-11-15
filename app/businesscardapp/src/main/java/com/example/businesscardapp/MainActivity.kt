package com.example.businesscardapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.AccountBox
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businesscardapp.ui.theme.JetpackArticleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackArticleTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    BusinessCardAppPreview()
                }
            }
        }
    }
}

@Composable
fun BusinessCardApp(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}


@Composable
fun UserInformationSection(title: String, subTitle: String) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        val imageResources = painterResource(R.drawable.android_logo)
        val imageIcon = Icons.Rounded.AccountBox

        Image(
            painter = imageResources,
            contentDescription = "Ini logo android ",
            modifier = Modifier
                .size(90.dp)
                .background(Color.Green)
        )
        Row {
            Text(
                text = title,
            )
        }

        Column {
            Text(
                text = subTitle,
                fontSize = 10.sp
            )
        }
        Spacer(modifier = Modifier.size(35.dp))

        Row(
            modifier = Modifier,
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Icon(
                imageIcon,
                contentDescription = null // decorative element
            )

            Text(
                text = "calling ...."
            )
        }
    }

}

@Preview(showBackground = true)
@Composable
fun BusinessCardAppPreview() {
    JetpackArticleTheme {
        UserInformationSection(
            title = "Emmanuel Krishnandito ",
            subTitle = "Undergraduate Informatics Student at Sanata Dharma University"
        )
    }
}