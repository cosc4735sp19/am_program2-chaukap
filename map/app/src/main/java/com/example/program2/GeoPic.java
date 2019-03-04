package com.example.program2;

import android.graphics.Bitmap;
import android.location.Location;

// my geotagged photo class
public class GeoPic {
    private Location myLocation;
    private Bitmap myBitmap;

    GeoPic(Bitmap bp, Location loc){
        myBitmap = bp;
        myLocation = loc;
    }

    public Location getLocation(){
        return myLocation;
    }

    public Bitmap getBitmap(){
        return myBitmap;
    }
}
