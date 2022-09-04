package com.example.laboratorio1_20185534;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.example.laboratorio1_20185534.Entity.Tiempos;

import java.util.List;

public class EstadisticasMemoria extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_estadisticas_memoria);
        Intent intent = this.getIntent();
        Tiempos tiempos = (Tiempos) intent.getSerializableExtra("Resultados");
        String textoImprimir = new String();
        List<String> tiempo = tiempos.getTiemposGuardados();
        for (String time: tiempo) {
            textoImprimir += time+"\n";
        }
        TextView textView = findViewById(R.id.EstadisticasMemoria);
        textView.setText(textoImprimir);
        Button btn_new_game = findViewById(R.id.button_nuevoJuegoMemoria);
        btn_new_game.setOnClickListener(view -> {
            Intent intent1 = new Intent();
            intent1.putExtra("Resultados", tiempos);
            setResult(RESULT_OK,intent1);
            finish();
        });
    }
}