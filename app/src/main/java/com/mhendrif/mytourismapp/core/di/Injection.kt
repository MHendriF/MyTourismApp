package com.mhendrif.mytourismapp.core.di

import android.content.Context

import com.mhendrif.mytourismapp.core.data.source.local.LocalDataSource
import com.dicoding.tourismapp.core.data.source.local.room.TourismDatabase

import com.mhendrif.mytourismapp.core.data.TourismRepository
import com.mhendrif.mytourismapp.core.data.source.remote.RemoteDataSource
import com.mhendrif.mytourismapp.core.domain.repository.ITourismRepository
import com.mhendrif.mytourismapp.core.domain.usecase.TourismInteractor
import com.mhendrif.mytourismapp.core.domain.usecase.TourismUseCase
import com.mhendrif.mytourismapp.core.utils.AppExecutors
import com.mhendrif.mytourismapp.core.utils.JsonHelper

object Injection {
    fun provideRepository(context: Context): ITourismRepository {
        val database = TourismDatabase.getInstance(context)

        val remoteDataSource = RemoteDataSource.getInstance(JsonHelper(context))
        val localDataSource = LocalDataSource.getInstance(database.tourismDao())
        val appExecutors = AppExecutors()

        return TourismRepository.getInstance(remoteDataSource, localDataSource, appExecutors)
    }

    fun provideTourismUseCase(context: Context): TourismUseCase {
        val repository = provideRepository(context)
        return TourismInteractor(repository)
    }
}
