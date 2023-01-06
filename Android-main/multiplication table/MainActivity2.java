package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    String x;
    TextView multiply;
    int num,s=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        x = getIntent().getStringExtra("Number");
        num = Integer.parseInt(x);
        for (int i=1; i<=10; i++)
        {
            s = i * num;
            multiply = findViewById(R.id.mul);
            multiply.append(num+"*"+i+"="+s+"\n");
        }


    }
}