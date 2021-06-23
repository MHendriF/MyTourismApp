package com.mhendrif.mytourismapp

import android.app.Application
import android.content.Context
import com.google.android.play.core.splitcompat.SplitCompat
import com.mhendrif.mytourismapp.core.di.databaseModule
import com.mhendrif.mytourismapp.core.di.networkModule
import com.mhendrif.mytourismapp.core.di.repositoryModule
import com.mhendrif.mytourismapp.di.useCaseModule
import com.mhendrif.mytourismapp.di.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.core.logger.Level

class MyApplication : Application() {

    override fun attachBaseContext(base: Context?) {
        super.attachBaseContext(base)
        SplitCompat.install(this)
    }

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