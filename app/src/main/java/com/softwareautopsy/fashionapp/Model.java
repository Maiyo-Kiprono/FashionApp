package com.softwareautopsy.fashionapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

public class Model extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.model_screen);

    // create Function for timer to move to next activity
        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
              startActivity(new Intent(getApplicationContext(), GetStarted.class));
            }
}, 5000);
    }
}
