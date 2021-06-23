package com.mhendrif.mytourismapp.maps

import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import com.mhendrif.mytourismapp.core.domain.usecase.TourismUseCase

class MapsViewModel(tourismUseCase: TourismUseCase) : ViewModel() {
    val tourism = tourismUseCase.getAllTourism().asLiveData()
}