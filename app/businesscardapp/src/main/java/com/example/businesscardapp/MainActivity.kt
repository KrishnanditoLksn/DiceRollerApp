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
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.rounded.Email
import androidx.compose.material3.Button
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
                    modifier = Modifier
                        .fillMaxSize(),
                    color = MaterialTheme.colorScheme.background,
                ) {
                    BusinessCardAppPreview()
                }
            }
        }
    }
}


@Composable
fun UserInformationSection(title: String, subTitle: String) {
    Column(
        modifier = Modifier.background(Color.Green),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        val imageResources = painterResource(R.drawable.android_logo)
        val emailIcon = Icons.Rounded.Email
        val socialMediaIcon1 = Icons.Filled.Home
        val schoolIcon2 = Icons.Filled.Person

        Image(
            painter = imageResources,
            contentDescription = "Ini logo android ",
            modifier = Modifier
                .size(90.dp)
                .background(Color.Green)
        )

        Spacer(modifier = Modifier.size(50.dp))

        Row {
            Text(
                text = title,
                fontSize = 30.sp
            )
        }

        Spacer(modifier = Modifier.size(30.dp))

        Column {
            Text(
                text = subTitle,
                fontSize = 15.sp
            )
        }
        Spacer(modifier = Modifier.size(150.dp))


        Column {
            Row {
                Button(
                    modifier = Modifier.size(25.dp),
                    onClick = {
                        /*TODO*/

                    }) {

                }
                Icon(
                    emailIcon,
                    contentDescription = null // decorative element

                )
                Spacer(modifier = Modifier.size(10.dp))

                Text(
                    text = "krishnandito@gmail.com"
                )
            }

            Spacer(modifier = Modifier.size(10.dp))

            Row {
                Icon(
                    socialMediaIcon1,
                    contentDescription = null
                )

                Spacer(modifier = Modifier.size(10.dp))

                Text(
                    text = "Sragen , Central Java , Indonesia"
                )
            }

            Spacer(modifier = Modifier.size(10.dp))

            Row {
                Icon(
                    schoolIcon2,
                    contentDescription = null
                )

                Spacer(modifier = Modifier.size(10.dp))


                Text(
                    text = "Universitas Sanata Dharma"
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun BusinessCardAppPreview() {
    JetpackArticleTheme {
        UserInformationSection(
            title = "Emmanuel Krishnandito ",
            subTitle = "Informatics Student at Sanata Dharma University"
        )
    }
}