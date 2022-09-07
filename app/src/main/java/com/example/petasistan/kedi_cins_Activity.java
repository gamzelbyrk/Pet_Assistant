package com.example.petasistan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class kedi_cins_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kedi_cins);


        findViewById(R.id.british_card).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(kedi_cins_Activity.this, british_Activity.class);
                startActivity(intent);
            }
        });

        findViewById(R.id.norvec_card).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(kedi_cins_Activity.this, norvec_Activity.class);
                startActivity(intent);
            }
        });

        findViewById(R.id.sfenks_card).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(kedi_cins_Activity.this, sfenks_Activity.class);
                startActivity(intent);
            }
        });

        findViewById(R.id.cornish_card).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(kedi_cins_Activity.this, cornish_Activity.class);
                startActivity(intent);
            }
        });

        findViewById(R.id.himalayan_card).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(kedi_cins_Activity.this, himalayan_Activity.class);
                startActivity(intent);
            }
        });

        findViewById(R.id.ragdoll_card).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(kedi_cins_Activity.this, ragdoll_Activity.class);
                startActivity(intent);
            }
        });
    }
}