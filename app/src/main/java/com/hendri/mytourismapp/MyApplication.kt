package com.hendri.mytourismapp

import android.app.Application
import com.hendri.mytourismapp.core.di.databaseModule
import com.hendri.mytourismapp.core.di.networkModule
import com.hendri.mytourismapp.core.di.repositoryModule
import com.hendri.mytourismapp.di.useCaseModule
import com.hendri.mytourismapp.di.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.core.logger.Level

class MyApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidLogger(Level.NONE)
            androidContext(this@MyApplication)
            modules(
                listOf(
                    databaseModule,
                    networkModule,
                    repositoryModule,
                    useCaseModule,
                    viewModelModule
                )
            )
        }
    }
}