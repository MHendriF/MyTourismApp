package com.mhendrif.mytourismapp.di

import com.mhendrif.mytourismapp.core.di.CoreComponent
import com.mhendrif.mytourismapp.detail.DetailTourismActivity
import com.mhendrif.mytourismapp.favorite.FavoriteFragment
import com.mhendrif.mytourismapp.home.HomeFragment
import dagger.Component

@AppScope
@Component(
    dependencies = [CoreComponent::class],
    modules = [AppModule::class, ViewModelModule::class]
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