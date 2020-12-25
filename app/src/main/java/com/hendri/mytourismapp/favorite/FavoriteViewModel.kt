package com.hendri.mytourismapp.favorite

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import com.hendri.mytourismapp.core.domain.usecase.TourismUseCase

class FavoriteViewModel @ViewModelInject constructor(tourismUseCase: TourismUseCase) : ViewModel() {

    val favoriteTourism = tourismUseCase.getFavoriteTourism().asLiveData()

}

