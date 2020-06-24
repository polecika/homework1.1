package com.example.androidshvets;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;

import java.util.concurrent.TimeUnit;

public class SplashScreenActivity extends AppCompatActivity {

    private static final long DELAY_MILLIS = 1500;
    private Handler handler = new Handler();
    private Runnable callback = new Runnable() {

        @Override
        public void run() {
            Intent intent = new Intent(SplashScreenActivity.this, FirstActivity.class);
            startActivity(intent);
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        goToSecondScreen();
    }

    private void goToSecondScreen() {
        handler.postDelayed(callback, DELAY_MILLIS);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        handler.removeCallbacks(callback);
    }
}