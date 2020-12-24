package com.hendri.mytourismapp.core.domain.usecase

import com.hendri.mytourismapp.core.data.Resource
import com.hendri.mytourismapp.core.domain.model.Tourism
import io.reactivex.Flowable

interface TourismUseCase {
    fun getAllTourism(): Flowable<Resource<List<Tourism>>>
    fun getFavoriteTourism(): Flowable<List<Tourism>>
    fun setFavoriteTourism(tourism: Tourism, state: Boolean)
}