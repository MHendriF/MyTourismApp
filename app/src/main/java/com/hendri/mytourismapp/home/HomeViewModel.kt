package com.hendri.mytourismapp.home

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import com.hendri.mytourismapp.core.domain.usecase.TourismUseCase

class HomeViewModel @ViewModelInject constructor(tourismUseCase: TourismUseCase) : ViewModel() {
    val tourism = tourismUseCase.getAllTourism().asLiveData()
}

