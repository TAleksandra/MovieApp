package com.tatara.movieapp.domain.usecases

import com.tatara.movieapp.data.model.Movie
import com.tatara.movieapp.domain.repository.MovieRepository

class UpdateMoviesUseCase(private val movieRepository: MovieRepository) {
    suspend fun execute(): List<Movie>? = movieRepository.updateMovies()
}