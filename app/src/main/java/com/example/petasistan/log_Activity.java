package com.example.petasistan;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.petasistan.menu_Activity;
import com.example.petasistan.reg_Activity;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import org.jetbrains.annotations.NotNull;

public class log_Activity extends AppCompatActivity {
    private EditText editEmail, editSifre;
    private String txtEmail, txtSifre;
    private FirebaseAuth mAuth;
    private FirebaseUser mUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log);


        editEmail=findViewById(R.id.girisemail);
        editSifre=findViewById(R.id.girissifre);
        mAuth = FirebaseAuth.getInstance();

        findViewById(R.id.heabimyoktext).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(log_Activity.this, reg_Activity.class);
                startActivity(intent);
            }
        });

    }


    public void GirisYap(View view){

        txtEmail = editEmail.getText().toString();
        txtSifre = editSifre.getText().toString();

        if(!TextUtils.isEmpty(txtEmail)&&!TextUtils.isEmpty(txtSifre)){

            mAuth.signInWithEmailAndPassword(txtEmail,txtSifre)
                    .addOnSuccessListener(this, new OnSuccessListener<AuthResult>() {
                        @Override
                        public void onSuccess(AuthResult authResult) {

                            mUser = mAuth.getCurrentUser();

                            System.out.println("Kullanıcı Adı:" +mUser.getDisplayName());
                            System.out.println("Kullanıcı e-Mail:" +mUser.getEmail());
                            System.out.println("Kullanıcı Uid:" +mUser.getUid());
                            finish();
                            startActivity(new Intent(log_Activity.this, menu_Activity.class).setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP));

                        }
                    }).addOnFailureListener(this, new OnFailureListener() {
                        @Override
                        public void onFailure(@NonNull @NotNull Exception e) {

                            Toast.makeText(log_Activity.this, e.getMessage(),Toast.LENGTH_SHORT).show();

                        }
                    });

        }else
            Toast.makeText(this,"e-Mail ve  Şifre Alanı Boş Olamaz", Toast.LENGTH_SHORT).show();

    }
}