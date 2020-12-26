package com.mhendrif.mytourismapp.core.domain.repository

import androidx.lifecycle.LiveData
import com.mhendrif.mytourismapp.core.data.Resource
import com.mhendrif.mytourismapp.core.domain.model.Tourism

interface ITourismRepository {
    fun getAllTourism(): LiveData<Resource<List<Tourism>>>

    fun getFavoriteTourism(): LiveData<List<Tourism>>

    fun setFavoriteTourism(tourism: Tourism, state: Boolean)
}