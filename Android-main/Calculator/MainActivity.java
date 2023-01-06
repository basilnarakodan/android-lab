package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    String result;
    int num1,num2;
    EditText n1,n2;
    TextView result1;
    Button add,mul,sub,div;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        n1 = (EditText) findViewById(R.id.etn1);
        n2 = (EditText) findViewById(R.id.etn2);
        result1 = findViewById(R.id.res);
        add = findViewById(R.id.add);
        sub = findViewById(R.id.sub);
        mul = findViewById(R.id.mul);
        div = findViewById(R.id.div);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numFinder();
                result = String.valueOf(num1+num2);
                result1.setText("Result = " +result);
            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numFinder();
                result = String.valueOf(num1-num2);
                result1.setText("Result = " +result);
            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numFinder();
                result = String.valueOf(num1*num2);
                result1.setText("Result = " +result);
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numFinder();
                result = String.valueOf(num1/num2);
                result1.setText("Result = " +result);
            }
        });
    }
    protected void numFinder()
    {
        num1 = Integer.parseInt(n1.getText().toString());
        num2 = Integer.parseInt(n2.getText().toString());
    }

}