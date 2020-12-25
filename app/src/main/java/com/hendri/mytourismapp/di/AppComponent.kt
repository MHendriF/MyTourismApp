package com.hendri.mytourismapp.di

import android.content.Context
import com.hendri.mytourismapp.core.di.CoreComponent
import com.hendri.mytourismapp.detail.DetailTourismActivity
import com.hendri.mytourismapp.favorite.FavoriteFragment
import com.hendri.mytourismapp.home.HomeFragment
import dagger.BindsInstance
import dagger.Component

@AppScope
@Component(
    dependencies = [CoreComponent::class],
    modules = [AppModule::class]
)

interface AppComponent {
    @Component.Factory
    interface Factory {
        fun create(coreComponent: CoreComponent): AppComponent
    }

    fun inject(fragment: HomeFragment)
    fun inject(fragment: FavoriteFragment)
    fun inject(activity: DetailTourismActivity)
}