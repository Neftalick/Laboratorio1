package com.example.laboratorio1_20185534;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn_memoria = findViewById(R.id.button_memoria);
        btn_memoria.setOnClickListener(view -> {
            //boton que dirige a memoria's view
        });
        Button btn_Tres_en_raya = findViewById(R.id.button_tresEnRaya);
        btn_Tres_en_raya.setOnClickListener(view -> {
            //boton que dirige a tres en raya view
            Intent intent = new Intent(MainActivity.this,MainActivity2.class);
            startActivity(intent);
        });

    }
}