package com.irempamukcu.homework5.ui.viewmodels

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.irempamukcu.homework5.data.entity.ContentType
import com.irempamukcu.homework5.data.entity.Contents
import com.irempamukcu.homework5.data.repo.ContentRepository
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch


class MainPageViewModel : ViewModel() {

    private val contentRepository = ContentRepository()
    val contentList = MutableLiveData<Map<ContentType, List<Contents>>>()
    val sliderList = MutableLiveData<List<String>>()


    fun loadContentListData() {
        CoroutineScope(Dispatchers.Main).launch {
            val voiceover = contentRepository.loadContentByCategory(ContentType.VOICEOVER)
            val bestTvSeries = contentRepository.loadContentByCategory(ContentType.BEST_TV_SERIES)
            val recommended = contentRepository.loadContentByCategory(ContentType.RECOMMENDED)
            val imdbBests = contentRepository.loadContentByCategory(ContentType.IMDB_BESTS)
            val awards = contentRepository.loadContentByCategory(ContentType.AWARDS)

            contentList.value = mapOf(
                ContentType.VOICEOVER to voiceover,
                ContentType.BEST_TV_SERIES to bestTvSeries,
                ContentType.RECOMMENDED to recommended,
                ContentType.IMDB_BESTS to imdbBests,
                ContentType.AWARDS to awards
            )
        }
    }

   fun loadSliderListData(){
       CoroutineScope(Dispatchers.Main).launch {
            sliderList.value = contentRepository.loadSliderListData()

       }
   }
}