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
        Email =(EditText) findViewById(R.id.email);
        Password = (EditText) findViewById(R.id.password);
        button = findViewById(R.id.btn);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                strEmail = Email.getText().toString();
                strPassword = Password.getText().toString();

                if(strEmail.equals("aasha@mail.com") && strPassword.equals("aasha123"))
                {
                    startActivity(new Intent(MainActivity.this,MainActivity2.class));
                    Toast.makeText(MainActivity.this, "Valid Credentials", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(MainActivity.this, "Login Failed", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}