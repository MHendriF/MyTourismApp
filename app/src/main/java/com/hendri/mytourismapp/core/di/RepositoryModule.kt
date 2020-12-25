package com.hendri.mytourismapp.core.di

import com.hendri.mytourismapp.core.data.TourismRepository
import com.hendri.mytourismapp.core.domain.repository.ITourismRepository
import dagger.Binds
import dagger.Module

@Module(includes = [NetworkModule::class, DatabaseModule::class])
abstract class RepositoryModule {

    @Binds
    abstract fun provideRepository(tourismRepository: TourismRepository): ITourismRepository
}