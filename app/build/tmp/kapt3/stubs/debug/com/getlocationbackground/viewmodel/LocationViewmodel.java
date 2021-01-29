package com.getlocationbackground.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u0010J\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016J\u000e\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0012R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006\u0019"}, d2 = {"Lcom/getlocationbackground/viewmodel/LocationViewmodel;", "Landroidx/lifecycle/ViewModel;", "()V", "dao", "Lcom/getlocationbackground/data/db/LocationDao;", "getDao", "()Lcom/getlocationbackground/data/db/LocationDao;", "setDao", "(Lcom/getlocationbackground/data/db/LocationDao;)V", "locationDatabase", "Lcom/getlocationbackground/data/db/LocationDatabase;", "getLocationDatabase", "()Lcom/getlocationbackground/data/db/LocationDatabase;", "setLocationDatabase", "(Lcom/getlocationbackground/data/db/LocationDatabase;)V", "getLocations", "Landroidx/lifecycle/LiveData;", "", "Lcom/getlocationbackground/data/model/LocationDetails;", "initializeViewModel", "", "application", "Landroid/app/Application;", "insertLocation", "locationDetails", "app_debug"})
public final class LocationViewmodel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    public com.getlocationbackground.data.db.LocationDatabase locationDatabase;
    @org.jetbrains.annotations.NotNull()
    public com.getlocationbackground.data.db.LocationDao dao;
    
    @org.jetbrains.annotations.NotNull()
    public final com.getlocationbackground.data.db.LocationDatabase getLocationDatabase() {
        return null;
    }
    
    public final void setLocationDatabase(@org.jetbrains.annotations.NotNull()
    com.getlocationbackground.data.db.LocationDatabase p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.getlocationbackground.data.db.LocationDao getDao() {
        return null;
    }
    
    public final void setDao(@org.jetbrains.annotations.NotNull()
    com.getlocationbackground.data.db.LocationDao p0) {
    }
    
    public final void initializeViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
    }
    
    public final void insertLocation(@org.jetbrains.annotations.NotNull()
    com.getlocationbackground.data.model.LocationDetails locationDetails) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.getlocationbackground.data.model.LocationDetails>> getLocations() {
        return null;
    }
    
    public LocationViewmodel() {
        super();
    }
}