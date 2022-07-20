package com.example.onlineclass

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
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
            .padding(start = 15.dp, end = 15.dp)
            .background(Color.White)
    ) {
        // first row with profile pic
        Row(
            Modifier
                .fillMaxWidth()
                .padding(top = 30.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Icon(
                imageVector = Icons.Outlined.Menu,
                contentDescription = null,
                Modifier
                    .size(40.dp)
                    .alpha(0.9f)
            )
            Image(
                painter = painterResource(R.drawable.pic),
                contentDescription = stringResource(R.string.profile_picture),
                Modifier
                    .size(55.dp)
                    .clip(RoundedCornerShape(50)) // image rounded corners
            )
            Icon(
                imageVector = Icons.Outlined.Search,
                contentDescription = null,
                Modifier
                    .size(40.dp)
                    .alpha(0.9f) //transparency / opacity effect
            )
        }

        Spacer(Modifier.height(40.dp))

        // heading Hello
        Text(
            text = buildAnnotatedString {
                append(stringResource(R.string.hello))
                withStyle(
                    style = SpanStyle(
                        fontWeight = FontWeight.Medium
                    )
                ) {
                    append(stringResource(R.string.keri))
                }
            },
            fontSize = 40.sp,
            fontFamily = poppins
        )

        Spacer(Modifier.height(30.dp))

        // row classes
        Row(verticalAlignment = Alignment.CenterVertically) {
            Text(
                text = stringResource(R.string.classes),
                fontFamily = poppins,
                fontWeight = FontWeight.Medium,
                modifier = Modifier.weight(2f),
                color = colorResource(R.color.fade_text),
                fontSize = 20.sp
            )
            Text(
                text = stringResource(R.string.classes_no),
                fontFamily = poppins,
                fontWeight = FontWeight.Light,
                modifier = Modifier.weight(1f),
                color = colorResource(R.color.fade_text)
            )
        }

        Spacer(Modifier.height(15.dp))

        // row Card
        Card(
            elevation = 4.dp,
            shape = RoundedCornerShape(10),
            modifier = Modifier
                .fillMaxWidth()
                .height(160.dp),
            backgroundColor = colorResource(R.color.bg_tile)
        ) {
            Row(
                Modifier
                    .fillMaxWidth()
                    .padding(start = 10.dp, end = 10.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Column(Modifier.weight(1f)) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Card(
                            shape = CircleShape,
                            backgroundColor = colorResource(R.color.dark_bg_tile)
                        ) {
                            Icon(
                                painter = painterResource(R.drawable.archer),
                                contentDescription = null,
                                modifier = Modifier
                                    .padding(15.dp)
                                    .size(25.dp)
                            )
                        }
                        
                        Spacer(modifier = Modifier.width(10.dp))

                        Column(Modifier.weight(1f)) {
                            Text(
                                text = stringResource(R.string.history),
                                fontFamily = poppins,
                                fontSize = 20.sp
                            )
                            Text(
                                text = stringResource(R.string.history_schedule),
                                fontFamily = poppins,
                                fontWeight = FontWeight.Light,
                                fontSize = 12.sp,
                                color = colorResource(R.color.fade_text)
                            )
                        }
                    }

                    Spacer(Modifier.height(20.dp))

                    // join now
                    Card(
                        modifier = Modifier
                            .height(21.dp)
                            .width(88.dp),
                        backgroundColor = Color.Black,
                        shape = RoundedCornerShape(25)
                    ) {
                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            modifier = Modifier.padding(start = 2.dp)
                            ) {
                            Icon(
                                painter = painterResource(R.drawable.video_call),
                                contentDescription = null,
                                tint = colorResource(R.color.video_white),
                                modifier = Modifier.size(17.dp)
                            )

                            Spacer(modifier = Modifier.width(5.dp))

                            Column {
                                Divider(
                                    Modifier
                                        .height(14.dp)
                                        .width(1.dp),
                                    colorResource(R.color.divider_white)
                                )
                            }

                            Spacer(modifier = Modifier.width(5.dp))

                            Text(
                                text = "Join Now",
                                fontFamily = poppins,
                                modifier = Modifier.weight(1f),
                                color = colorResource(R.color.video_white),
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
                    Image(
                        painter = painterResource(id = R.drawable.hist),
                        contentDescription = null,
                        modifier = Modifier
                            .size(150.dp)
                    )
                }
            }
        }

        // homework section
        Row(
            Modifier
                .padding(top = 50.dp, bottom = 20.dp)
                .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                text = stringResource(R.string.homework),
                fontSize = 20.sp,
                fontFamily = poppins,
                fontWeight = FontWeight.Medium,
                color = colorResource(R.color.fade_text)
            )
            Text(
                text = stringResource(R.string.view_all),
                fontFamily = poppins,
                fontWeight = FontWeight.Light,
                color = colorResource(R.color.fade_text)
            )
        }

        // pink card
        Card(
            backgroundColor = colorResource(R.color.pink_card),
            modifier = Modifier
                .height(200.dp)
                .fillMaxWidth(),
            shape = RoundedCornerShape(10)
        ) {
            Column(
                Modifier.padding(30.dp),
                verticalArrangement = Arrangement.Center
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Column {
                        Text(
                            text = stringResource(R.string.physics),
                            fontFamily = poppins,
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Medium
                        )
                        Row(
                            modifier = Modifier.width(70.dp),
                            horizontalArrangement = Arrangement.SpaceBetween,
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Icon(
                                painter = painterResource(R.drawable.time),
                                contentDescription = null,
                                Modifier
                                    .size(18.dp)
                                    .padding(end = 2.dp),
                                tint = colorResource(R.color.fade_text)
                            )
                            Text(
                                text = stringResource(R.string.days_left),
                                fontFamily = poppins,
                                fontSize = 12.sp,
                                fontWeight = FontWeight.Light,
                                color = colorResource(R.color.fade_text)
                            )
                        }
                    }
                    Column {
                        Card(
                            backgroundColor = colorResource(R.color.dark_pink),
                            shape = RoundedCornerShape(20)
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.pile),
                                contentDescription = null,
                                modifier = Modifier.size(60.dp)
                            )
                        }
                    }
                }
                
                Spacer(modifier = Modifier.height(25.dp))
                
                //Newtons Row haha...get it??
                Row(
                    Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Column {
                        Text(
                            text = stringResource(R.string.newton_law),
                            fontFamily = poppins,
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Medium
                        )
                        Text(
                            text = stringResource(R.string.read),
                            fontFamily = poppins,
                            fontSize = 12.sp,
                            fontWeight = FontWeight.Light,
                            color = colorResource(R.color.fade_text)
                        )
                    }
                    Column {
                        Icon(
                            imageVector = Icons.Outlined.Warning,
                            contentDescription = null,
                            tint = colorResource(R.color.icon_pink)
                        )
                    }
                }
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