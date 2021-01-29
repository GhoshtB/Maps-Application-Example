package com.getlocationbackground.service;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001:\u000234B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010&\u001a\u00020\'H\u0003J\u0014\u0010(\u001a\u0004\u0018\u00010\f2\b\u0010)\u001a\u0004\u0018\u00010*H\u0016J\b\u0010+\u001a\u00020\'H\u0016J\b\u0010,\u001a\u00020\'H\u0016J\"\u0010-\u001a\u00020\u000e2\b\u0010)\u001a\u0004\u0018\u00010*2\u0006\u0010.\u001a\u00020\u000e2\u0006\u0010/\u001a\u00020\u000eH\u0016J\b\u00100\u001a\u00020\'H\u0002J\u0006\u00101\u001a\u00020\'J\u0006\u00102\u001a\u00020\'R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u0014X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\u00020\u001aX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001a\u0010\u001f\u001a\u00020\u0014X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0016\"\u0004\b!\u0010\u0018R\u0010\u0010\"\u001a\u0004\u0018\u00010#X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010$\u001a\u0004\u0018\u00010%X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u00065"}, d2 = {"Lcom/getlocationbackground/service/LocationService;", "Landroid/app/Service;", "()V", "TAG", "", "activity", "Lcom/getlocationbackground/MapsActivity;", "getActivity", "()Lcom/getlocationbackground/MapsActivity;", "setActivity", "(Lcom/getlocationbackground/MapsActivity;)V", "binder", "Landroid/os/IBinder;", "counter", "", "getCounter", "()I", "setCounter", "(I)V", "latitude", "", "getLatitude", "()D", "setLatitude", "(D)V", "locationViewmodel", "Lcom/getlocationbackground/viewmodel/LocationViewmodel;", "getLocationViewmodel", "()Lcom/getlocationbackground/viewmodel/LocationViewmodel;", "setLocationViewmodel", "(Lcom/getlocationbackground/viewmodel/LocationViewmodel;)V", "longitude", "getLongitude", "setLongitude", "timer", "Ljava/util/Timer;", "timerTask", "Ljava/util/TimerTask;", "createNotificationChanel", "", "onBind", "intent", "Landroid/content/Intent;", "onCreate", "onDestroy", "onStartCommand", "flags", "startId", "requestLocationUpdates", "startTimer", "stoptimertask", "LocalBinder", "LocationUpdateListener", "app_debug"})
public final class LocationService extends android.app.Service {
    private final android.os.IBinder binder = null;
    private int counter;
    private double latitude;
    private double longitude;
    private final java.lang.String TAG = "LocationService";
    @org.jetbrains.annotations.NotNull()
    public com.getlocationbackground.viewmodel.LocationViewmodel locationViewmodel;
    @org.jetbrains.annotations.NotNull()
    public com.getlocationbackground.MapsActivity activity;
    private java.util.Timer timer;
    private java.util.TimerTask timerTask;
    
    public final int getCounter() {
        return 0;
    }
    
    public final void setCounter(int p0) {
    }
    
    public final double getLatitude() {
        return 0.0;
    }
    
    public final void setLatitude(double p0) {
    }
    
    public final double getLongitude() {
        return 0.0;
    }
    
    public final void setLongitude(double p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.getlocationbackground.viewmodel.LocationViewmodel getLocationViewmodel() {
        return null;
    }
    
    public final void setLocationViewmodel(@org.jetbrains.annotations.NotNull()
    com.getlocationbackground.viewmodel.LocationViewmodel p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.getlocationbackground.MapsActivity getActivity() {
        return null;
    }
    
    public final void setActivity(@org.jetbrains.annotations.NotNull()
    com.getlocationbackground.MapsActivity p0) {
    }
    
    @java.lang.Override()
    public void onCreate() {
    }
    
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.O)
    private final void createNotificationChanel() {
    }
    
    @java.lang.Override()
    public int onStartCommand(@org.jetbrains.annotations.Nullable()
    android.content.Intent intent, int flags, int startId) {
        return 0;
    }
    
    @java.lang.Override()
    public void onDestroy() {
    }
    
    public final void startTimer() {
    }
    
    public final void stoptimertask() {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.os.IBinder onBind(@org.jetbrains.annotations.Nullable()
    android.content.Intent intent) {
        return null;
    }
    
    private final void requestLocationUpdates() {
    }
    
    public LocationService() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/getlocationbackground/service/LocationService$LocalBinder;", "Landroid/os/Binder;", "(Lcom/getlocationbackground/service/LocationService;)V", "getService", "Lcom/getlocationbackground/service/LocationService;", "app_debug"})
    public final class LocalBinder extends android.os.Binder {
        
        @org.jetbrains.annotations.NotNull()
        public final com.getlocationbackground.service.LocationService getService() {
            return null;
        }
        
        public LocalBinder() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/getlocationbackground/service/LocationService$LocationUpdateListener;", "", "updateLOcation", "", "location", "Landroid/location/Location;", "app_debug"})
    public static abstract interface LocationUpdateListener {
        
        public abstract void updateLOcation(@org.jetbrains.annotations.NotNull()
        android.location.Location location);
    }
}