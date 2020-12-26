package com.mhendrif.mytourismapp.core.data

import androidx.lifecycle.LiveData
import androidx.lifecycle.Transformations
import com.mhendrif.mytourismapp.core.data.source.remote.network.ApiResponse
import com.mhendrif.mytourismapp.core.data.source.local.LocalDataSource
import com.mhendrif.mytourismapp.core.data.source.remote.RemoteDataSource
import com.mhendrif.mytourismapp.core.data.source.remote.response.TourismResponse
import com.mhendrif.mytourismapp.core.domain.model.Tourism
import com.mhendrif.mytourismapp.core.domain.repository.ITourismRepository
import com.mhendrif.mytourismapp.core.utils.AppExecutors
import com.mhendrif.mytourismapp.core.utils.DataMapper

class TourismRepository private constructor(
    private val remoteDataSource: RemoteDataSource,
    private val localDataSource: LocalDataSource,
    private val appExecutors: AppExecutors
) : ITourismRepository {

    companion object {
        @Volatile
        private var instance: TourismRepository? = null

        fun getInstance(
            remoteData: RemoteDataSource,
            localData: LocalDataSource,
            appExecutors: AppExecutors
        ): TourismRepository =
            instance ?: synchronized(this) {
                instance ?: TourismRepository(remoteData, localData, appExecutors)
            }
    }

    override fun getAllTourism(): LiveData<Resource<List<Tourism>>> =
        object : NetworkBoundResource<List<Tourism>, List<TourismResponse>>(appExecutors) {
            override fun loadFromDB(): LiveData<List<Tourism>> {
                return Transformations.map(localDataSource.getAllTourism()) {
                    DataMapper.mapEntitiesToDomain(it)
                }
            }

            override fun shouldFetch(data: List<Tourism>?): Boolean =
                data == null || data.isEmpty()

            override fun createCall(): LiveData<ApiResponse<List<TourismResponse>>> =
                remoteDataSource.getAllTourism()

            override fun saveCallResult(data: List<TourismResponse>) {
                val tourismList = DataMapper.mapResponsesToEntities(data)
                localDataSource.insertTourism(tourismList)
            }
        }.asLiveData()

    override fun getFavoriteTourism(): LiveData<List<Tourism>> {
        return Transformations.map(localDataSource.getFavoriteTourism()) {
            DataMapper.mapEntitiesToDomain(it)
        }
    }

    override fun setFavoriteTourism(tourism: Tourism, state: Boolean) {
        val tourismEntity = DataMapper.mapDomainToEntity(tourism)
        appExecutors.diskIO().execute { localDataSource.setFavoriteTourism(tourismEntity, state) }
    }
}

