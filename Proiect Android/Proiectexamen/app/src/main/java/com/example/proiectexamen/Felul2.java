package com.example.proiectexamen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.content.Intent;
import android.view.View;

public class Felul2 extends AppCompatActivity {

    public Button button6;
    public Button button7;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_felul2);

        button6 = (Button) findViewById(R.id.btn10);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Felul2.this,Meniu.class);
                startActivity(intent);
            }
        });

        button7 = (Button) findViewById(R.id.btn11);
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Felul2.this,Desert.class);
                startActivity(intent);
            }
        });



    }
}