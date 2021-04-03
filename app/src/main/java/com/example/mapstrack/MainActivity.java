package com.example.mapstrack;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getActionBar().hide();
        MapFragment fragment = new MapFragment();
        FragmentTransaction transaction =getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.frame_layout, fragment,"");
        transaction.commit();
        //getSupportFragmentManager().beginTransaction()
          //      .replace(R.id.frame_layout,fragment)
            //    .commit();
    }
}