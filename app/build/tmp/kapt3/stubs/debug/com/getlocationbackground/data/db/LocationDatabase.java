package com.getlocationbackground.data.db;

import java.lang.System;

@androidx.room.Database(entities = {com.getlocationbackground.data.model.LocationDetails.class}, version = 1, exportSchema = false)
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&\u00a8\u0006\u0006"}, d2 = {"Lcom/getlocationbackground/data/db/LocationDatabase;", "Landroidx/room/RoomDatabase;", "()V", "locationDao", "Lcom/getlocationbackground/data/db/LocationDao;", "Companion", "app_debug"})
public abstract class LocationDatabase extends androidx.room.RoomDatabase {
    @org.jetbrains.annotations.NotNull()
    public static com.getlocationbackground.data.db.LocationDatabase INSTANCE;
    public static final com.getlocationbackground.data.db.LocationDatabase.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.getlocationbackground.data.db.LocationDao locationDao();
    
    public LocationDatabase() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000bR\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\f"}, d2 = {"Lcom/getlocationbackground/data/db/LocationDatabase$Companion;", "", "()V", "INSTANCE", "Lcom/getlocationbackground/data/db/LocationDatabase;", "getINSTANCE", "()Lcom/getlocationbackground/data/db/LocationDatabase;", "setINSTANCE", "(Lcom/getlocationbackground/data/db/LocationDatabase;)V", "getInstance", "application", "Landroid/app/Application;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.getlocationbackground.data.db.LocationDatabase getINSTANCE() {
            return null;
        }
        
        public final void setINSTANCE(@org.jetbrains.annotations.NotNull()
        com.getlocationbackground.data.db.LocationDatabase p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.getlocationbackground.data.db.LocationDatabase getInstance(@org.jetbrains.annotations.NotNull()
        android.app.Application application) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}