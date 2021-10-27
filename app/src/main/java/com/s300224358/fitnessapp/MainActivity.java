package com.s300224358.fitnessapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //to add the title and logo
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setLogo(R.mipmap.ic_launcher_fitness);
        getSupportActionBar().setDisplayUseLogoEnabled(true);


        setContentView(R.layout.activity_main);

        //initializing nav bar
        bottomNavigation = findViewById(R.id.bottom_navigation);

    }
}