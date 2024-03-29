package com.tatara.movieapp.data.datasourceimpl

import com.tatara.movieapp.data.datasource.MovieCacheDataSource
import com.tatara.movieapp.data.model.Movie

class MovieCacheDataSourceImpl : MovieCacheDataSource {
    private var movieList = ArrayList<Movie>()

    override suspend fun getMoviesFromCache(): List<Movie> {
        return movieList
    }

    override suspend fun saveMoviesToCache(movies: List<Movie>) {
        movieList.clear()
        movieList = ArrayList(movies)
    }
}