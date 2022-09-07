package com.example.petasistan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class bilgiler_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bilgiler);


        findViewById(R.id.kopekbutton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(bilgiler_Activity.this, kopek_cins_Activity.class);
                startActivity(intent);
            }
        });

        findViewById(R.id.kedibutton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(bilgiler_Activity.this, kedi_cins_Activity.class);
                startActivity(intent);
            }
        });

        findViewById(R.id.tavsanbutton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(bilgiler_Activity.this, tavsan_cins_Activity.class);
                startActivity(intent);
            }
        });




    }
}