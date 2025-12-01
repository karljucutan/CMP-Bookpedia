package com.plcoding.bookpedia.book.data.database

import androidx.room.ConstructedBy
import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters

@Database(
    entities = [BookEntity::class],
    version = 1
)
@ConstructedBy(BookDatabaseConstructor::class)
@TypeConverters(StringListTypeConverter::class)
abstract class FavoriteBookDatabase : RoomDatabase() {
    companion object {
        const val DB_NAME = "book.db"
    }

    abstract val favoriteBookDao: FavoriteBookDao
}