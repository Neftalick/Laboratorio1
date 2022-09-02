package com.example.laboratorio1_20185534;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.example.laboratorio1_20185534.Entity.Resultados;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        Intent intent = this.getIntent();
        TextView textView = findViewById(R.id.label_resultados);
        Resultados resultados = (Resultados) intent.getSerializableExtra("Resultados");
        String result = new String();
        for (Integer i = 0; i < resultados.result.size(); i++){
            if (resultados.result.get(i) == 1){
                result = result + "Juego " + i + " : Ganó X\n";
            }else if (resultados.result.get(i) == 2){
                result = result + "Juego " + i + " : Ganó 0\n";
            }else if (resultados.result.get(i) == 0){
                result = result + "Juego " + i + " : Canceló\n";
            }
        }
        textView.setText(result);
        Button btn_new_game = findViewById(R.id.btn_nuevo_juego);
        btn_new_game.setOnClickListener(view -> {
            Intent intent1 = new Intent();
            intent1.putExtra("Resultados", resultados);
            setResult(RESULT_OK,intent1);
            finish();
        });
    }
}