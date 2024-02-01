package com.tatara.movieapp.presentation.di

interface Injector {
    fun createMovieSubComponent(): MovieSubComponent
}