package com.example.laboratorio1_20185534;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TableLayout;
import android.widget.TableRow;

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
        //Resetear todo el juego
        TableLayout tableLayout = findViewById(R.id.tableLayout);
        for(int i =0; i <=2;i++){
            TableRow tr = (TableRow) tableLayout.getChildAt(i);
            for(int j=0;j<=2;j++){
                Button button = (Button) tableLayout.getChildAt(j);
                button.setText('-');
            }
        }
    }
}