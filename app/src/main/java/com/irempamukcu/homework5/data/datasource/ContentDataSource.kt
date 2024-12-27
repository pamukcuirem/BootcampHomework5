package com.irempamukcu.homework5.data.datasource

import com.irempamukcu.homework5.data.entity.ContentType
import com.irempamukcu.homework5.data.entity.Contents
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class ContentDataSource {
    suspend fun loadContentListData(type: ContentType): List<Contents> = withContext(Dispatchers.IO) {
        when (type) {
            ContentType.VOICEOVER -> listOf(
                Contents(1, "Atatürk", "ataturk", "movie", "war"),
                Contents(2, "Balina", "balina", "movie", "health"),
                Contents(3, "Biz Böyleyiz", "bizboyleyiz", "movie", "youth"),
                Contents(4, "Cem Yılmaz", "cmyilmaz", "stand-up", "comedy"),
                Contents(5, "Yaşam Koçu", "yasamkocu", "movie", "comedy"),
                Contents(6, "Sil Baştan", "silbastan", "movie", "romantic")
            )
            ContentType.BEST_TV_SERIES -> listOf(
                Contents(7, "Supernatural", "supernatural", "series", "horror"),
                Contents(8, "Succession", "succession", "series", "business"),
                Contents(9, "The Big Bang Theory", "thebigbangtheory", "series", "sitcom"),
                Contents(10, "Mr. Robot", "mrrobot", "series", "software"),
                Contents(11, "Chernobyl", "chernobyl", "series", "documentary"),
                Contents(12, "The Office", "theoffice", "series", "sitcom")
            )
            ContentType.RECOMMENDED -> listOf(
                Contents(13, "Bahar", "bahar", "series", "sitcom"),
                Contents(14, "Bir Erkek Bir Kadın", "birerkekbirkadin", "series", "sitcom"),
                Contents(15, "Brooklyn Nine Nine", "brooklynninenine", "series", "sitcom"),
                Contents(16, "Çukur", "cukur", "series", "fight"),
                Contents(17, "Friends", "friends", "series", "sitcom"),
                Contents(18, "The Boys", "theboys", "series", "superhero")
            )
            ContentType.IMDB_BESTS -> listOf(
                Contents(19, "Cebimdeki Yabancı", "cebimdekiyabanci", "movie", "youth"),
                Contents(20, "Ex-Machine", "exmachine", "movie", "dystopia"),
                Contents(21, "Jurassic Park", "jurrasicpark", "movie", "dystopia"),
                Contents(22, "Oppenheimer", "oppenheimer", "movie", "documentary"),
                Contents(23, "Sil Baştan", "silbastan", "movie", "comedy"),
                Contents(24, "Shrek", "shrek", "movie", "animation")
            )
            ContentType.AWARDS -> listOf(
                Contents(25, "Açlık Oyunları", "hungergames", "movie", "dystopia"),
                Contents(26, "Oppenheimer", "oppenheimer", "movie", "documentary"),
                Contents(27, "Jurassic Park", "jurrasicpark", "movie", "dystopia"),
                Contents(28, "Büyü de Gel", "nohardfeelings", "movie", "comedy"),
                Contents(29, "Sil Baştan", "silbastan", "movie", "comedy"),
                Contents(30, "Chernobyl", "chernobyl", "series", "documentary")
            )
        }
    }

    suspend fun loadSliderListData(): List<String> = withContext(Dispatchers.IO){
        val sliderList = ArrayList<String>()
        val brooklynNineNine = "brooklynninenineslider"
        val beast = "beastslider"
        val cemKaraca = "cemkaracaslider"
        val culpaTuya = "culpatuyaslider"
        val bahar = "baharslider"

        sliderList.add(beast)
        sliderList.add(brooklynNineNine)
        sliderList.add(bahar)
        sliderList.add(culpaTuya)
        sliderList.add(cemKaraca)

        return@withContext sliderList

           }
}