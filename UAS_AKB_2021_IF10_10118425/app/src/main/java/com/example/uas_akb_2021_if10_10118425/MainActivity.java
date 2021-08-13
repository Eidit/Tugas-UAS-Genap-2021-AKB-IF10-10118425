package com.example.uas_akb_2021_if10_10118425;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.example.uas_akb_2021_if10_10118425.Database.DatabaseHelper;
import com.example.uas_akb_2021_if10_10118425.View.ListTourPlaceActivity;
import com.google.android.material.bottomnavigation.BottomNavigationView;
/**
 *  NIM : 10118425
 *  Nama : Aditya Rizky Fauzi
 *  Kelas : IF-10
 *  Tanggal Pengerjaan : 10-08-2021 - 14-08-2021
 * */
public class MainActivity extends AppCompatActivity {
    BottomNavigationView bottomNavigationView;

    //  MenuItem menuItem;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
//        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#03AC0E")));

        DatabaseHelper dh = new DatabaseHelper(getBaseContext());
        Toast.makeText(getApplication(), dh.getDatabaseName() +" sudah ada", Toast.LENGTH_SHORT).show();

        bottomNavigationView = findViewById(R.id.navigation);
        BottomNavigationView.OnNavigationItemSelectedListener navListener = null ;
        bottomNavigationView.setOnNavigationItemSelectedListener(navListener);
        //I added this if statement to keep the selected fragment when rotating the device
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                    new ListTourPlaceActivity()).commit();
        }

    }