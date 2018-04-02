package com.example.mac.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("msg","function Oncreate has been called");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("msg","function OnStart has been called");
    }

    @Override
    protected void onPostResume() {
        super.onPostResume();
        Log.i("msg","function onPostResume has been called");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("msg","function onStop has been called");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("msg","function onDestroy has been called");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("msg","function onPause has been called");

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("msg","function onResume has been called");
    }
}
