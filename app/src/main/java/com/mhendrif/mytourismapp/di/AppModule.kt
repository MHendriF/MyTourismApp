package com.mhendrif.mytourismapp.di

import com.mhendrif.mytourismapp.core.domain.usecase.TourismInteractor
import com.mhendrif.mytourismapp.core.domain.usecase.TourismUseCase
import dagger.Binds
import dagger.Module

@Module
abstract class AppModule {
    @Binds
    abstract fun provideTourismUseCase(tourismInteractor: TourismInteractor): TourismUseCase
}