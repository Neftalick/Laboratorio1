package com.example.laboratorio1_20185534;

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
        Button btn1 = findViewById(R.id.btn1);
        Button btn2 = findViewById(R.id.btn2);
        Button btn3 = findViewById(R.id.btn3);
        Button btn4 = findViewById(R.id.btn4);
        Button btn5 = findViewById(R.id.btn5);
        Button btn6 = findViewById(R.id.btn6);
        Button btn7 = findViewById(R.id.btn7);
        Button btn8 = findViewById(R.id.btn8);
        Button btn9 = findViewById(R.id.btn9);
        btn1.setOnClickListener(view -> {
            String label = btn1.getText().toString();
            if (!(label.equals("O") || label.equals("X"))){
                CambiarEstado(btn1);
            }
        });
        btn2.setOnClickListener(view -> {
            String label = btn2.getText().toString();
            if (!(label.equals("O") || label.equals("X"))){
                CambiarEstado(btn2);
            }
        });
        btn3.setOnClickListener(view -> {
            String label = btn3.getText().toString();
            if (!(label.equals("O") || label.equals("X"))){
                CambiarEstado(btn3);
            }
        });
        btn4.setOnClickListener(view -> {
            String label = btn4.getText().toString();
            if (!(label.equals("O") || label.equals("X"))){
                CambiarEstado(btn4);
            }
        });
        btn5.setOnClickListener(view -> {
            String label = btn5.getText().toString();
            if (!(label.equals("O") || label.equals("X"))){
                CambiarEstado(btn5);
            }
        });
        btn6.setOnClickListener(view -> {
            String label = btn6.getText().toString();
            if (!(label.equals("O") || label.equals("X"))){
                CambiarEstado(btn6);
            }
        });
        btn7.setOnClickListener(view -> {
            String label = btn7.getText().toString();
            if (!(label.equals("O") || label.equals("X"))){
                CambiarEstado(btn7);
            }
        });
        btn8.setOnClickListener(view -> {
            String label = btn8.getText().toString();
            if (!(label.equals("O") || label.equals("X"))){
                CambiarEstado(btn8);
            }
        });
        btn9.setOnClickListener(view -> {
            String label = btn9.getText().toString();
            if (!(label.equals("O") || label.equals("X"))){
                CambiarEstado(btn9);
            }
        });


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