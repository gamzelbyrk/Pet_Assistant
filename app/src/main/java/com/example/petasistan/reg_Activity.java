package com.example.petasistan;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import org.jetbrains.annotations.NotNull;

public class reg_Activity extends AppCompatActivity {
    private EditText editEmail, editSifre;
    private String txtEmail, txtSifre;
    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reg);


        editEmail=findViewById(R.id.reg_email);
        editSifre=findViewById(R.id.reg_sifre);
        mAuth = FirebaseAuth.getInstance();




        findViewById(R.id.hesapvar).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(reg_Activity.this,log_Activity.class);
                startActivity(intent);
            }
        });



    }

    public void KayitOl (View view){

        txtEmail = editEmail.getText().toString();
        txtSifre = editSifre.getText().toString();

        if(!TextUtils.isEmpty(txtEmail)&&!TextUtils.isEmpty(txtSifre)){


            mAuth.createUserWithEmailAndPassword(txtEmail,txtSifre)
                    .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull @NotNull Task<AuthResult> task) {
                            if(task.isSuccessful())
                                Toast.makeText(reg_Activity.this, "Kayıt İşlemi Başarı İle Gerçekleştirildi", Toast.LENGTH_SHORT).show();

                            else
                                Toast.makeText(reg_Activity.this, task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                            finish();
                            startActivity(new Intent(reg_Activity.this, menu_Activity.class).setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP));

                        }
                    });


        }else
            Toast.makeText(this,"e-Mail ve Şifre Boş Geçilemez!", Toast.LENGTH_SHORT).show();
    }



}