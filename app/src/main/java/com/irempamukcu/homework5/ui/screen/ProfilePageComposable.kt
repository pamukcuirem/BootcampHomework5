package com.irempamukcu.homework5.ui.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.irempamukcu.homework5.R
import com.irempamukcu.homework5.ui.theme.amazonEmberBold


@Composable
fun ProfilePageComposable() {//This composable is for profile page
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top
    ) {

        Text(
            text = stringResource(R.string.watch_list_title),
            textAlign = TextAlign.Center,
            fontFamily = amazonEmberBold,
            color = Color.White,
            fontSize = 16.sp,
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 20.dp, bottom = 7.dp)
        )


        Box(
            modifier = Modifier
                .background(color = Color.Gray)
                .fillMaxWidth()
                .fillMaxHeight(0.001f)
        ) {}


        Spacer(modifier = Modifier.height(16.dp))


        Column(
            modifier = Modifier
                .fillMaxSize()
                .weight(1f),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                modifier = Modifier.padding(horizontal = 30.dp),
                text = stringResource(R.string.take_a_look_title),
                fontFamily = amazonEmberBold,
                color = Color.White,
                fontSize = 21.sp,
                textAlign = TextAlign.Center
            )

            Text(
                modifier = Modifier.padding(top = 5.dp, start = 30.dp, end = 30.dp),
                text = stringResource(R.string.library_share_info),
                fontFamily = amazonEmberBold,
                color = Color.Gray,
                fontSize = 13.sp,
                textAlign = TextAlign.Center
            )
        }
    }
}
