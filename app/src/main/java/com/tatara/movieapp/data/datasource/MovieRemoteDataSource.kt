package com.tatara.movieapp.data.datasource

import com.tatara.movieapp.data.model.MovieList
import retrofit2.Response

interface MovieRemoteDataSource {
    suspend fun getMovies(): Response<MovieList>
}