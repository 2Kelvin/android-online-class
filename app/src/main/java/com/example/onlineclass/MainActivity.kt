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
            .padding(all = 5.dp)
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
                modifier = Modifier.weight(2f),
//                color = Color(0XFFE3E5E4)
            )
            Text(
                text = "2 classes today",
                fontFamily = poppins,
                fontWeight = FontWeight.Light,
                modifier = Modifier.weight(1f),
//                color = Color(0XFFE3E5E4)
            )
        }

        Spacer(Modifier.height(10.dp))

        // row History
        Row(
            Modifier
                .background(Color(0XFFE3E4E5))
                .padding(all = 5.dp)
                .clip(RoundedCornerShape(20))
                .height(200.dp)
                .fillMaxWidth()
        ) {
            Column(Modifier.weight(1f)) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Icon(
                        imageVector = Icons.Rounded.Favorite,
                        contentDescription = null,
                        Modifier.weight(1f)
                    )

                    Column(Modifier.weight(2f)) {
                        Text(
                            text = "History",
                            fontFamily = poppins
                        )
                        Text(
                            text = "8:00 - 8:45",
                            fontFamily = poppins,
                            fontWeight = FontWeight.Light
                        )
                    }
                }
                Spacer(Modifier.height(10.dp))
                Row(
                    Modifier
                        .background(Color.Black)
                        .height(40.dp)
                        .width(150.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Icon(
                        imageVector = Icons.Outlined.Star,
                        contentDescription = null,
//                        Modifier.weight(1f),
                        tint = Color.White
                    )
//                    Divider(
//                        Modifier.height(10.dp),
//                        Color.White
//                    )
                    Text(
                        text = "Join Now",
                        fontFamily = poppins,
                        modifier = Modifier.weight(1f),
                        color = Color.White,

                    )
                }
            }
            Column(Modifier.weight(1f)) {

            }
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