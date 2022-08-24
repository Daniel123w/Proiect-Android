package com.example.proiectexamen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.content.Intent;
import android.view.View;

public class Felul1 extends AppCompatActivity {

    public Button button5;
    public Button button6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_felul1);

        button5 = (Button) findViewById(R.id.btn8);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Felul1.this,Meniu.class);
                startActivity(intent);
            }
        });

        button6 = (Button) findViewById(R.id.btn9);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Felul1.this,Felul2.class);
                startActivity(intent);
            }
        });
    }
}