package com.futureoath.logdebuglibrary;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.futureoath.logdebug.LogDebug;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        LogDebug.logMessage("yes");
    }
}