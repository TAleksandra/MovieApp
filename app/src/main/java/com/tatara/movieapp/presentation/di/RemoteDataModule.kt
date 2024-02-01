package com.tatara.movieapp.presentation.di

import com.tatara.movieapp.data.api.TMDBService
import com.tatara.movieapp.data.datasource.MovieRemoteDataSource
import com.tatara.movieapp.data.datasourceimpl.MovieRemoteDataSourceImpl
import dagger.MapKey
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class RemoteDataModule(private val apiKey: String) {

    @Singleton
    @Provides
    fun provideMovieRemoteDataSource(tmdbService: TMDBService): MovieRemoteDataSource {
        return MovieRemoteDataSourceImpl(
            tmdbService,
            apiKey
        )
    }
}