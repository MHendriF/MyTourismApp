package com.mhendrif.mytourismapp.core.di

import com.mhendrif.mytourismapp.core.data.TourismRepository
import com.mhendrif.mytourismapp.core.domain.repository.ITourismRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent

@Module
@InstallIn(ApplicationComponent::class)
abstract class RepositoryModule {

    @Binds
    abstract fun provideRepository(tourismRepository: TourismRepository): ITourismRepository
}