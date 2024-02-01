package com.tatara.movieapp.presentation.di

import com.tatara.movieapp.data.MovieRepositoryImpl
import com.tatara.movieapp.data.datasource.MovieCacheDataSource
import com.tatara.movieapp.data.datasource.MovieLocalDataSource
import com.tatara.movieapp.data.datasource.MovieRemoteDataSource
import com.tatara.movieapp.domain.repository.MovieRepository
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class RepositoryModule {

    @Singleton
    @Provides
    fun provideMovieRepository(
        movieRemoteDataSource: MovieRemoteDataSource,
        movieLocalDataSource: MovieLocalDataSource,
        movieCacheDataSource: MovieCacheDataSource
    ): MovieRepository {
        return MovieRepositoryImpl(
            movieRemoteDataSource,
            movieLocalDataSource,
            movieCacheDataSource
        )
    }
}