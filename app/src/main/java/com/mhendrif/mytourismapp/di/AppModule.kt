package com.mhendrif.mytourismapp.di

import com.mhendrif.mytourismapp.core.domain.usecase.TourismInteractor
import com.mhendrif.mytourismapp.core.domain.usecase.TourismUseCase
import com.mhendrif.mytourismapp.detail.DetailTourismViewModel
import com.mhendrif.mytourismapp.favorite.FavoriteViewModel
import com.mhendrif.mytourismapp.home.HomeViewModel
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module

val useCaseModule = module {
    factory<TourismUseCase> { TourismInteractor(get()) }
}

val viewModelModule = module {
    viewModel { HomeViewModel(get()) }
    viewModel { FavoriteViewModel(get()) }
    viewModel { DetailTourismViewModel(get()) }
}