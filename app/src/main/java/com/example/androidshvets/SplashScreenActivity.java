package com.example.androidshvets;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import java.util.concurrent.TimeUnit;

public class SplashScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        goToSecondScreen();
    }

    protected void goToSecondScreen() {
        Intent intent = new Intent(SplashScreenActivity.this, FirstActivity.class);
        try {
            TimeUnit.SECONDS.sleep(1);
            startActivity(intent);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}