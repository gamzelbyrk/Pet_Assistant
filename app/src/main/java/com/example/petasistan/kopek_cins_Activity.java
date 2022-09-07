package com.example.petasistan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class kopek_cins_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kopek_cins);


        findViewById(R.id.akita_card).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(kopek_cins_Activity.this, akita_Activity.class);
                startActivity(intent);
            }
        });

        findViewById(R.id.affen_card).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(kopek_cins_Activity.this, affen_Activity.class);
                startActivity(intent);
            }
        });

        findViewById(R.id.beagle_card).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(kopek_cins_Activity.this, beagle_Activity.class);
                startActivity(intent);
            }
        });

        findViewById(R.id.bulldog_card).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(kopek_cins_Activity.this, bulldog_Activity.class);
                startActivity(intent);
            }
        });



        findViewById(R.id.cocker_card).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(kopek_cins_Activity.this, cocker_Activity.class);
                startActivity(intent);
            }
        });

        findViewById(R.id.chowchow_card).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(kopek_cins_Activity.this, chow_Activity.class);
                startActivity(intent);
            }
        });




    }
}