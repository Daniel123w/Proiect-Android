package com.example.proiectexamen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.content.Intent;
import android.view.View;


public class Desert extends AppCompatActivity {
    public Button button1;
    public Button button2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_desert);

        button1 = (Button) findViewById(R.id.btn13);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Desert.this,Bauturi.class);
                startActivity(intent);
            }
        });

        button2 = (Button) findViewById(R.id.btn12);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Desert.this,Meniu.class);
                startActivity(intent);
            }
        });

    }
}