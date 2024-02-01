package com.tatara.movieapp.presentation.di

import com.tatara.movieapp.domain.usecases.GetMoviesUseCase
import com.tatara.movieapp.domain.usecases.UpdateMoviesUseCase
import com.tatara.movieapp.presentation.ViewModelFactory
import dagger.Module
import dagger.Provides

@Module
class MovieModule {

    @MovieScope
    @Provides
    fun provideMovieViewModelFactory(
        getMoviesUseCase: GetMoviesUseCase,
        updateMoviesUseCase: UpdateMoviesUseCase
    ): ViewModelFactory {
        return ViewModelFactory(
            getMoviesUseCase,
            updateMoviesUseCase
        )
    }
}