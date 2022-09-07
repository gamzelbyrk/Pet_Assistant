package com.example.petasistan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class chronometer_Activity extends AppCompatActivity {
    TextView textView;
    Button basla,durdur,sifirla;
    Handler handler;
    Runnable runnable;
    int sayac;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chronometer);



    }

    private void tanımla() {
        textView= (TextView) findViewById(R.id.text);
                sifirla = (Button) findViewById(R.id.sifirla);
                durdur= (Button) findViewById(R.id.durdur);
                basla= (Button) findViewById(R.id.basla);
                sayac=0;
                basla();


    }

    private void basla() {

        basla.setOnClickListener(new View.OnClickListener() {
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
}