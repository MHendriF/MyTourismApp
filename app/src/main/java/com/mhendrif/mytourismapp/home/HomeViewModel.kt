package com.mhendrif.mytourismapp.home

import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import com.mhendrif.mytourismapp.core.domain.usecase.TourismUseCase

class HomeViewModel(tourismUseCase: TourismUseCase) : ViewModel() {
    val tourism = tourismUseCase.getAllTourism().asLiveData()
}

