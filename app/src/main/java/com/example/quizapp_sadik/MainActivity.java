package com.example.quizapp_sadik;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
//step 1 : declaration
    EditText etMail, etPassword;
    Button bLogin;
    TextView tvRegister;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //step 2 : Recuperation des ids
        etMail = findViewById(R.id.etMail);
        etPassword = findViewById(R.id.etPassword);
        bLogin = findViewById(R.id.bLogin);
        tvRegister = findViewById(R.id.tvRegister);

        //step 3 : Association de listeners
        bLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //step4 :Traitement
                if(etMail.getText().toString().equals("toto@gmail.com") & etPassword.getText().toString().equals("123456"))
            {
                startActivity(new Intent(MainActivity.this,Quiz1.class));
            }
                else{
                    Toast.makeText(getApplicationContext(),"Login or Password incorrect!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        tvRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //step4 :Traitement
                startActivity(new Intent(MainActivity.this,Register.class));
            }
        });
    }
}