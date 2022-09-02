package com.example.laboratorio1_20185534;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TableLayout;
import android.widget.TableRow;

import com.example.laboratorio1_20185534.Entity.Resultados;

import java.util.ArrayList;
import java.util.List;

public class MainActivity2 extends AppCompatActivity {

    boolean primero = true;
    Resultados resultados = new Resultados();

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
        Button btn_estadistica = findViewById(R.id.btn_estadisticas);
        btn_estadistica.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity2.this,MainActivity3.class);
            intent.putExtra("Resultados", resultados);
            startActivity(intent);
        });
        btn1.setOnClickListener(view -> {
            String label = btn1.getText().toString();
            if (!(label.equals("O") || label.equals("X"))) {
                CambiarEstado(btn1);
            }
        });
        btn2.setOnClickListener(view -> {
            String label = btn2.getText().toString();
            if (!(label.equals("O") || label.equals("X"))) {
                CambiarEstado(btn2);
            }
        });
        btn3.setOnClickListener(view -> {
            String label = btn3.getText().toString();
            if (!(label.equals("O") || label.equals("X"))) {
                CambiarEstado(btn3);
            }
        });
        btn4.setOnClickListener(view -> {
            String label = btn4.getText().toString();
            if (!(label.equals("O") || label.equals("X"))) {
                CambiarEstado(btn4);
            }
        });
        btn5.setOnClickListener(view -> {
            String label = btn5.getText().toString();
            if (!(label.equals("O") || label.equals("X"))) {
                CambiarEstado(btn5);
            }
        });
        btn6.setOnClickListener(view -> {
            String label = btn6.getText().toString();
            if (!(label.equals("O") || label.equals("X"))) {
                CambiarEstado(btn6);
            }
        });
        btn7.setOnClickListener(view -> {
            String label = btn7.getText().toString();
            if (!(label.equals("O") || label.equals("X"))) {
                CambiarEstado(btn7);
            }
        });
        btn8.setOnClickListener(view -> {
            String label = btn8.getText().toString();
            if (!(label.equals("O") || label.equals("X"))) {
                CambiarEstado(btn8);
            }
        });
        btn9.setOnClickListener(view -> {
            String label = btn9.getText().toString();
            if (!(label.equals("O") || label.equals("X"))) {
                CambiarEstado(btn9);
            }
        });


    }

    public void CambiarEstado(View view) {
        Button button = (Button) view;
        if (primero) {
            //inicio primero el juego
            button.setText("O");
            primero = false;
        } else {
            //le toca jugar al segundo
            button.setText("X");
            primero = true;
        }
    }

    public void ReiniciarJuego(View view) {
        //Resetear todo el juego
        TableLayout tableLayout = (TableLayout) findViewById(R.id.tableLayout);
        for (int i = 0; i <= 2; i++) {
            TableRow tr = (TableRow) tableLayout.getChildAt(i);
            for (int j = 0; j <= 2; j++) {
                Button button = (Button) tr.getChildAt(j);
                button.setText("-");
            }
        }
        resultados.result.add(0);
    }
    //falta llamarlo en los listernes de los botones
    public boolean ganadorFila(TableLayout tl, Button btn) {
        //Hallamos en qué fila se encuentra el button
        int idButton = btn.getId();
        int fila;
        if(idButton%3==0){
             fila = idButton/3-1;
        }else{
             fila = (idButton-(idButton%3))/3;
        }
        boolean ganadorFila = true;
        TableRow tr = (TableRow) tl.getChildAt(fila);
        for (int j = 0; j <= 1; j++) {
            //basta que dos sean distintos para que no haya ganador dentro de una fila
            Button btnAct = (Button) tr.getChildAt(j);
            Button btnPost = (Button) tr.getChildAt(j + 1);
            if (!(btnAct.getText().toString().equalsIgnoreCase(btnPost.getText().toString()))) {
                ganadorFila = false;
                break;
            }
        }
        return ganadorFila;
    }
    //falta llamarlo en los listernes de los botones
    public boolean ganadorColumna(TableLayout tl, Button btn) {
        int idButton = btn.getId();
        int columna = idButton%3!=0?(idButton%3-1):2;
        boolean ganadorColumna =true;
        for (int j=0;j <=1;j++){
            TableRow tr1 = (TableRow) tl.getChildAt(j);
            TableRow tr2 = (TableRow) tl.getChildAt(j+1);
            Button btnAct = (Button) tr1.getChildAt(columna);
            Button btnPost = (Button)  tr2.getChildAt(columna);
            if(!(btnAct.getText().toString().equalsIgnoreCase(btnPost.getText().toString()))){
                //basta que uno sea distinto
                ganadorColumna = true;
                break;
            }
        }
        return ganadorColumna;
    }

    public boolean ganadorDiagonal() {
        for (int i = 0; i <= 2; i++) {

        }
        return true;
    }
}