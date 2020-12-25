package com.hendri.mytourismapp.home

import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import com.hendri.mytourismapp.core.domain.usecase.TourismUseCase
import javax.inject.Inject

class HomeViewModel @Inject constructor(tourismUseCase: TourismUseCase) : ViewModel() {
    val tourism = tourismUseCase.getAllTourism().asLiveData()
}

