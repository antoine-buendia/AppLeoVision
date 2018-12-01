package com.example.frank.leovision;

import android.app.Application;
import android.os.SystemClock;

public class LeoVision extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        SystemClock.sleep(2000);
    }
}