package com.tatara.movieapp.presentation.di

import com.tatara.movieapp.data.datasource.MovieLocalDataSource
import com.tatara.movieapp.data.datasourceimpl.MovieLocalDataSourceImpl
import com.tatara.movieapp.data.db.MovieDao
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class LocalDataModule {

    @Singleton
    @Provides
    fun provideMovieLocalDataSource(movieDao: MovieDao): MovieLocalDataSource {
        return MovieLocalDataSourceImpl(movieDao)
    }
}