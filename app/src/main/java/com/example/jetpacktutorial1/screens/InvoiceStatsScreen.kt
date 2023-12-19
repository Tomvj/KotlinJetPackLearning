package com.example.jetpacktutorial1.screens

import androidx.compose.animation.Animatable
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Tab
import androidx.compose.material3.TabRow
import androidx.compose.material3.TabRowDefaults
import androidx.compose.material3.TabRowDefaults.tabIndicatorOffset
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import kotlinx.coroutines.launch


@OptIn(ExperimentalMaterial3Api::class, ExperimentalFoundationApi::class)
@Composable
fun InvoiceStatsScreen(navigateTo : NavHostController) {

    val tabItems = listOf("Music", "Movies", "Apps")
    val pagerState = rememberPagerState(
        initialPage = 0,
        initialPageOffsetFraction = 0f,
        pageCount = { tabItems.size }
    )
    val coroutineScope = rememberCoroutineScope()

    Surface(modifier = Modifier.fillMaxSize()) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.White)
        ) {
            TopAppBar(
                title = {
                    Text(
                        text = "Jobs (60)",
                        fontSize = 16.sp,
                        style = TextStyle(fontWeight = FontWeight.Bold)
                    )
                },
                navigationIcon = {
                    IconButton(onClick = { navigateTo.navigate("A"){
                        popUpTo("A"){
                            inclusive = true
                        }
                    } }) {
                        Icon(
                            imageVector = Icons.Filled.ArrowBack,
                            contentDescription = "Back Function"
                        )
                    }
                },
                colors = TopAppBarDefaults.smallTopAppBarColors(
                    containerColor = Color.White,
                    titleContentColor = Color.Black,
                    actionIconContentColor = Color.Black
                )
            ) // Top nav Bar Ends

            // second Section
            Divider(modifier = Modifier.fillMaxWidth(), color = Color.LightGray, thickness = 1.dp)
            Box(
                modifier = Modifier
                    .height(120.dp)
                    .fillMaxWidth()
                    .background(Color.White)
            ) {
                Column {

                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(25.dp)
                    ) {
                        Text(text = "25 of 60 completed", modifier = Modifier.weight(1f))
                        Text(
                            text = "25 of 60 completed",
                            modifier = Modifier.weight(1f),
                            textAlign = TextAlign.End
                        )
                    }
                    Text(
                        modifier = Modifier.fillMaxWidth(), text = "25 of 60 completed",
                        textAlign = TextAlign.Center
                    )
                }
            } // box end
            Divider(modifier = Modifier.fillMaxWidth(), color = Color.LightGray, thickness = 1.dp)

            Column {
                TabRow(
                    selectedTabIndex = pagerState.currentPage,
                    containerColor = Color.White,
                    contentColor = Color.Black,
                    modifier = Modifier
                        .background(color = Color.Black)
                        .clip(RoundedCornerShape(1.dp)),
                    indicator = { tabPositions ->
                        TabRowDefaults.Indicator(
                            color = Color.Black,
                            modifier = Modifier
                                .tabIndicatorOffset(tabPositions[pagerState.currentPage])
                                .width(0.dp)
                                .height(0.dp))

                    }
                ) {
                    tabItems.forEachIndexed { index, title ->
                        val color = remember {
                            Animatable(Color.Red)
                        }

                        LaunchedEffect(
                            pagerState.currentPage == index
                        ) {
                            color.animateTo(if (pagerState.currentPage == index) Color.Red else Color.Black)
                        }
                        Tab(
                            text = {
                                Text(
                                    title,
                                    style = if (pagerState.currentPage == index) TextStyle(
                                        color = Color.Black,
                                        fontSize = 18.sp,
                                    ) else TextStyle(color = Color.Black, fontSize = 16.sp)
                                )
                            },
                            selected = pagerState.currentPage == index,
                            modifier = Modifier
                                .background(
                                    color = Color.White,
                                    shape = RoundedCornerShape(2.dp)
                                )
                                .fillMaxWidth(),
                            onClick = {
                                coroutineScope.launch {
                                    pagerState.animateScrollToPage(index)
                                }
                            }
                        )
                    }
                }
                HorizontalPager(
                    state = pagerState,
                    modifier = Modifier
                        .fillMaxSize()
                        .background(color = Color.White)
                ) { page ->
                    Text(
                        text = tabItems[page],
                        modifier = Modifier.padding(50.dp),
                        color = Color.Black
                    )
                }
            } //Tab layout end
        }// column end
    }
}



