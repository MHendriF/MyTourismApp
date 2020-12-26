package com.mhendrif.mytourismapp.detail

import androidx.lifecycle.ViewModel
import com.mhendrif.mytourismapp.core.domain.model.Tourism
import com.mhendrif.mytourismapp.core.domain.usecase.TourismUseCase

class DetailTourismViewModel(private val tourismUseCase: TourismUseCase) : ViewModel() {
    fun setFavoriteTourism(tourism: Tourism, newStatus:Boolean) = tourismUseCase.setFavoriteTourism(tourism, newStatus)
}

