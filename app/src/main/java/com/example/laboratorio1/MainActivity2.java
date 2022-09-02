package com.example.laboratorio1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {

    boolean primero = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void CambiarEstado(View view){
        Button button = (Button) view;
        if(primero){
            //inicio primero el juego
            button.setText("O");
            primero = false;
        }else{
            //le toca jugar al segundo
            button.setText("X");
            primero = true;
        }
    }

    public void ReiniciarJuego(View view){
        //id

    }
}