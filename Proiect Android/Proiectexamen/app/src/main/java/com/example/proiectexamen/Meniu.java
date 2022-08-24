package com.example.proiectexamen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.content.Intent;
import android.view.View;

public class Meniu extends AppCompatActivity {

    public Button button2;
    public Button button3;
    public Button button4;
    public Button button5;
    public Button button6;
    public Button button7;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meniu);

        button2 = (Button) findViewById(R.id.btn7);

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Meniu.this,Felul1.class);
                startActivity(intent);

            }

        });

        button3 = (Button) findViewById(R.id.btn6);

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Meniu.this,MainActivity.class);
                startActivity(intent);

            }

        });

        button4 =(Button) findViewById(R.id.btn2);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Meniu.this,Felul1.class);
                startActivity(intent);
            }
        });

        button5 =(Button) findViewById(R.id.btn3);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Meniu.this,Felul2.class);
                startActivity(intent);
            }
        });

        button6 =(Button) findViewById(R.id.btn4);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Meniu.this,Desert.class);
                startActivity(intent);
            }
        });

        button6 =(Button) findViewById(R.id.btn5);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Meniu.this,Bauturi.class);
                startActivity(intent);
            }
        });




    }
}