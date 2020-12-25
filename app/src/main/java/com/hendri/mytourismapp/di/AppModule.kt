package com.hendri.mytourismapp.di

import com.hendri.mytourismapp.core.domain.usecase.TourismInteractor
import com.hendri.mytourismapp.core.domain.usecase.TourismUseCase
import dagger.Binds
import dagger.Module

@Module
abstract class AppModule {
    @Binds
    abstract fun provideTourismUseCase(tourismInteractor: TourismInteractor): TourismUseCase
}