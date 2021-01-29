package com.getlocationbackground

import android.Manifest
import android.annotation.TargetApi
import android.app.Activity
import android.content.*
import android.content.pm.PackageManager
import android.location.Location
import android.location.LocationManager
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.IBinder
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AlertDialog
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.observe
import com.getlocationbackground.data.model.LocationDetails
import com.getlocationbackground.service.LocationService
import com.getlocationbackground.util.Util
import com.getlocationbackground.viewmodel.LocationViewmodel
import com.google.android.gms.location.FusedLocationProviderClient
import com.google.android.gms.location.LocationListener
import com.google.android.gms.location.LocationServices

import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions
import java.util.ArrayList

class MapsActivity : AppCompatActivity(), OnMapReadyCallback {

    private var lists: ArrayList<LocationDetails>? = arrayListOf()
    private lateinit var mService: LocationService
    private var mBound: Boolean = false
    var fusedLocationProviderClient: FusedLocationProviderClient? =null
    private val PERMISSIONS_REQUEST_ACCESS_FINE_LOCATION: Int=1
    private var locationPermissionGranted: Boolean =false

  lateinit  var mLocationService: LocationService
    lateinit var mServiceIntent: Intent
    lateinit var mActivity: Activity
    private var defaultLocation: LatLng? = null
    private var lastKnownLocation: Location? = null

    private val TAGSS: String? ="TAGSS"

    var connection:ServiceConnection? =null

    companion object{
        lateinit var locationViewmodel: LocationViewmodel
        private lateinit var mMap: GoogleMap
        private val DEFAULT_ZOOM: Int = 10


        fun insertLocation(locationDetails: LocationDetails){
            locationViewmodel.insertLocation(locationDetails)
            mMap.moveCamera(
                CameraUpdateFactory.newLatLngZoom(
                    LatLng(
                        locationDetails.latitude,
                        locationDetails.longitude
                    ), DEFAULT_ZOOM.toFloat()
                )
            )
        }

    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_maps)

          connection = object : ServiceConnection {

            override fun onServiceConnected(className: ComponentName, service: IBinder) {
                // We've bound to LocalService, cast the IBinder and get LocalService instance
                val binder = service as LocationService.LocalBinder
                mService = binder.getService()
                locationViewmodel.insertLocation(LocationDetails(mService.longitude,mService.latitude))
                mBound = true
            }

            override fun onServiceDisconnected(arg0: ComponentName) {
                mBound = false
            }
        }

        fusedLocationProviderClient= LocationServices.getFusedLocationProviderClient(this)
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        val mapFragment = supportFragmentManager
            .findFragmentById(R.id.map) as SupportMapFragment
        mapFragment.getMapAsync(this)
        mActivity = this@MapsActivity
        locationViewmodel= ViewModelProvider(this)[LocationViewmodel::class.java]
        locationViewmodel.initializeViewModel(this.application)

        if (!Util.isLocationEnabledOrNot(mActivity)) {
            Util.showAlertLocation(
                mActivity,
                getString(R.string.gps_enable),
                getString(R.string.please_turn_on_gps),
                getString(
                    R.string.ok
                )
            )
        }

        locationViewmodel.getLocations().observe(this, Observer {
            lists!!.clear()
            lists!!.addAll(it)
        })

        requestPermissionsSafely(
            arrayOf<String>(Manifest.permission.ACCESS_FINE_LOCATION), 200
        )

        mLocationService = LocationService()
        mServiceIntent = Intent(this, mLocationService.javaClass).also { intent ->
            bindService(intent, connection!!, Context.BIND_AUTO_CREATE)
        }
        if (!Util.isMyServiceRunning(mLocationService.javaClass, mActivity)) {
            startService(mServiceIntent)
            Toast.makeText(
                mActivity,
                getString(R.string.service_start_successfully),
                Toast.LENGTH_SHORT
            ).show()
        } else {
            Toast.makeText(
                mActivity,
                getString(R.string.service_already_running),
                Toast.LENGTH_SHORT
            ).show()
        }
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
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onMapReady(googleMap: GoogleMap) {
        mMap = googleMap

        updateLocationUI()
        getDeviceLocation()
        // Add a marker in Sydney and move the camera
//        val sydney = LatLng(-34.0, 151.0)
//        mMap.addMarker(MarkerOptions().position(sydney).title("Marker in Sydney"))
//        mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney))
    }

    override fun onStop() {
        super.onStop()
        unbindService(connection!!)
        mBound = false
    }

    @TargetApi(Build.VERSION_CODES.M)
    fun requestPermissionsSafely(
        permissions: Array<String>,
        requestCode: Int
    ) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            requestPermissions(permissions!!, requestCode)
        }
    }

    override fun onDestroy() {
        if (::mServiceIntent.isInitialized) {
            stopService(mServiceIntent)
        }
        super.onDestroy()
    }


    @RequiresApi(Build.VERSION_CODES.O)
    private fun getLocationPermission() {
        /*
         * Request location permission, so that we can get the location of the
         * device. The result of the permission request is handled by a callback,
         * onRequestPermissionsResult.
         */
        if (ContextCompat.checkSelfPermission(
                this.applicationContext,
                Manifest.permission.ACCESS_FINE_LOCATION
            )
            == PackageManager.PERMISSION_GRANTED) {
            locationPermissionGranted = true
            updateLocationUI()
        } else {
            ActivityCompat.requestPermissions(
                this, arrayOf(Manifest.permission.ACCESS_FINE_LOCATION),
                PERMISSIONS_REQUEST_ACCESS_FINE_LOCATION
            )
        }
    }

    @RequiresApi(Build.VERSION_CODES.O)
    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<String>,
        grantResults: IntArray
    ) {
        locationPermissionGranted = false
        when (requestCode) {
            PERMISSIONS_REQUEST_ACCESS_FINE_LOCATION -> {

                // If request is cancelled, the result arrays are empty.
                if (grantResults.isNotEmpty() &&
                    grantResults[0] == PackageManager.PERMISSION_GRANTED
                ) {
                    locationPermissionGranted = true

                }
            }
        }
        updateLocationUI()
    }

    @RequiresApi(Build.VERSION_CODES.O)
    private fun updateLocationUI() {
        if (mMap == null) {
            return
        }
        try {
            if (locationPermissionGranted) {
                mMap.isMyLocationEnabled = true
                mMap.uiSettings?.isMyLocationButtonEnabled = true
            } else {
                mMap.isMyLocationEnabled = false
                mMap.uiSettings?.isMyLocationButtonEnabled = false
                lastKnownLocation = null
                getLocationPermission()
            }
        } catch (e: SecurityException) {
            Log.e("Exception: %s", e.message, e)
        }
        var lm: LocationManager = (getSystemService(LOCATION_SERVICE) as LocationManager)
        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            // TODO: Consider calling
            //    ActivityCompat#requestPermissions
            // here to request the missing permissions, and then overriding
            //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
            //                                          int[] grantResults)
            // to handle the case where the user grants the permission. See the documentation
            // for ActivityCompat#requestPermissions for more details.
            return
        }
//        lm.requestLocationUpdates("",2,1F,this)
//        callService()
    }

    private fun getDeviceLocation() {
        /*
         * Get the best and most recent location of the device, which may be null in rare
         * cases when a location is not available.
         */
        try {
            if (locationPermissionGranted) {
                val locationResult = fusedLocationProviderClient!!.lastLocation
                locationResult.addOnCompleteListener(this) { task ->
                    if (task.isSuccessful) {
                        // Set the map's camera position to the current location of the device.
                        lastKnownLocation = task.result
                        if (lastKnownLocation != null) {
                            mMap.moveCamera(
                                CameraUpdateFactory.newLatLngZoom(
                                    LatLng(
                                        lastKnownLocation!!.latitude,
                                        lastKnownLocation!!.longitude
                                    ), DEFAULT_ZOOM.toFloat()
                                )
                            )
                        }
                    } else {
                        Log.d(TAGSS, "Current location is null. Using defaults.")
                        Log.e(TAGSS, "Exception: %s", task.exception)
                        mMap.moveCamera(
                            CameraUpdateFactory
                                .newLatLngZoom(defaultLocation, DEFAULT_ZOOM.toFloat())
                        )
                        mMap.uiSettings?.isMyLocationButtonEnabled = false
                    }
                }
            }
        } catch (e: SecurityException) {
            Log.e("Exception: %s", e.message, e)
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.current_place_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    @RequiresApi(Build.VERSION_CODES.O)
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.itemPlaces -> {
                showCurrentPlace()
            }
        }
        return super.onOptionsItemSelected(item)
    }

    private fun showCurrentPlace() {
        val locationList = if (lists!!.size > 10) lists!!.subList(0,10) else lists
val list= if (lists!!.size > 10) lists!!.map { locationDetails ->
    "${locationDetails.latitude }  ${locationDetails.longitude }  "
}.subList(0, 9).toTypedArray() else lists!!.map { locationDetails ->
    "${locationDetails.latitude }  ${locationDetails.longitude }  "
}.toTypedArray()
var dialog= AlertDialog.Builder(this).setSingleChoiceItems(list, 1, { dialog, pos ->

    mMap.moveCamera(
        CameraUpdateFactory.newLatLngZoom(
            LatLng(
                locationList?.get(pos)!!.longitude,
                locationList?.get(pos)!!.latitude
            ), DEFAULT_ZOOM.toFloat()
        )
    )

    dialog.dismiss()
})

  dialog.show()
    }

}