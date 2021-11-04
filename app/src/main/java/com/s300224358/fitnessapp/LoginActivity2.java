package com.s300224358.fitnessapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity2 extends AppCompatActivity {
    EditText username,password;
    Button loginBtn;
    DBHelper DB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login3);

        username = (EditText) findViewById(R.id.txtUsername1);
        password = (EditText) findViewById(R.id.txtPassword1);
        loginBtn = (Button) findViewById(R.id.btnLogin1);
        DB = new DBHelper(this);

        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String user = username.getText().toString();
                String pass = password.getText().toString();

                if (user.equals("")|| pass.equals("")){
                    Toast.makeText(LoginActivity2.this, "Please make sure to fill all text fields", Toast.LENGTH_SHORT).show();
                }else{
                    Boolean checkUser = DB.checkUsernamePass(user,pass);
                    if (checkUser == true){
                        Toast.makeText(LoginActivity2.this, "Sign in Successful",Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(getApplicationContext(),Workouts.class);
                        startActivity(intent);
                    }else{
                        Toast.makeText(LoginActivity2.this,"Invalid Login Info",Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
    }
}