package com.example.petasistan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class tavsan_cins_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tavsan_cins);


        findViewById(R.id.aslanbas_card).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(tavsan_cins_Activity.this, aslanbas_Activity.class);
                startActivity(intent);
            }
        });

        findViewById(R.id.chinchilla_card).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(tavsan_cins_Activity.this, chinchilla_Activity.class);
                startActivity(intent);
            }
        });

        findViewById(R.id.ginepig_card).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(tavsan_cins_Activity.this, ginepig_Activity.class);
                startActivity(intent);
            }
        });

        findViewById(R.id.hollandacucecard).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(tavsan_cins_Activity.this, hollandacuce_Activity.class);
                startActivity(intent);
            }
        });



        findViewById(R.id.minilop_card).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(tavsan_cins_Activity.this, minilop_Activity.class);
                startActivity(intent);
            }
        });

        findViewById(R.id.rex_card).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(tavsan_cins_Activity.this, rex_Activity.class);
                startActivity(intent);
            }
        });




    }
}