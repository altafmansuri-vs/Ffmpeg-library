package com.altaf.mansuri;

import android.app.Application;

public class MyApp extends Application {

    static {
        try {
            // Load the main native library (the rest will load automatically if linked)
            System.loadLibrary("mobileffmpeg");
        } catch (UnsatisfiedLinkError e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onCreate() {
        super.onCreate();
        // Initialize anything else here
    }
}
