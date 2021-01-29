package com.getlocationbackground.data.db

import androidx.room.*
import com.getlocationbackground.data.model.LocationDetails

@Dao
interface LocationDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend  fun insertLocation(locationDetails: LocationDetails)

    @Query("SELECT * FROM locationdetails")
    suspend fun getLocations():List<LocationDetails>

    @Delete
    suspend fun deleteLocation(locationDetails: LocationDetails)
}