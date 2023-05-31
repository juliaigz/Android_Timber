package com.example.individual8_9;

import android.app.Application;
import timber.log.Timber;

public class TimberClass1 extends Application {

    @Override
    public void onCreate(){
        super.onCreate();
        Timber.plant(new Timber.DebugTree());
    }


}
