package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private CheckBox chk1,chk2,chk3;
    private Button display;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addListenerOnChk1();
        addListenerOnChk2();
        addListenerOnChk3();
        addListenerOnButton();
    }

    public void addListenerOnChk1(){
        chk1 = (CheckBox) findViewById(R.id.chk1);
        chk1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (((CheckBox)view).isChecked()){
                    Toast.makeText(MainActivity.this, "Book1 Checked", Toast.LENGTH_LONG).show();
                }
            }
        });
    }public void addListenerOnChk2(){
        chk1 = (CheckBox) findViewById(R.id.chk2);
        chk1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (((CheckBox)view).isChecked()){
                    Toast.makeText(MainActivity.this, "Book2 Checked", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
    public void addListenerOnChk3(){
        chk1 = (CheckBox) findViewById(R.id.chk3);
        chk1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (((CheckBox)view).isChecked()){
                    Toast.makeText(MainActivity.this, "Book3 Checked", Toast.LENGTH_LONG).show();
                }
            }
        });
    }

    public void addListenerOnButton(){
        chk1 = (CheckBox) findViewById(R.id.chk1);
        chk2 = (CheckBox) findViewById(R.id.chk2);
        chk3 = (CheckBox) findViewById(R.id.chk3);
        display = (Button) findViewById(R.id.display);

        display.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StringBuffer result = new StringBuffer();
                result.append(" Book1 ").append(chk1.isChecked());
                result.append(" Book2 ").append(chk2.isChecked());
                result.append(" Book3 ").append(chk3.isChecked());

                Toast.makeText(MainActivity.this,result.toString(),Toast.LENGTH_LONG).show();
            }
        });
    }
}