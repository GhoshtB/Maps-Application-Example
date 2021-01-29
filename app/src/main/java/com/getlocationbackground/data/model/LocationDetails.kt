package com.getlocationbackground.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class LocationDetails(var latitude:Double,var longitude:Double) {
    @PrimaryKey(autoGenerate = true)
    var id:Int=0
}