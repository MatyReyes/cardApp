package com.example.presentationapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.presentationapp.ui.theme.PresentationAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PresentationAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    PresentationCard()
                }
            }
        }
    }
}

@Composable
fun PresentationCard() {
    Body(
        image =  painterResource(R.drawable.android_logo),
        name = stringResource(R.string.name),
        charge = stringResource(R.string.charge),
        phoneNumber = stringResource(R.string.phone),
        linkedIn = stringResource(R.string.linkedIn),
        mail = stringResource(R.string.mail),
    )
}

@Composable
fun Body(
    image: Painter,
    name: String,
    charge: String,
    phoneNumber: String,
    linkedIn: String,
    mail: String,
    modifier: Modifier = Modifier
){
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.padding(16.dp)
    ) {
        Row(
            modifier = Modifier
                .height(600.dp)
                .padding(PaddingValues(top = 200.dp)),
            horizontalArrangement = Arrangement.Center
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Row(
                    modifier = Modifier.height(120.dp)
                ) {
                    Image(
                        painter = image,
                        contentDescription = null,
                        Modifier
                            .background(color = Color(63,136,143))
                    )
                }
                Text(
                    text = name,
                    fontSize = 42.sp,
                    fontWeight = FontWeight.Light,
                    modifier = Modifier.padding(
                        PaddingValues(
                            top = 5.dp
                        )
                    )
                )
                Text(
                    text = charge,
                    color = Color(63,136,143),
                    fontSize = 17.sp
                )
            }

        }
        Row {
            Column {
                Row{
                    Row(
                        modifier = Modifier.width(50.dp)
                    ) {
                        Icon(
                            Icons.Filled.Call,
                            contentDescription = null,
                            tint = Color(63,136,143)
                        )
                    }
                    Row(
                        modifier = Modifier.width(200.dp)
                    ) {
                        Text(
                            text = phoneNumber,
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Light,
                            color = Color(63,136,143)
                        )
                    }
                }
                Row(
                ) {
                    Row(
                        modifier = Modifier.width(50.dp)
                    ) {
                        Icon(
                            Icons.Filled.Person,
                            contentDescription = null,
                            tint = Color(63,136,143)
                        )
                    }
                    Row(
                        modifier = Modifier.width(200.dp)
                    ) {
                        Text(
                            text = linkedIn,
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Light,
                            color = Color(63,136,143)
                        )
                    }

                }
                Row(
                ) {
                    Row(
                        modifier = Modifier.width(50.dp)
                    ) {
                        Icon(
                            Icons.Filled.Email,
                            contentDescription = null,
                            tint = Color(63,136,143)
                        )
                    }
                    Row(
                        modifier = Modifier.width(200.dp)
                    ) {
                        Text(
                            text = mail,
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Light,
                            color = Color(63,136,143)
                        )
                    }
                }
            }
        }
    }
}

@Preview(
    showBackground = true,
    showSystemUi = true
)
@Composable
fun GreetingPreview() {
    PresentationAppTheme {
        PresentationCard()
    }
}