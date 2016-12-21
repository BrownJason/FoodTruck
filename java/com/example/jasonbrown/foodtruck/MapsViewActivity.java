package com.example.jasonbrown.foodtruck;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsViewActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps_view);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
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
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        LatLng rosies = new LatLng(41.672631, -83.594343);
        mMap.addMarker(new MarkerOptions().position(rosies).title("Rosie's Rolling Chef"));
        float zoomLevel = 10;
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(rosies, zoomLevel));
        mMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);

        LatLng rusty= new LatLng(41.654044, -83.541563);
        mMap.addMarker(new MarkerOptions().position(rusty).title("Rusty's Road Trip"));

        LatLng displacedCher =  new LatLng(41.546268, -83.618445);
        mMap.addMarker(new MarkerOptions().position(displacedCher).title("The Displaced Chef"));

        LatLng jeanies = new LatLng(41.620989, -83.576903);
        mMap.addMarker(new MarkerOptions().position(jeanies).title("Jeanies Comfort Cuisine"));

        LatLng jeras = new LatLng(41.638711,-83.647038);
        mMap.addMarker(new MarkerOptions().position(jeras).title("Jera's Heavenly Sweet"));

        LatLng grumpy = new LatLng(41.714897, -83.704196);
        mMap.addMarker(new MarkerOptions().position(grumpy).title("Grumpy's On The Go"));
    }
}
