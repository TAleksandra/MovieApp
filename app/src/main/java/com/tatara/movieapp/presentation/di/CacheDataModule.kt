package com.tatara.movieapp.presentation.di

import com.tatara.movieapp.data.datasource.MovieCacheDataSource
import com.tatara.movieapp.data.datasourceimpl.MovieCacheDataSourceImpl
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class CacheDataModule {

    @Singleton
    @Provides
    fun provideMovieCacheDataSource(): MovieCacheDataSource {
        return MovieCacheDataSourceImpl()
    }
}