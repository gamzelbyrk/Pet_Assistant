package com.example.petasistan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class girisyap_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_girisyap);



        findViewById(R.id.heabimyoktext).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(girisyap_Activity.this, kayitol_Activity.class);
                startActivity(intent);
            }
        });


        findViewById(R.id.girismenubutton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(girisyap_Activity.this, menu_Activity.class);
                startActivity(intent);
            }
        });

    }
}