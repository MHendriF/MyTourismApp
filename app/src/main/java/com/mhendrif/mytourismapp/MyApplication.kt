package com.mhendrif.mytourismapp

import android.app.Application
import com.mhendrif.mytourismapp.core.di.CoreComponent
import com.mhendrif.mytourismapp.core.di.DaggerCoreComponent
import com.mhendrif.mytourismapp.di.AppComponent
import com.mhendrif.mytourismapp.di.DaggerAppComponent

open class MyApplication : Application() {
    private val coreComponent: CoreComponent by lazy {
        DaggerCoreComponent.factory().create(applicationContext)
    }

    val appComponent: AppComponent by lazy {
        DaggerAppComponent.factory().create(coreComponent)
    }
}