package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String strEmail,strPassword;
    EditText Email,Password;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Email = findViewById(R.id.Email);
        Password = findViewById(R.id.Password);
        button = findViewById(R.id.btn);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                strEmail = Email.getText().toString();
                strPassword = Password.getText().toString();

                if(strEmail.equals("admin@mail.com")&& strPassword.equals("admin123"))
                {
                    startActivity(new Intent(MainActivity.this,MainActivity2.class));

                    Toast.makeText(MainActivity.this,"Login Success",Toast.LENGTH_SHORT).show();

                }
                else
                {
                    Toast.makeText(MainActivity.this,"Login Failed",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}