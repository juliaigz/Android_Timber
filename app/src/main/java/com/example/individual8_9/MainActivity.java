package com.example.individual8_9;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import timber.log.Timber;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Timber.d("Activity Iniciated");
    }

    @Override
    protected void onResume(){
        super.onResume();
        Timber.d("Activity resumed");
    }

    @Override
    protected void onPause(){
        super.onPause();
        Timber.d("Activity paused");
    }

    @Override
    protected void onStart(){
        super.onStart();
        Timber.d("Activity started");
    }

    @Override
    protected void onStop(){
        super.onStop();
        Timber.d("Activity stopped");
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Timber.d("Activity Destroyed");
    }

}