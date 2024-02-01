package com.tatara.movieapp.domain.repository

import com.tatara.movieapp.data.model.Movie

interface MovieRepository {

    suspend fun getMovies(): List<Movie>?
    suspend fun updateMovies(): List<Movie>?
}