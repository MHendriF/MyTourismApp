package com.mhendrif.mytourismapp.favorite

import androidx.lifecycle.ViewModel
import com.mhendrif.mytourismapp.core.domain.usecase.TourismUseCase

class FavoriteViewModel(tourismUseCase: TourismUseCase) : ViewModel() {

    val favoriteTourism = tourismUseCase.getFavoriteTourism()

}

