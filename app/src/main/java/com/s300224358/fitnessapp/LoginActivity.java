package com.s300224358.fitnessapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    EditText username,password;
    Button register, login;
    DBHelper DB;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        login = (Button) findViewById(R.id.btnLogin);
        register = (Button) findViewById(R.id.btnRegister);

        username = (EditText) findViewById(R.id.txtUsername);
        password = (EditText) findViewById(R.id.txtPassword);

        DB = new DBHelper(this);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), LoginActivity2.class);
                startActivity(intent);
            }
        });
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String user = username.getText().toString();
                String pass = password.getText().toString();

                if (user.equals("") || pass.equals("")){
                    Toast.makeText(LoginActivity.this,"Please make sure fields are not empty", Toast.LENGTH_SHORT).show();
                }else{
                    Boolean checkMatch = DB.checkUsername(user);
                    if (checkMatch == false){
                        Boolean insertUser = DB.insertData(user,pass);
                        if (insertUser ==true){
                            Toast.makeText(LoginActivity.this, "You have registered", Toast.LENGTH_SHORT).show();
                            Intent intent = new Intent(getApplicationContext(),Workouts.class);
                            startActivity(intent);
                        }else{
                            Toast.makeText(LoginActivity.this,"Unsuccsessful",Toast.LENGTH_SHORT).show();
                        }
                    }
                    Toast.makeText(LoginActivity.this,"User already exists", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}