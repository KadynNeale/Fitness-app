package com.s300224358.fitnessapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button login = (Button) findViewById(R.id.btnLogin);
        Button register = (Button) findViewById(R.id.btnRegister);

        EditText user = (EditText) findViewById(R.id.txtUsername);
        EditText pass = (EditText) findViewById(R.id.txtPassword);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(TextUtils.isEmpty(user.getText().toString())|| TextUtils.isEmpty(pass.getText().toString())){
                    Toast.makeText(LoginActivity.this, "A field is empty", Toast.LENGTH_SHORT).show();
                }else
                    //write login check here
                    startActivity(new Intent(LoginActivity.this,MainActivity.class));

            }
        });
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //write registration code here
            }
        });

    }
}