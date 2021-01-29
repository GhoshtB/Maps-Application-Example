package com.getlocationbackground;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\b\u0018\u0000 M2\u00020\u00012\u00020\u0002:\u0001MB\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u00101\u001a\u000202H\u0002J\b\u00103\u001a\u000202H\u0003J\u0012\u00104\u001a\u0002022\b\u00105\u001a\u0004\u0018\u000106H\u0014J\u0012\u00107\u001a\u00020\u001c2\b\u00108\u001a\u0004\u0018\u000109H\u0016J\b\u0010:\u001a\u000202H\u0014J\u0010\u0010;\u001a\u0002022\u0006\u0010<\u001a\u00020=H\u0017J\u0010\u0010>\u001a\u00020\u001c2\u0006\u0010?\u001a\u00020@H\u0017J+\u0010A\u001a\u0002022\u0006\u0010B\u001a\u00020\u00052\f\u0010C\u001a\b\u0012\u0004\u0012\u00020\u00070D2\u0006\u0010E\u001a\u00020FH\u0017\u00a2\u0006\u0002\u0010GJ\b\u0010H\u001a\u000202H\u0014J#\u0010I\u001a\u0002022\f\u0010C\u001a\b\u0012\u0004\u0012\u00020\u00070D2\u0006\u0010B\u001a\u00020\u0005H\u0007\u00a2\u0006\u0002\u0010JJ\b\u0010K\u001a\u000202H\u0002J\b\u0010L\u001a\u000202H\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082D\u00a2\u0006\u0002\n\u0000R\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0019X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u001d\u001a\u00020\u001eX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u000e\u0010#\u001a\u00020\u001cX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010$\u001a\u00020%X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\'\"\u0004\b(\u0010)R\u000e\u0010*\u001a\u00020%X\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010+\u001a\u00020,X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100\u00a8\u0006N"}, d2 = {"Lcom/getlocationbackground/MapsActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lcom/google/android/gms/maps/OnMapReadyCallback;", "()V", "PERMISSIONS_REQUEST_ACCESS_FINE_LOCATION", "", "TAGSS", "", "connection", "Landroid/content/ServiceConnection;", "getConnection", "()Landroid/content/ServiceConnection;", "setConnection", "(Landroid/content/ServiceConnection;)V", "defaultLocation", "Lcom/google/android/gms/maps/model/LatLng;", "fusedLocationProviderClient", "Lcom/google/android/gms/location/FusedLocationProviderClient;", "getFusedLocationProviderClient", "()Lcom/google/android/gms/location/FusedLocationProviderClient;", "setFusedLocationProviderClient", "(Lcom/google/android/gms/location/FusedLocationProviderClient;)V", "lastKnownLocation", "Landroid/location/Location;", "lists", "Ljava/util/ArrayList;", "Lcom/getlocationbackground/data/model/LocationDetails;", "locationPermissionGranted", "", "mActivity", "Landroid/app/Activity;", "getMActivity", "()Landroid/app/Activity;", "setMActivity", "(Landroid/app/Activity;)V", "mBound", "mLocationService", "Lcom/getlocationbackground/service/LocationService;", "getMLocationService", "()Lcom/getlocationbackground/service/LocationService;", "setMLocationService", "(Lcom/getlocationbackground/service/LocationService;)V", "mService", "mServiceIntent", "Landroid/content/Intent;", "getMServiceIntent", "()Landroid/content/Intent;", "setMServiceIntent", "(Landroid/content/Intent;)V", "getDeviceLocation", "", "getLocationPermission", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "menu", "Landroid/view/Menu;", "onDestroy", "onMapReady", "googleMap", "Lcom/google/android/gms/maps/GoogleMap;", "onOptionsItemSelected", "item", "Landroid/view/MenuItem;", "onRequestPermissionsResult", "requestCode", "permissions", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "onStop", "requestPermissionsSafely", "([Ljava/lang/String;I)V", "showCurrentPlace", "updateLocationUI", "Companion", "app_debug"})
public final class MapsActivity extends androidx.appcompat.app.AppCompatActivity implements com.google.android.gms.maps.OnMapReadyCallback {
    private java.util.ArrayList<com.getlocationbackground.data.model.LocationDetails> lists;
    private com.getlocationbackground.service.LocationService mService;
    private boolean mBound;
    @org.jetbrains.annotations.Nullable()
    private com.google.android.gms.location.FusedLocationProviderClient fusedLocationProviderClient;
    private final int PERMISSIONS_REQUEST_ACCESS_FINE_LOCATION = 1;
    private boolean locationPermissionGranted;
    @org.jetbrains.annotations.NotNull()
    public com.getlocationbackground.service.LocationService mLocationService;
    @org.jetbrains.annotations.NotNull()
    public android.content.Intent mServiceIntent;
    @org.jetbrains.annotations.NotNull()
    public android.app.Activity mActivity;
    private com.google.android.gms.maps.model.LatLng defaultLocation;
    private android.location.Location lastKnownLocation;
    private final java.lang.String TAGSS = "TAGSS";
    @org.jetbrains.annotations.Nullable()
    private android.content.ServiceConnection connection;
    @org.jetbrains.annotations.NotNull()
    public static com.getlocationbackground.viewmodel.LocationViewmodel locationViewmodel;
    private static com.google.android.gms.maps.GoogleMap mMap;
    private static final int DEFAULT_ZOOM = 10;
    public static final com.getlocationbackground.MapsActivity.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.Nullable()
    public final com.google.android.gms.location.FusedLocationProviderClient getFusedLocationProviderClient() {
        return null;
    }
    
    public final void setFusedLocationProviderClient(@org.jetbrains.annotations.Nullable()
    com.google.android.gms.location.FusedLocationProviderClient p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.getlocationbackground.service.LocationService getMLocationService() {
        return null;
    }
    
    public final void setMLocationService(@org.jetbrains.annotations.NotNull()
    com.getlocationbackground.service.LocationService p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Intent getMServiceIntent() {
        return null;
    }
    
    public final void setMServiceIntent(@org.jetbrains.annotations.NotNull()
    android.content.Intent p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.app.Activity getMActivity() {
        return null;
    }
    
    public final void setMActivity(@org.jetbrains.annotations.NotNull()
    android.app.Activity p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.content.ServiceConnection getConnection() {
        return null;
    }
    
    public final void setConnection(@org.jetbrains.annotations.Nullable()
    android.content.ServiceConnection p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.O)
    @java.lang.Override()
    public void onMapReady(@org.jetbrains.annotations.NotNull()
    com.google.android.gms.maps.GoogleMap googleMap) {
    }
    
    @java.lang.Override()
    protected void onStop() {
    }
    
    @android.annotation.TargetApi(value = android.os.Build.VERSION_CODES.M)
    public final void requestPermissionsSafely(@org.jetbrains.annotations.NotNull()
    java.lang.String[] permissions, int requestCode) {
    }
    
    @java.lang.Override()
    protected void onDestroy() {
    }
    
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.O)
    private final void getLocationPermission() {
    }
    
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.O)
    @java.lang.Override()
    public void onRequestPermissionsResult(int requestCode, @org.jetbrains.annotations.NotNull()
    java.lang.String[] permissions, @org.jetbrains.annotations.NotNull()
    int[] grantResults) {
    }
    
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.O)
    private final void updateLocationUI() {
    }
    
    private final void getDeviceLocation() {
    }
    
    @java.lang.Override()
    public boolean onCreateOptionsMenu(@org.jetbrains.annotations.Nullable()
    android.view.Menu menu) {
        return false;
    }
    
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.O)
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    private final void showCurrentPlace() {
    }
    
    public MapsActivity() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/getlocationbackground/MapsActivity$Companion;", "", "()V", "DEFAULT_ZOOM", "", "locationViewmodel", "Lcom/getlocationbackground/viewmodel/LocationViewmodel;", "getLocationViewmodel", "()Lcom/getlocationbackground/viewmodel/LocationViewmodel;", "setLocationViewmodel", "(Lcom/getlocationbackground/viewmodel/LocationViewmodel;)V", "mMap", "Lcom/google/android/gms/maps/GoogleMap;", "insertLocation", "", "locationDetails", "Lcom/getlocationbackground/data/model/LocationDetails;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.getlocationbackground.viewmodel.LocationViewmodel getLocationViewmodel() {
            return null;
        }
        
        public final void setLocationViewmodel(@org.jetbrains.annotations.NotNull()
        com.getlocationbackground.viewmodel.LocationViewmodel p0) {
        }
        
        public final void insertLocation(@org.jetbrains.annotations.NotNull()
        com.getlocationbackground.data.model.LocationDetails locationDetails) {
        }
        
        private Companion() {
            super();
        }
    }
}