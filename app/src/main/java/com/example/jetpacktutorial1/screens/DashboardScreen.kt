package com.example.jetpacktutorial1.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.jetpacktutorial1.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DashboardScreen(navigateTo : NavHostController) {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
        TopAppBar(
            title = {
                Text(
                    text = "Dashboard",
                    fontSize = 16.sp,
                    style = TextStyle(fontWeight = FontWeight.Bold)
                )
            }, colors = TopAppBarDefaults.smallTopAppBarColors(
                containerColor = Color.White, titleContentColor = Color.Black
            ), modifier = Modifier.shadow(
                elevation = 15.dp,
                spotColor = Color.DarkGray,
            )

        )

        //Profile section
        Card(
            shape = RoundedCornerShape(5.dp), colors = CardDefaults.cardColors(
                containerColor = Color.White
            ), elevation = CardDefaults.elevatedCardElevation(
                defaultElevation = 15.dp
            ), modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth()
        ) {
            Box(
                modifier = Modifier.height(80.dp), contentAlignment = Alignment.Center
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxSize()
                        .align(Alignment.Center),
                ) {

                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .weight(2.5f)
                            .padding(8.dp)
                    ) {
                        Text(
                            text = "Hello World..!",
                            textAlign = TextAlign.Center,
                            fontSize = 12.sp,
                            maxLines = 1,
                            modifier = Modifier
                                .weight(1f)
                                .fillMaxSize(),
                            style = TextStyle(
                                color = Color.Black,
                                fontWeight = FontWeight.Bold,
                            )
                        )

                        Text(
                            text = "Tuesday, December 13, 2023",
                            textAlign = TextAlign.Center,
                            fontSize = 12.sp,
                            maxLines = 1,
                            modifier = Modifier
                                .weight(1f)
                                .fillMaxSize(),
                        )

                    }
                    Image(
                        painterResource(id = R.drawable.user_profile),
                        contentDescription = "Cart button icon",
                        modifier = Modifier
                            .weight(1f)
                            .padding(10.dp)
                    )
                }
            }
        }

        //job stats section
        Card(
            shape = RoundedCornerShape(5.dp), colors = CardDefaults.cardColors(
                containerColor = Color.White
            ), elevation = CardDefaults.elevatedCardElevation(
                defaultElevation = 15.dp
            ), modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth()
        ) {
            Box(
                modifier = Modifier.height(250.dp)
            ) {
                Column {

                    Text(
                        text = "Job Stats",
                        fontSize = 16.sp,
                        modifier = Modifier.padding(8.dp),
                        style = TextStyle(fontWeight = FontWeight.Bold)
                    )
                    Divider(
                        thickness = 1.dp,
                        color = Color.LightGray,
                        modifier = Modifier.fillMaxWidth()
                    )
                    Row(
                        modifier = Modifier
                            .height(IntrinsicSize.Min)
                            .padding(top = 10.dp)
                    ) {
                        Text(
                            text = "60 points",
                            fontSize = 12.sp,
                            modifier = Modifier
                                .weight(1f)
                                .padding(start = 20.dp, top = 5.dp)
                        )

                        Text(
                            text = "25 of 60 Completed",
                            fontSize = 12.sp,
                            modifier = Modifier
                                .weight(1f)
                                .padding(end = 20.dp, top = 5.dp),
                            textAlign = TextAlign.End
                        )
                    }
                    Text(
                        modifier = Modifier.padding(20.dp), text = "Graph Layout"
                    )

                    Box(
                        modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center
                    ) {
                        Column {
                            Row {
                                Box(
                                    modifier = Modifier
                                        .padding(8.dp)
                                        .width(20.dp)
                                        .height(20.dp)
                                        .background(Color.Red)
                                )
                                Text(
                                    text = "Yet to Start(10)",
                                    fontSize = 12.sp,
                                    modifier = Modifier.padding(top = 8.dp)
                                )

                                Box(
                                    modifier = Modifier
                                        .padding(8.dp)
                                        .width(20.dp)
                                        .height(20.dp)
                                        .background(Color.Blue)
                                )
                                Text(
                                    text = "In-Progress(15)",
                                    fontSize = 12.sp,
                                    modifier = Modifier.padding(top = 8.dp)
                                )

                            }

                            Row {
                                Box(
                                    modifier = Modifier
                                        .padding(8.dp)
                                        .width(20.dp)
                                        .height(20.dp)
                                        .background(Color.Yellow)
                                )
                                Text(
                                    text = "Cancelled(2)",
                                    fontSize = 12.sp,
                                    modifier = Modifier.padding(top = 8.dp)
                                )

                                Box(
                                    modifier = Modifier
                                        .padding(8.dp)
                                        .width(20.dp)
                                        .height(20.dp)
                                        .background(Color.Green)
                                )
                                Text(
                                    text = "Completed(25)",
                                    fontSize = 12.sp,
                                    modifier = Modifier.padding(top = 8.dp)
                                )

                            }

                            Row {
                                Box(
                                    modifier = Modifier
                                        .padding(8.dp)
                                        .width(20.dp)
                                        .height(20.dp)
                                        .background(Color.Magenta)
                                )
                                Text(
                                    text = "In-Complete(6)",
                                    fontSize = 12.sp,
                                    modifier = Modifier.padding(top = 8.dp)
                                )
                            }
                        }
                    }
                }

            }
        }

//invoice stats section
        Card(
            shape = RoundedCornerShape(5.dp), colors = CardDefaults.cardColors(
                containerColor = Color.White
            ), elevation = CardDefaults.elevatedCardElevation(
                defaultElevation = 15.dp
            ), modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth()
        ) {
            Box(
                modifier = Modifier.height(250.dp)
            ) {
                Column(modifier = Modifier.fillMaxSize()) {


                    ClickableText(
                        text = AnnotatedString("Invoice Stats"),
                        modifier = Modifier.padding(8.dp),
                        style = TextStyle(fontWeight = FontWeight.Bold, fontSize = 16.sp),
                        onClick = {
                                navigateTo.navigate("B")
                        })
                    Divider(
                        thickness = 1.dp,
                        color = Color.LightGray,
                        modifier = Modifier.fillMaxWidth()
                    )
                    Row(
                        modifier = Modifier
                            .height(IntrinsicSize.Min)
                            .padding(top = 10.dp)
                    ) {
                        Text(
                            text = "Total Value ($50,000)",
                            fontSize = 12.sp,
                            modifier = Modifier
                                .weight(1f)
                                .padding(start = 20.dp, top = 5.dp)
                        )

                        Text(
                            text = "$15,000 Collected",
                            fontSize = 12.sp,
                            modifier = Modifier
                                .weight(1f)
                                .padding(end = 20.dp, top = 5.dp),
                            textAlign = TextAlign.End
                        )
                    }
                    Text(
                        modifier = Modifier.padding(20.dp), text = "Graph Layout"
                    )

                    Box(
                        modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center
                    ) {
                        Column {
                            Row {
                                Box(
                                    modifier = Modifier
                                        .padding(8.dp)
                                        .width(20.dp)
                                        .height(20.dp)
                                        .background(Color.Red)
                                )
                                Text(
                                    text = "Yet to Start(10)",
                                    fontSize = 12.sp,
                                    modifier = Modifier.padding(top = 8.dp)
                                )

                                Box(
                                    modifier = Modifier
                                        .padding(8.dp)
                                        .width(20.dp)
                                        .height(20.dp)
                                        .background(Color.Blue)
                                )
                                Text(
                                    text = "In-Progress(15)",
                                    fontSize = 12.sp,
                                    modifier = Modifier.padding(top = 8.dp)
                                )

                            }

                            Row {
                                Box(
                                    modifier = Modifier
                                        .padding(8.dp)
                                        .width(20.dp)
                                        .height(20.dp)
                                        .background(Color.Yellow)
                                )
                                Text(
                                    text = "Cancelled(2)",
                                    fontSize = 12.sp,
                                    modifier = Modifier.padding(top = 8.dp)
                                )

                                Box(
                                    modifier = Modifier
                                        .padding(8.dp)
                                        .width(20.dp)
                                        .height(20.dp)
                                        .background(Color.Green)
                                )
                                Text(
                                    text = "Completed(25)",
                                    fontSize = 12.sp,
                                    modifier = Modifier.padding(top = 8.dp)
                                )

                            }
                        }
                    }
                }
            }

        }
    }
}