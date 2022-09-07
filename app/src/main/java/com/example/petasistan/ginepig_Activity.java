package com.example.petasistan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class ginepig_Activity extends AppCompatActivity {


    WebView webilanView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ginepig);

        baglailan();
        yukleilan();
        webilanView.setWebViewClient(new WebViewClient());


    }




    public void baglailan(){

        webilanView = findViewById(R.id.ilanweb);

    }

    public void yukleilan(){

        webilanView.loadUrl("https://tr.wikipedia.org/wiki/Ginepig");
        webilanView.getSettings().setJavaScriptEnabled(true);

    }



}