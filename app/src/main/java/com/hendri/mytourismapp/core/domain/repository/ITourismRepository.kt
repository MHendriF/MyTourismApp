package com.hendri.mytourismapp.core.domain.repository

import com.hendri.mytourismapp.core.data.Resource
import com.hendri.mytourismapp.core.domain.model.Tourism
import io.reactivex.Flowable

interface ITourismRepository {
    fun getAllTourism(): Flowable<Resource<List<Tourism>>>

    fun getFavoriteTourism(): Flowable<List<Tourism>>

    fun setFavoriteTourism(tourism: Tourism, state: Boolean)
}