package com.irempamukcu.homework5.ui.screen

import android.app.Activity
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.irempamukcu.homework5.R
import com.irempamukcu.homework5.data.entity.ContentType
import com.irempamukcu.homework5.ui.viewmodels.MainPageViewModel

@Composable
fun HomePageComposable(mainPageViewModel: MainPageViewModel) {//This composable is for home page
    val configuration = LocalConfiguration.current
    val screenHeight = configuration.screenHeightDp
    val screenWidth = configuration.screenWidthDp
    val contentListMap = mainPageViewModel.contentList.observeAsState(mapOf())
    val sliderList = mainPageViewModel.sliderList.observeAsState(listOf())

    LaunchedEffect(true) {
        mainPageViewModel.loadContentListData()
        mainPageViewModel.loadSliderListData()
    }

    val scrollState = rememberScrollState()

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black)
            .verticalScroll(scrollState)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()

                .height(60.dp),
            horizontalArrangement = Arrangement.Start
        ) {
            CategoryChip("Filmler")
            CategoryChip("TV dizileri")
        }
        LazyRow (modifier = Modifier.fillMaxSize()){

            sliderList.value?.let {
                items(
                    it.count(),
                    itemContent = {
                        val content = sliderList.value!![it]
                        val activity = (LocalContext.current as Activity)
                        Image(bitmap = ImageBitmap.imageResource(id= activity.resources
                            .getIdentifier(content.toString(),"drawable",activity.packageName)),
                            contentDescription = content.toString(),
                            contentScale = ContentScale.FillWidth,
                            modifier = Modifier
                                .padding(horizontal = 5.dp)
                                .size(width = screenWidth.dp, (screenHeight / 3).dp)
                        )


                    }
                )
            }


        }


        Spacer(modifier = Modifier.size(28.dp))


        MoviesChip(stringResource(R.string.content_voiceover_title), contentListMap.value[ContentType.VOICEOVER])
        MoviesChip(stringResource(R.string.best_series_title), contentListMap.value[ContentType.BEST_TV_SERIES])
        MoviesChip(stringResource(R.string.recommended_series_title), contentListMap.value[ContentType.RECOMMENDED])
        MoviesChip(stringResource(R.string.imdb_bests_title), contentListMap.value[ContentType.IMDB_BESTS])
        MoviesChip(stringResource(R.string.award_list_title), contentListMap.value[ContentType.AWARDS])


    }
}

