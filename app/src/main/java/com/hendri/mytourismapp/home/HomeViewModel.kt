package com.hendri.mytourismapp.home

import androidx.lifecycle.ViewModel
import com.hendri.mytourismapp.core.data.TourismRepository
import com.hendri.mytourismapp.core.domain.usecase.TourismUseCase

class HomeViewModel(tourismUseCase: TourismUseCase) : ViewModel() {

    val tourism = tourismUseCase.getAllTourism()

}

