package com.hendri.mytourismapp

import android.app.Application
import com.hendri.mytourismapp.core.di.CoreComponent
import com.hendri.mytourismapp.core.di.DaggerCoreComponent
import com.hendri.mytourismapp.di.AppComponent
import com.hendri.mytourismapp.di.DaggerAppComponent

open class MyApplication : Application() {
    private val coreComponent: CoreComponent by lazy {
        DaggerCoreComponent.factory().create(applicationContext)
    }

    val appComponent: AppComponent by lazy {
        DaggerAppComponent.factory().create(coreComponent)
    }
}