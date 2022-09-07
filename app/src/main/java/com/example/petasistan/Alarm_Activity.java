package com.example.petasistan;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlarmManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.TimePicker;

import java.util.Calendar;

public class Alarm_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alarm);

        AlarmManager alarmManager=(AlarmManager) getSystemService(ALARM_SERVICE);
        TimePicker timePicker= findViewById(R.id.timePicker);
        Calendar calendar= Calendar.getInstance();
        Button kur = findViewById(R.id.kur);
        Button kapat = findViewById(R.id.kapat);

        TextView bilgitext = findViewById(R.id.bilgitexti);

        kur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                calendar.set(Calendar.HOUR_OF_DAY, timePicker.getHour());
                calendar.set(Calendar.MINUTE, timePicker.getMinute());


                int hour = timePicker.getHour();
                int minute = timePicker.getMinute();

                String hourst = String.valueOf(hour);
                String minutest = String.valueOf(minute);

                bilgitext.setText(hourst + ":" + minutest);



            }
        });

        kapat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });







    }
}