package com.example.petasistan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class ilan_Activity extends AppCompatActivity {

    WebView webilanView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ilan);

        baglailan();
        yukleilan();
        webilanView.setWebViewClient(new WebViewClient());


    }




    public void baglailan(){

        webilanView = findViewById(R.id.ilanweb);

    }

    public void yukleilan(){

        webilanView.loadUrl("https://destek.wwf.org.tr/evlat-edinme.php");
        webilanView.getSettings().setJavaScriptEnabled(true);

    }



}