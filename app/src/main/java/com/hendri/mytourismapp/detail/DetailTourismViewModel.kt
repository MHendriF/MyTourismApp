package com.hendri.mytourismapp.detail

import androidx.lifecycle.ViewModel
import com.hendri.mytourismapp.core.domain.model.Tourism
import com.hendri.mytourismapp.core.domain.usecase.TourismUseCase

class DetailTourismViewModel(private val tourismUseCase: TourismUseCase) : ViewModel() {
    fun setFavoriteTourism(tourism: Tourism, newStatus:Boolean) = tourismUseCase.setFavoriteTourism(tourism, newStatus)
}

