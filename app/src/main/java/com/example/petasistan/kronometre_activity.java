package com.example.petasistan;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class kronometre_activity extends AppCompatActivity {


        TextView textView;
        int sayac;
        Runnable runnable;
        Handler handler;
        Button baslaBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kronometre);


        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        textView = findViewById(R.id.textkro);
        baslaBtn=findViewById(R.id.krobasla);
        sayac=0;
    }

    public void Basla() {

        baslaBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                handler = new Handler();

                runnable = new Runnable() {
                    @Override
                    public void run() {
                        sayac++;
                        textView.setText(Integer.toString(sayac));
                        handler.postDelayed(runnable, 1000);
                    }
                };
                handler.post(runnable);
            }
        });
    }
    public void Durdur(View view){
        Toast.makeText(this, "Stopped", Toast.LENGTH_LONG).show();
        baslaBtn.setEnabled(true);
        handler.removeCallbacks(runnable);
        sayac = 0;
        textView.setText("Time: "+sayac);
    }
    }