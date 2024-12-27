package com.irempamukcu.homework5.ui.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.irempamukcu.homework5.R
import com.irempamukcu.homework5.ui.theme.amazonEmberBold
import com.irempamukcu.homework5.ui.theme.primeBlue
import com.irempamukcu.homework5.ui.viewmodels.MainPageViewModel


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AllPagesComposable(mainPageViewModel: MainPageViewModel) {
    val selectedItem = remember { mutableStateOf(0) }
    val configuration = LocalConfiguration.current
    val screenHeight = configuration.screenHeightDp
    val screenWidth = configuration.screenWidthDp

    Scaffold(topBar = {
       if(selectedItem.value== 0){
           TopAppBar(
               title = {},
               colors = TopAppBarDefaults.mediumTopAppBarColors(
                   containerColor = Color.Black,
                   titleContentColor = Color.White
               ),
               navigationIcon = {
                   Image(
                       painter = painterResource(id = R.drawable.primevideologo),
                       contentDescription = "Left Image",
                       modifier = Modifier
                           .size((screenWidth / 4).dp)
                           .padding(horizontal = 8.dp, vertical = 20.dp)
                   )
               },
               actions = {
                   Image(
                       painter = painterResource(id = R.drawable.share_screen),
                       contentDescription = "Right Image",
                       modifier = Modifier
                           .size((screenWidth / 7).dp)
                           .padding(horizontal = 16.dp)
                   )
               }
           )
       }else if(selectedItem.value == 1){
           TopAppBar(
               title = {
                   Text("Prime",color = Color.White,
                       fontSize = (screenWidth/20).sp,
                       fontFamily = amazonEmberBold,
                       fontWeight = FontWeight.Bold)
               },
               colors = TopAppBarDefaults.mediumTopAppBarColors(
                   containerColor = Color.Black,
                   titleContentColor = Color.White
               ),
               actions = {
                   Image(
                       painter = painterResource(id = R.drawable.share_screen),
                       contentDescription = "Right Image",
                       modifier = Modifier
                           .size((screenWidth / 7).dp)
                           .padding(horizontal = 16.dp)
                   )
               }
           )
       }
        else if(selectedItem.value == 2){
           TopAppBar(
               title = {
                   Text(
                       stringResource(R.string.downloads_text),color = Color.White,
                       fontSize = (screenWidth/20).sp,
                       fontFamily = amazonEmberBold,
                       fontWeight = FontWeight.Bold)
               },
               colors = TopAppBarDefaults.mediumTopAppBarColors(
                   containerColor = Color.Black,
                   titleContentColor = Color.White
               ),
               actions = {
                   Image(
                       painter = painterResource(id = R.drawable.share_screen),
                       contentDescription = "Right Image",
                       modifier = Modifier
                           .size((screenWidth / 7).dp)
                           .padding(horizontal = 16.dp)
                   )
               }
           )
       }
       else if(selectedItem.value == 3){
           TopAppBar(
               title = {
                   Text(
                       stringResource(R.string.search_text),color = Color.White,
                       fontSize = (screenWidth/20).sp,
                       fontFamily = amazonEmberBold,
                       fontWeight = FontWeight.Bold)
               },
               colors = TopAppBarDefaults.mediumTopAppBarColors(
                   containerColor = Color.Black,
                   titleContentColor = Color.White
               ),
               actions = {
                   Image(
                       painter = painterResource(id = R.drawable.share_screen),
                       contentDescription = "Right Image",
                       modifier = Modifier
                           .size((screenWidth / 7).dp)
                           .padding(horizontal = 16.dp)
                   )
               }
           )
       }
       else if(selectedItem.value == 4){
           TopAppBar(
               title = {},
               colors = TopAppBarDefaults.mediumTopAppBarColors(
                   containerColor = Color.Black,
                   titleContentColor = Color.White
               ),
               navigationIcon = {
                   Row(
                       modifier = Modifier
                           .padding(top = 25.dp)
                           .height((screenWidth / 6).dp)
                           .padding(start = 4.dp),
                       verticalAlignment = Alignment.CenterVertically
                   ) {
                       Image(
                           painter = painterResource(id = R.drawable.profileicon),
                           contentDescription = "Left Image",
                           modifier = Modifier.size((screenWidth / 7).dp)
                       )
                       Column(
                           modifier = Modifier
                               .padding(start = 4.dp)
                               .fillMaxHeight(),
                           verticalArrangement = Arrangement.Center
                       ) {
                           Text(
                               text = stringResource(R.string.account_name),
                               fontFamily = amazonEmberBold,
                               color = Color.White,

                           )
                           Text(
                               text = stringResource(R.string.change_profiles),
                               fontFamily = amazonEmberBold,
                               fontSize = 13.sp,
                               color = Color.Gray,

                           )
                       }
                   }
               },
               actions = {
                   Row(
                       modifier = Modifier.padding(end = 16.dp),
                       verticalAlignment = Alignment.CenterVertically
                   ) {
                       Image(
                           painter = painterResource(id = R.drawable.share_screen),
                           contentDescription = "Share Screen Icon",
                           modifier = Modifier
                               .size((screenWidth / 7).dp)
                               .padding(top = 5.dp, start = 15.dp, end = 15.dp)
                       )
                       Image(
                           painter = painterResource(id = R.drawable.settingsicon),
                           contentDescription = "Settings Icon",
                           modifier = Modifier
                               .size((screenWidth / 7).dp)
                               .padding(top = 5.dp, start = 15.dp, end = 15.dp)
                       )
                   }
               }

           )

       }
    },
        bottomBar = {
            androidx.compose.material3.NavigationBar(
                containerColor = Color.Black
            ) {
                NavigationBarItem(
                    selected = selectedItem.value == 0,
                    onClick = { selectedItem.value = 0 },
                    label = { Text(text = stringResource(R.string.home_screen_title)) },
                    icon = {
                        if(selectedItem.value == 0){
                            Icon(
                                painter = painterResource(R.drawable.homeiconclick),
                                contentDescription = "Home"
                            )
                        }else{
                            Icon(
                                painter = painterResource(R.drawable.homeicon),
                                contentDescription = "Home"
                            )
                        }

                    },
                    colors = NavigationBarItemDefaults.colors(
                        selectedIconColor = Color.White,
                        selectedTextColor = Color.White,
                        unselectedIconColor = Color.Gray,
                        unselectedTextColor = Color.Gray,
                        indicatorColor = Color.Transparent
                    )
                )
                NavigationBarItem(
                    selected = selectedItem.value == 1,
                    onClick = { selectedItem.value = 1 },
                    label = { Text(text = stringResource(R.string.prime_screen_title)) },
                    icon = {
                        if(selectedItem.value == 1){
                            Icon(
                                painter = painterResource(R.drawable.primeonclick),
                                contentDescription = "Prime"
                            )
                        }else{
                            Icon(
                                painter = painterResource(R.drawable.primeicon),
                                contentDescription = "Prime"
                            )
                        }
                    },
                    colors = NavigationBarItemDefaults.colors(
                        selectedIconColor = primeBlue,
                        selectedTextColor = primeBlue,
                        unselectedIconColor = Color.Gray,
                        unselectedTextColor = Color.Gray,
                        indicatorColor = Color.Transparent
                    )
                )
                NavigationBarItem(
                    selected = selectedItem.value == 2,
                    onClick = { selectedItem.value = 2 },
                    label = { Text(text = stringResource(R.string.downloads_title)) },
                    icon = {
                        if(selectedItem.value == 2){
                            Icon(
                                painter = painterResource(R.drawable.downloadiconclick),
                                contentDescription = "Download"
                            )
                        }else{
                            Icon(
                                painter = painterResource(R.drawable.downloadicon),
                                contentDescription = "Download"
                            )
                        }

                    },
                    colors = NavigationBarItemDefaults.colors(
                        selectedIconColor = Color.White,
                        selectedTextColor = Color.White,
                        unselectedIconColor = Color.Gray,
                        unselectedTextColor = Color.Gray,
                        indicatorColor = Color.Transparent
                    )
                )
                NavigationBarItem(
                    selected = selectedItem.value == 3,
                    onClick = { selectedItem.value = 3 },
                    label = { Text(text = stringResource(R.string.search_title)) },
                    icon = {
                        if(selectedItem.value == 3){
                            Icon(
                                painter = painterResource(R.drawable.searchiconclick),
                                contentDescription = "Search"
                            )
                        }else{
                            Icon(
                                painter = painterResource(R.drawable.searchicon),
                                contentDescription = "Search"
                            )
                        }
                    },
                    colors = NavigationBarItemDefaults.colors(
                        selectedIconColor = Color.White,
                        selectedTextColor = Color.White,
                        unselectedIconColor = Color.Gray,
                        unselectedTextColor = Color.Gray,
                        indicatorColor = Color.Transparent
                    )
                )
                NavigationBarItem(
                    selected = selectedItem.value == 4,
                    onClick = { selectedItem.value = 4 },
                    label = { Text(text = stringResource(R.string.special_title)) },
                    icon = {
                        if(selectedItem.value == 4){
                            Icon(
                                painter = painterResource(R.drawable.profileiconclick),
                                contentDescription = "Home",
                                tint = Color.Unspecified
                            )
                        }else{
                            Icon(
                                painter = painterResource(R.drawable.profileicon),
                                contentDescription = "Home",
                                tint = Color.Unspecified
                            )
                        }
                    },
                    colors = NavigationBarItemDefaults.colors(

                        selectedTextColor = Color.White,
                        indicatorColor = Color.Transparent,

                        )
                )
            }
        }
    ) { innerPadding ->

        Box(modifier = Modifier.padding(innerPadding)) {
            when (selectedItem.value) {
                0 -> HomePageComposable(mainPageViewModel = mainPageViewModel)
                1 -> HomePageComposable(mainPageViewModel = mainPageViewModel)
                2 -> DownloadPageComposable()
                3 ->  SearchPageComposable()
                4 ->  ProfilePageComposable()
            }
        }
    }
}
