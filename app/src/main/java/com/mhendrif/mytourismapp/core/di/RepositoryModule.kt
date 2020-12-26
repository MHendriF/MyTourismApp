package com.mhendrif.mytourismapp.core.di

import com.mhendrif.mytourismapp.core.data.TourismRepository
import com.mhendrif.mytourismapp.core.domain.repository.ITourismRepository
import dagger.Binds
import dagger.Module

@Module(includes = [NetworkModule::class, DatabaseModule::class])
abstract class RepositoryModule {

    @Binds
    abstract fun provideRepository(tourismRepository: TourismRepository): ITourismRepository
}