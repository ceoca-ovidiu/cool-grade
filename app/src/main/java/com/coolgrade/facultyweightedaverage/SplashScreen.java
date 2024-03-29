package com.coolgrade.facultyweightedaverage;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        int SPLASH_TIME = 1000;
        new Handler().postDelayed(() -> {
            Intent homeIntent = new Intent(SplashScreen.this, MainActivity.class);
            startActivity(homeIntent);
            finish();
        }, SPLASH_TIME);
    }
}