package com.example.petasistan;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class Clicker_Activity extends AppCompatActivity {
MediaPlayer ply;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clicker);
    }

    public void clickdog (View view){
        ply=MediaPlayer.create(Clicker_Activity.this,R.raw.click1);
        ply.start();
    }

    public void clickcat (View view){
        ply=MediaPlayer.create(Clicker_Activity.this,R.raw.click2);
        ply.start();
    }
}