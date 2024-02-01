package com.tatara.movieapp.data.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.tatara.movieapp.data.model.Movie

@Database(entities = [Movie::class], version = 1, exportSchema = false)
abstract class TMDBDatabase : RoomDatabase() {

    abstract fun movieDao(): MovieDao
}