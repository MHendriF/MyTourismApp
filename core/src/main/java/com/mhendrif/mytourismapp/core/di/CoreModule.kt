package com.mhendrif.mytourismapp.core.di

import androidx.room.Room
import com.mhendrif.mytourismapp.core.data.TourismRepository
import com.mhendrif.mytourismapp.core.data.source.local.LocalDataSource
import com.mhendrif.mytourismapp.core.data.source.local.room.TourismDatabase
import com.mhendrif.mytourismapp.core.data.source.remote.RemoteDataSource
import com.mhendrif.mytourismapp.core.data.source.remote.network.ApiService
import com.mhendrif.mytourismapp.core.domain.repository.ITourismRepository
import com.mhendrif.mytourismapp.core.utils.AppExecutors
import net.sqlcipher.database.SQLiteDatabase
import net.sqlcipher.database.SupportFactory
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

val databaseModule = module {
    factory { get<TourismDatabase>().tourismDao() }
    single {
        val passphrase: ByteArray = SQLiteDatabase.getBytes("mhendrif".toCharArray())
        val factory = SupportFactory(passphrase)
        Room.databaseBuilder(
                androidContext(),
                TourismDatabase::class.java, "Tourism.db"
        ).fallbackToDestructiveMigration()
                .openHelperFactory(factory)
                .build()
    }
}

val networkModule = module {
    single {
        OkHttpClient.Builder()
                .addInterceptor(HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY))
                .connectTimeout(120, TimeUnit.SECONDS)
                .readTimeout(120, TimeUnit.SECONDS)
                .build()
    }
    single {
        val retrofit = Retrofit.Builder()
                .baseUrl("https://tourism-api.dicoding.dev/")
                .addConverterFactory(GsonConverterFactory.create())
                .client(get())
                .build()
        retrofit.create(ApiService::class.java)
    }
}

val repositoryModule = module {
    single { LocalDataSource(get()) }
    single { RemoteDataSource(get()) }
    factory { AppExecutors() }
    single<ITourismRepository> { TourismRepository(get(), get(), get()) }
}