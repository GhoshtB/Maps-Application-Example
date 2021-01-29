package com.getlocationbackground.viewmodel

import android.app.Application
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import androidx.lifecycle.viewModelScope
import com.getlocationbackground.data.db.LocationDao
import com.getlocationbackground.data.db.LocationDatabase
import com.getlocationbackground.data.model.LocationDetails
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import kotlinx.coroutines.launch

class LocationViewmodel:ViewModel() {

    lateinit var locationDatabase: LocationDatabase
    lateinit var dao: LocationDao

    fun initializeViewModel(application: Application){
        locationDatabase=LocationDatabase.getInstance(application)
        dao=locationDatabase.locationDao()
    }

    fun insertLocation(locationDetails: LocationDetails){
        viewModelScope.launch(context= Dispatchers.IO){ dao.insertLocation(locationDetails) }
    }

    fun getLocations(): LiveData<List<LocationDetails>> {
        return flow<List<LocationDetails>> {
            emit(dao.getLocations())
        }.flowOn(context = Dispatchers.IO).asLiveData()
    }
}