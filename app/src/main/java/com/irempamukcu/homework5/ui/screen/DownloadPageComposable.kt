package com.irempamukcu.homework5.ui.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.irempamukcu.homework5.R
import com.irempamukcu.homework5.ui.theme.amazonEmberBold
import com.irempamukcu.homework5.ui.theme.primeBlue

@Composable
fun DownloadPageComposable(){//This composable is for download page
    Column (
        Modifier
            .fillMaxSize()
            .background(Color.Black),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center){
        Text(modifier = Modifier.padding(bottom = 5.dp),
            text = stringResource(R.string.no_downloaded_video_title),
            fontFamily = amazonEmberBold,
            color = Color.White,
            fontSize = 18.sp
        )
        Row (Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center){
            Text(modifier = Modifier.padding(5.dp),
                text = stringResource(R.string.automatic_donwload_title),
                fontFamily = amazonEmberBold,
                color = Color.White,
                fontSize = 12.sp
            )


            Text(modifier = Modifier.padding(5.dp),
                text = stringResource(R.string.manage_downloads_title),
                fontFamily = amazonEmberBold,
                color = primeBlue,
                fontSize = 12.sp
            )
        }

    }
}