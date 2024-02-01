package com.tatara.movieapp

import android.app.Application
import com.tatara.movieapp.presentation.di.AppComponent
import com.tatara.movieapp.presentation.di.AppModule
import com.tatara.movieapp.presentation.di.DaggerAppComponent
import com.tatara.movieapp.presentation.di.Injector
import com.tatara.movieapp.presentation.di.MovieSubComponent
import com.tatara.movieapp.presentation.di.NetModule
import com.tatara.movieapp.presentation.di.RemoteDataModule

class App: Application(), Injector {
    private lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()

        appComponent = DaggerAppComponent.builder()
            .appModule(AppModule(applicationContext))
            .netModule(NetModule(BuildConfig.BASE_URL))
            .remoteDataModule(RemoteDataModule(BuildConfig.API_KEY))
            .build()
    }

    override fun createMovieSubComponent(): MovieSubComponent {
        return appComponent.movieSubComponent().create()
    }
}