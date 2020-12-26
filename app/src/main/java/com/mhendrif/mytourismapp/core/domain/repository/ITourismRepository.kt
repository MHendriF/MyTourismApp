package com.mhendrif.mytourismapp.core.domain.repository

import com.mhendrif.mytourismapp.core.data.Resource
import com.mhendrif.mytourismapp.core.domain.model.Tourism
import kotlinx.coroutines.flow.Flow

interface ITourismRepository {
    fun getAllTourism(): Flow<Resource<List<Tourism>>>

    fun getFavoriteTourism(): Flow<List<Tourism>>

    fun setFavoriteTourism(tourism: Tourism, state: Boolean)
}