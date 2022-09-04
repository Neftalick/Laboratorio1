package com.example.laboratorio1_20185534;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class VistaPrincipal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.vista_principal
        );
        Button btn_memoria = findViewById(R.id.button_memoria);
        btn_memoria.setOnClickListener(view -> {
            //boton que dirige a memoria's view
            Intent intent = new Intent(VistaPrincipal.this, MainActivityMemoria.class);
            startActivity(intent);
        });
        Button btn_Tres_en_raya = findViewById(R.id.button_tresEnRaya);
        btn_Tres_en_raya.setOnClickListener(view -> {
            //boton que dirige a tres en raya view
            Intent intent = new Intent(VistaPrincipal.this, TresRaya.class);
            startActivity(intent);

        });

    }
}