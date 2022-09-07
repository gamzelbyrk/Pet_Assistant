package com.example.petasistan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

public class menu_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        getWindow().addFlags(WindowManager.LayoutParams.FLAG_SHOW_WALLPAPER);


        findViewById(R.id.bilgiler_card).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(menu_Activity.this, bilgiler_Activity.class);
                startActivity(intent);
            }
        });

        findViewById(R.id.veteriner_card).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(menu_Activity.this, veteriner_Activity.class);
                startActivity(intent);
            }
        });


        findViewById(R.id.pet_kayit_card).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(menu_Activity.this, petkayit_Activity.class);
                startActivity(intent);
            }
        });


        findViewById(R.id.ilanlar_card).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(menu_Activity.this, ilan_Activity.class);
                startActivity(intent);
            }
        });

        findViewById(R.id.alarm_card).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(menu_Activity.this, Alarm_Activity.class);
                startActivity(intent);
            }
        });


        findViewById(R.id.petim_card).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(menu_Activity.this, petim_Activity.class);
                startActivity(intent);
            }
        });

        findViewById(R.id.clicker_card).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(menu_Activity.this, Clicker_Activity.class);
                startActivity(intent);
            }
        });

        findViewById(R.id.kro_card).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(menu_Activity.this, chronometer_Activity.class);
                startActivity(intent);
            }
        });

    }
}