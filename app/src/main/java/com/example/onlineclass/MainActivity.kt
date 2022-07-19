package com.example.onlineclass

import android.os.Bundle
import android.view.RoundedCorner
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.Search
import androidx.compose.material.icons.outlined.Star
import androidx.compose.material.icons.rounded.Email
import androidx.compose.material.icons.rounded.Favorite
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.onlineclass.ui.theme.OnlineClassTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            OnlineClassTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    OnlineClassApp()
                }
            }
        }
    }
}

// poppins font
val poppins = FontFamily(
    Font(R.font.poppins_regular, FontWeight.Normal),
    Font(R.font.poppins_medium, FontWeight.Medium),
    Font(R.font.poppins_light, FontWeight.Light)
)

@Composable
fun OnlineClassApp() {
    Column(
        Modifier
            .fillMaxSize()
            .padding(start = 10.dp, end = 10.dp)
            .background(Color.White)
    ) {
        // first row with profile pic
        Row(
            Modifier
                .fillMaxWidth()
                .padding(top = 10.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                imageVector = Icons.Outlined.Home,
                contentDescription = null,
                Modifier.weight(1f)
            )
            Image(
                painter = painterResource(R.drawable.img),
                contentDescription = "Profile",
                Modifier
                    .width(45.dp)
                    .height(45.dp)
                    .clip(RoundedCornerShape(50)) // image rounded corners
            )
            Icon(
                imageVector = Icons.Outlined.Search,
                contentDescription = null,
                Modifier.weight(1f)
            )
        }

        Spacer(Modifier.height(10.dp))

        // heading Hello
        Text(
            text = "Hello, Jessica",
            fontSize = 40.sp,
            modifier = Modifier.padding(top = 5.dp, bottom = 5.dp),
            fontFamily = poppins
        )

        Spacer(Modifier.height(10.dp))

        // row classes
        Row(verticalAlignment = Alignment.CenterVertically) {
            Text(
                text = "Classes",
                fontFamily = poppins,
                fontWeight = FontWeight.Light,
                modifier = Modifier.weight(2f)
            )
            Text(
                text = "2 classes today",
                fontFamily = poppins,
                fontWeight = FontWeight.Light,
                modifier = Modifier.weight(1f)
            )
        }

        Spacer(Modifier.height(10.dp))

        // row Card
        Card(
            elevation = 4.dp,
            shape = RoundedCornerShape(10),
            modifier = Modifier
                .fillMaxWidth()
                .height(140.dp),
            backgroundColor = Color(0XFFE3E5E4)
        ) {
            Row(Modifier.fillMaxWidth()) {
                Column(Modifier.weight(1f)) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier.padding(start = 10.dp, top = 10.dp)
                    ) {
                        Icon(
                            imageVector = Icons.Rounded.Favorite,
                            contentDescription = null,
                            Modifier
                                .padding(top = 10.dp, bottom = 10.dp, end = 10.dp)
                        )

                        Column(Modifier.weight(1f)) {
                            Text(
                                text = "History",
                                fontFamily = poppins,
                                fontSize = 20.sp
                            )
                            Text(
                                text = "8:00 - 8:45",
                                fontFamily = poppins,
                                fontWeight = FontWeight.Light,
                                fontSize = 12.sp
                            )
                        }
                    }

                    Spacer(Modifier.height(20.dp))

                    // join now
                    Card(
                        modifier = Modifier
                            .height(40.dp)
                            .padding(start = 10.dp)
                            .width(106.dp),
                        backgroundColor = Color.Black,
                        shape = RoundedCornerShape(15)
                    ) {
                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            modifier = Modifier.padding(start = 2.dp, end = 2.dp)
                            ) {
                            Icon(
                                imageVector = Icons.Outlined.Star,
                                contentDescription = null,
                                tint = Color.White,
                                modifier = Modifier.size(19.dp)
                            )

                            Spacer(modifier = Modifier.width(7.dp))

                            Column {
                                Divider(
                                    Modifier
                                        .height(20.dp)
                                        .width(2.dp),
                                    Color.White
                                )
                            }

                            Spacer(modifier = Modifier.width(7.dp))

                            Text(
                                text = "Join Now",
                                fontFamily = poppins,
                                modifier = Modifier.weight(1f),
                                color = Color.White,
                                fontSize = 13.sp
                            )
                        }
                    }
                }
                Column(
                    Modifier
                        .weight(1f)
                        .fillMaxHeight(),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Icon(
                        imageVector = Icons.Rounded.Email,
                        contentDescription = null,
                        Modifier.size(65.dp)
                    )
                }
            }
        }

        // homeworks section
        Row(
            Modifier.padding(top = 30.dp, bottom = 10.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = "Home Work",
                fontSize = 20.sp,
                modifier = Modifier.weight(1f)
            )
            Text(
                text = "View All",
                fontSize = 13.sp,
                modifier = Modifier.weight(1f)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun OnlineClassPreview() {
    OnlineClassTheme {
        OnlineClassApp()
    }
}