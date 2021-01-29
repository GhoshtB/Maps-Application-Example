package com.getlocationbackground.data.db

import android.app.Application
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.getlocationbackground.data.model.LocationDetails

@Database(entities = arrayOf(LocationDetails::class),version = 1,exportSchema = false)
abstract class LocationDatabase: RoomDatabase() {

    abstract fun locationDao():LocationDao
    companion object{
        lateinit  var INSTANCE:LocationDatabase

        fun getInstance(application: Application):LocationDatabase{
            INSTANCE= Room.databaseBuilder(application.applicationContext,LocationDatabase::class.java,"location.db").build()
            return INSTANCE
        }

    }


}