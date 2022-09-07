package com.example.petasistan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class veteriner_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_veteriner);


        findViewById(R.id.karadenizvetbutton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(veteriner_Activity.this, karadenizvet_konum_Activity.class);
                startActivity(intent);
            }
        });




        findViewById(R.id.ayvetbutton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(veteriner_Activity.this, ayvet_konum_Activity.class);
                startActivity(intent);
            }
        });


        findViewById(R.id.ereglivetbutton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(veteriner_Activity.this, ereglivet_konum_Activity.class);
                startActivity(intent);
            }
        });


    }
}