package com.tatara.movieapp.presentation

import androidx.lifecycle.liveData
import androidx.lifecycle.ViewModel
import com.tatara.movieapp.domain.usecases.GetMoviesUseCase
import com.tatara.movieapp.domain.usecases.UpdateMoviesUseCase

class MyViewModel(
    private val getMoviesUseCase: GetMoviesUseCase,
    private val updateMoviesUseCase: UpdateMoviesUseCase
) : ViewModel() {
    fun getMovies() = liveData {
        val movieList = getMoviesUseCase.execute()
        emit(movieList)
    }

    fun updateMovies() = liveData {
        val movieList = updateMoviesUseCase.execute()
        emit(movieList)
    }
}