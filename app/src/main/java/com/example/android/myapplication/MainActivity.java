package com.example.android.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();


        //bottomNavView
        BottomNavigationView buttonnavView = findViewById(R.id.bottom_navigation_view);
        buttonnavView.setOnNavigationItemSelectedListener(navListener);


        //Home Fragment as Main

        getSupportFragmentManager().beginTransaction().replace(R.id.frame_layout,new HomeFragment()).commit();
    }

    private BottomNavigationView.OnNavigationItemSelectedListener navListener = new
            BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                    Fragment SelectFragment = null;


                    switch (item.getItemId()){
                        case R.id.current:
                            SelectFragment = new HomeFragment();
                            break;

                        case R.id.week:
                            SelectFragment = new WeekFragment();
                            break;

                        case R.id.Settings:
                            SelectFragment = new SettingFragment();
                            break;

                    }

                    getSupportFragmentManager().beginTransaction().replace(R.id.frame_layout,SelectFragment).commit();
                    return true;
                }
            };
}