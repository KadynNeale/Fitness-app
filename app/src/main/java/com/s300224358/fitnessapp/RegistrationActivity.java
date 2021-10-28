package com.s300224358.fitnessapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class RegistrationActivity extends AppCompatActivity {

    DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
    Date birthday;
    DateFormat sqlFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        final EditText fullName = (EditText) findViewById(R.id.regFullName);
        final EditText weight = (EditText) findViewById(R.id.regWeight);
        final EditText birthdate = (EditText) findViewById(R.id.regBirthdate);

        Button register = (Button) findViewById(R.id.btnSubmitRegister);

        DatabaseHandler db = new DatabaseHandler(this);
        String sqlDob = sqlFormat.format(birthday);
        String regName = fullName.getText().toString();
        String regWeight = fullName.getText().toString();

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //checking if fields are empty
                try{
                    String dob=(birthdate.getText().toString());
                    birthday = dateFormat.parse(dob);
                }
                catch (java.text.ParseException e)
                {
                    e.printStackTrace();
                    Toast.makeText(RegistrationActivity.this, "Enter a proper birthdate!", Toast.LENGTH_SHORT).show();
                }
                if (TextUtils.isEmpty(fullName.getText().toString()) || TextUtils.isEmpty(weight.getText().toString()) ||
                        !fullName.getText().toString().contains(" ") || weight.getText().toString().contains(" ")){
                    Toast.makeText(RegistrationActivity.this, "Fields are incorrect", Toast.LENGTH_SHORT).show();
                }

//                Toast.makeText(RegistrationActivity.this, "Registration Successful!", Toast.LENGTH_SHORT).show();
                db.deleteAllStudents();
                //inserting strings to sql

                db.addUser(new User(regName,regWeight,sqlDob));
//                db.getStudentsCount();
                startActivity(new Intent(RegistrationActivity.this,LoginActivity.class));
            }

        });


    }
}