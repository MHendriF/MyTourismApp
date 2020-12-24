package com.hendri.mytourismapp.di

import com.hendri.mytourismapp.core.domain.usecase.TourismInteractor
import com.hendri.mytourismapp.core.domain.usecase.TourismUseCase
import com.hendri.mytourismapp.detail.DetailTourismViewModel
import com.hendri.mytourismapp.favorite.FavoriteViewModel
import com.hendri.mytourismapp.home.HomeViewModel
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