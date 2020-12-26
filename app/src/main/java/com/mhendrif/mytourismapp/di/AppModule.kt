package com.mhendrif.mytourismapp.di

import com.mhendrif.mytourismapp.core.domain.usecase.TourismInteractor
import com.mhendrif.mytourismapp.core.domain.usecase.TourismUseCase
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent

@Module
@InstallIn(ActivityComponent::class)
abstract class AppModule {
    @Binds
    abstract fun provideTourismUseCase(tourismInteractor: TourismInteractor): TourismUseCase
}