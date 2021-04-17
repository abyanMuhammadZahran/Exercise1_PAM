package com.example.exercise1_pam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btnLogin;
    EditText edemail, edpassword;
    String nama,password;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLogin = findViewById(R.id.bSignin);
        edemail = findViewById(R.id.edEmail);
        edpassword = findViewById(R.id.edPassword);



//        Button Function Validation
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {



                //condition
                if (edemail.length()==0)
                {
                    edemail.setError("Masukkan Email");
                }
                else if (edpassword.length()==0)
                {
                    edpassword.setError("Masukkan Password");
                }
                else
                {
                    login();
                }

            }
        });


    }

    public void login(){
        String email = edemail.getText().toString().trim();
        String password = edpassword.getText().toString().trim();

        if(email.equals("admin@mail.com") && password.equals("123456"))
        {
            Toast.makeText(this,"login berhasil",Toast.LENGTH_LONG).show();
        }else{
            Toast.makeText(this,"Login Gagal,Cek Kembali",Toast.LENGTH_LONG).show();
        }
    }
}