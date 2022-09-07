package com.example.petasistan;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;
import com.google.firebase.storage.UploadTask;

import org.jetbrains.annotations.NotNull;

import java.util.HashMap;

public class petkayit_Activity extends AppCompatActivity {

    FirebaseStorage storage = FirebaseStorage.getInstance();
    StorageReference referans=storage.getReference();
    Button bt;






    private EditText editEmail, editSifre, editPetad, editPettur, editPetcins, editPettarih, editPetyas;
    private String txtEmail, txtSifre,txtPetad, txtPettur, txtPetcins, txtPettarih, txtPetyas;
    private FirebaseAuth mAuth;
    private FirebaseUser mUser;
    private DatabaseReference mReference;
    private HashMap<String, Object> mData;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_petkayit);

        bt = (Button) findViewById(R.id.PetFotoKaydet);
        bt.setOnClickListener((v) -> {

            Intent i=new Intent(Intent.ACTION_PICK);
            i.setType("image/*");
            startActivityForResult(i,1);


        });

        editEmail=findViewById(R.id.pet_email);
        editSifre=findViewById(R.id.pet_sifre);
        editPetad = findViewById(R.id.petkayit_ad);
        editPettur = findViewById(R.id.petkayit_tur);
        editPetcins = findViewById(R.id.petkayit_cins);
        editPettarih = findViewById(R.id.petkayit_tarih);
        editPetyas = findViewById(R.id.petkayit_yas);

        mAuth = FirebaseAuth.getInstance();
        mReference = FirebaseDatabase.getInstance().getReference();



      /*  findViewById(R.id.hesapvar).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(petkayit_Activity.this,log_Activity.class);
                startActivity(intent);
            }
        });  kayitli pet varsa */


    }

    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode,resultCode,data);
        if(requestCode==1 && resultCode==RESULT_OK){


            Uri uri=data.getData();
            StorageReference ref=referans.child(uri.getLastPathSegment());
            ref.putFile(uri).addOnSuccessListener(new OnSuccessListener<UploadTask.TaskSnapshot>() {
                @Override
                public void onSuccess(UploadTask.TaskSnapshot taskSnapshot) {
                    Toast.makeText(petkayit_Activity.this,"Yükleme Tamamlandı!!", Toast.LENGTH_SHORT).show();

                }

            });
        }
    }

    public void PetKaydet(View view) {

        txtEmail = editEmail.getText().toString();
        txtSifre = editSifre.getText().toString();
        txtPetad = editPetad.getText().toString();
        txtPettur = editPettur.getText().toString();
        txtPetcins = editPetcins.getText().toString();
        txtPettarih = editPettarih.getText().toString();
        txtPetyas = editPetyas.getText().toString();

        if (!TextUtils.isEmpty(txtPetad) && !TextUtils.isEmpty(txtPettur) && !TextUtils.isEmpty(txtPetcins) && !TextUtils.isEmpty(txtPettarih) && !TextUtils.isEmpty(txtPetyas)) {

            mAuth.createUserWithEmailAndPassword(txtEmail,txtSifre)
                    .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull @NotNull Task<AuthResult> task) {
                            if(task.isSuccessful()){

                                mUser=mAuth.getCurrentUser();


                                mData= new HashMap<>();
                                mData.put("KullaniciUid", mUser.getUid());
                                mData.put("Kullanicimail:", txtEmail);
                                mData.put("KullaniciSifre:", txtSifre);
                                mData.put("PetAdi:", txtPetad);
                                mData.put("PetTur:", txtPettur);
                                mData.put("PetCins:", txtPetcins);
                                mData.put("PetTarih:", txtPettarih);
                                mData.put("PetYas:", txtPetyas);


                                mReference.child("Petler").child(mUser.getUid())
                                        .setValue(mData)
                                        .addOnCompleteListener(petkayit_Activity.this, new OnCompleteListener<Void>() {
                                            @Override
                                            public void onComplete(@NonNull Task<Void> task) {
                                                if(task.isSuccessful())
                                                    Toast.makeText(petkayit_Activity.this,"e-Mail ve Şifre Boş Geçilemez!", Toast.LENGTH_SHORT).show();
                                            else
                                                Toast.makeText(petkayit_Activity.this, task.getException().getMessage(), Toast.LENGTH_SHORT).show();


                                            }
                                        });

                            }


                            else
                                Toast.makeText(petkayit_Activity.this, task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                            finish();
                            startActivity(new Intent(petkayit_Activity.this, menu_Activity.class).setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP));

                        }
                    });


        }else
            Toast.makeText(this,"e-Mail ve Şifre Boş Geçilemez!", Toast.LENGTH_SHORT).show();
    }
        }

