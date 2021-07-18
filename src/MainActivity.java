package com.example.weatherappone;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.graphics.Color;
import android.view.View;
import gr.net.maroulis.library.EasySplashScreen;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EasySplashScreen config = new EasySplashScreen(MainActivity.this)
                .withFullScreen()
                .withTargetActivity(Home.class)
                .withSplashTimeOut(3000)
                .withBackgroundColor(Color.parseColor("#FFFFFF"))
                .withLogo(R.drawable.launcher_logo);

        View easySplashScreen = config.create();
        setContentView(easySplashScreen);
    }
}
