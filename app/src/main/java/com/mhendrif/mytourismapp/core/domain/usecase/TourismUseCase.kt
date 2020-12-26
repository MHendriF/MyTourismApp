package com.mhendrif.mytourismapp.core.domain.usecase

import androidx.lifecycle.LiveData
import com.mhendrif.mytourismapp.core.data.Resource
import com.mhendrif.mytourismapp.core.domain.model.Tourism

interface TourismUseCase {
    fun getAllTourism(): LiveData<Resource<List<Tourism>>>
    fun getFavoriteTourism(): LiveData<List<Tourism>>
    fun setFavoriteTourism(tourism: Tourism, state: Boolean)
}