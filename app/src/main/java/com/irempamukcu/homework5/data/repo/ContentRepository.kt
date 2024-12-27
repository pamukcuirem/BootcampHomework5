package com.irempamukcu.homework5.data.repo

import com.irempamukcu.homework5.data.entity.ContentType
import com.irempamukcu.homework5.data.datasource.ContentDataSource
import com.irempamukcu.homework5.data.entity.Contents

class ContentRepository {

    private val contentDataSource = ContentDataSource()

    suspend fun loadContentByCategory(contentType: ContentType): List<Contents> = contentDataSource.loadContentListData(contentType)

    suspend fun loadSliderListData(): List<String> = contentDataSource.loadSliderListData()
}