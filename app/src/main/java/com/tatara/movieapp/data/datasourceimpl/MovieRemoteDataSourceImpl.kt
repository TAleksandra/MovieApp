package com.tatara.movieapp.data.datasourceimpl

import com.tatara.movieapp.data.api.TMDBService
import com.tatara.movieapp.data.datasource.MovieRemoteDataSource
import com.tatara.movieapp.data.model.MovieList
import retrofit2.Response

class MovieRemoteDataSourceImpl(
    private val tmdbService: TMDBService,
    private val apiKey: String
) : MovieRemoteDataSource {
    override suspend fun getMovies(): Response<MovieList> =
        tmdbService.getPopularMovies(apiKey)
}