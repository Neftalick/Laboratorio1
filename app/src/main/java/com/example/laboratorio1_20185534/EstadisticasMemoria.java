package com.example.laboratorio1_20185534;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;

import com.example.laboratorio1_20185534.Entity.Tiempos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EstadisticasMemoria extends AppCompatActivity {


    Map<Integer, String> cantidadJuegos = new HashMap<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_estadisticas_memoria);
        Intent intent = this.getIntent();

        String textoImprimir = new String();

        cantidadJuegos = (Map<Integer, String>) intent.getSerializableExtra("Resultados");

        Log.d("msg", " cantidad de juegos vista estadisticas: " + Integer.toString( cantidadJuegos.size()));
        Log.d("msg", " juego  1  : tiempo -- " + cantidadJuegos.get(1)  );



        for (int j=1; j<=cantidadJuegos.size(); j++){
            textoImprimir += "juego " + Integer.toString(j) + cantidadJuegos.get(j) +"\n" ;
        }
        Log.d("msg",textoImprimir);
        cantidadJuegos.size();
        TextView textView = findViewById(R.id.EstadisticasMemoria);
        textView.setText(textoImprimir);
        Button btn_new_game = findViewById(R.id.button_nuevoJuegoMemoria);
        btn_new_game.setOnClickListener(view -> {
            Intent intent1 = new Intent();
            //intent1.putExtra("Resultados", tiempos);
            setResult(RESULT_OK,intent1);
            finish();
        });
    }
}