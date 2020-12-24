package com.hendri.mytourismapp.core.di

import android.content.Context

import com.hendri.mytourismapp.core.data.source.local.LocalDataSource
import com.hendri.mytourismapp.core.data.source.local.room.TourismDatabase

import com.hendri.mytourismapp.core.data.TourismRepository
import com.hendri.mytourismapp.core.data.source.remote.RemoteDataSource
import com.hendri.mytourismapp.core.data.source.remote.network.ApiConfig
import com.hendri.mytourismapp.core.domain.repository.ITourismRepository
import com.hendri.mytourismapp.core.domain.usecase.TourismInteractor
import com.hendri.mytourismapp.core.domain.usecase.TourismUseCase
import com.hendri.mytourismapp.core.utils.AppExecutors

object Injection {
    fun provideRepository(context: Context): ITourismRepository {
        val database = TourismDatabase.getInstance(context)

        val remoteDataSource = RemoteDataSource.getInstance(ApiConfig.provideApiService())
        val localDataSource = LocalDataSource.getInstance(database.tourismDao())
        val appExecutors = AppExecutors()

        return TourismRepository.getInstance(remoteDataSource, localDataSource, appExecutors)
    }

    fun provideTourismUseCase(context: Context): TourismUseCase {
        val repository = provideRepository(context)
        return TourismInteractor(repository)
    }
}
