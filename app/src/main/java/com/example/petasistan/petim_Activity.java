package com.example.petasistan;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import org.jetbrains.annotations.NotNull;

public class petim_Activity extends AppCompatActivity {

    private FirebaseUser user;
    private DatabaseReference referance;
    private String userID;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_petim);



        user = FirebaseAuth.getInstance().getCurrentUser();
        referance = FirebaseDatabase.getInstance().getReference("Users");
        userID = user.getUid();

        final TextView petmailtext = (TextView) findViewById(R.id.petemail);
        final TextView petadtext = (TextView) findViewById(R.id.petkayitad);
        final TextView petturtext = (TextView) findViewById(R.id.petkayittur);
        final TextView petcinstext = (TextView) findViewById(R.id.petkayitcins);
        final TextView pettarihtext = (TextView) findViewById(R.id.petkayittarih);
        final TextView petyastext = (TextView) findViewById(R.id.petkayityas);

        referance.child(userID).addListenerForSingleValueEvent(new ValueEventListener() {

            @Override
            public void onDataChange(@NonNull @NotNull DataSnapshot snapshot) {
                User userProfile = snapshot.getValue(User.class);
                if(userProfile != null){
                    String eMail=userProfile.pet_email;
                    String ad=userProfile.petkayit_ad;
                    String tur=userProfile.tur;
                    String cins=userProfile.cins;
                    String tarih=userProfile.tarih;
                    String yas=userProfile.yas;


                    petadtext.setText("Hoş geldin, " + petadtext + "!");
                    petmailtext.setText(eMail);
                    petturtext.setText(tur);
                    petcinstext.setText(cins);
                    pettarihtext.setText(tarih);
                    petyastext.setText(yas);

                }
            }

            @Override
            public void onCancelled(@NonNull @NotNull DatabaseError error) {
                Toast.makeText(petim_Activity.this,"Bir şeyler Yanlış Gitti",Toast.LENGTH_SHORT).show();

            }
        });


    }
}