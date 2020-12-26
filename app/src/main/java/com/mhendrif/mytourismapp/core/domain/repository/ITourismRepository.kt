package com.mhendrif.mytourismapp.core.domain.repository

import com.mhendrif.mytourismapp.core.data.Resource
import com.mhendrif.mytourismapp.core.domain.model.Tourism
import io.reactivex.Flowable

interface ITourismRepository {
    fun getAllTourism(): Flowable<Resource<List<Tourism>>>

    fun getFavoriteTourism(): Flowable<List<Tourism>>

    fun setFavoriteTourism(tourism: Tourism, state: Boolean)
}