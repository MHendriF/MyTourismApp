package com.mhendrif.mytourismapp.favorite

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import com.mhendrif.mytourismapp.core.domain.usecase.TourismUseCase

class FavoriteViewModel @ViewModelInject constructor(tourismUseCase: TourismUseCase) : ViewModel() {

    val favoriteTourism = tourismUseCase.getFavoriteTourism().asLiveData()

}

