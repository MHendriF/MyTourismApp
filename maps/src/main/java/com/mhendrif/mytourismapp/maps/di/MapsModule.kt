package com.mhendrif.mytourismapp.maps.di

import com.mhendrif.mytourismapp.maps.MapsViewModel
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module

val mapsModule = module {
    viewModel { MapsViewModel(get()) }
}