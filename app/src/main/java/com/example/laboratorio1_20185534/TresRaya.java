package com.example.laboratorio1_20185534;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.Toast;

import com.example.laboratorio1_20185534.Entity.Resultados;

public class TresRaya extends AppCompatActivity {

    boolean primero = true;
    Resultados resultados = new Resultados();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.vista_tresraya);
        Button btn1 = findViewById(R.id.btn1);
        Button btn2 = findViewById(R.id.btn2);
        Button btn3 = findViewById(R.id.btn3);
        Button btn4 = findViewById(R.id.btn4);
        Button btn5 = findViewById(R.id.btn_5);
        Button btn6 = findViewById(R.id.btn_6);
        Button btn7 = findViewById(R.id.btn_7);
        Button btn8 = findViewById(R.id.btn_8);
        Button btn9 = findViewById(R.id.btn_9);

        Button btn_estadistica = findViewById(R.id.btn_estadisticas);
        TableLayout tableLayout = (TableLayout) findViewById(R.id.tableLayout);
        btn_estadistica.setOnClickListener(view -> {
            Intent intent = new Intent(TresRaya.this, EstadisticasTresRaya.class);
            intent.putExtra("Resultados", resultados);
            startActivityForResult(intent,1);
        });

        btn1.setOnClickListener(view -> {
            String label = btn1.getText().toString();
            if (!(label.equals("O") || label.equals("X"))) {
                CambiarEstado(btn1);
                //Inicio del algoritmo
                boolean ganoJuego = this.ganoPartida(btn1,tableLayout);
                if(btn1.getText().toString().equalsIgnoreCase("X")&&ganoJuego){
                    //Gano X
                    Toast.makeText(this,"Gano X!",Toast.LENGTH_LONG).show();
                    resultados.result.add(1);
                    this.NuevaPartida(tableLayout);
                }
                if(btn1.getText().toString().equalsIgnoreCase("O")&&ganoJuego){
                    //Gano O
                    Toast.makeText(this,"Gano O!",Toast.LENGTH_LONG).show();
                    resultados.result.add(2);
                    this.NuevaPartida(tableLayout);
                }
                this.verificarEmpate(tableLayout);
            }
        });
        btn2.setOnClickListener(view -> {
            String label = btn2.getText().toString();
            if (!(label.equals("O") || label.equals("X"))) {
                //Cambio el estado
                CambiarEstado(btn2);
                //verifico si alguien gano
                boolean ganoJuego = this.ganoPartida(btn2,tableLayout);
                if(btn2.getText().toString().equalsIgnoreCase("X")&&ganoJuego){
                    //Gano X
                    Toast.makeText(this,"Gano X!",Toast.LENGTH_LONG).show();
                    resultados.result.add(1);
                    this.NuevaPartida(tableLayout);
                }
                if(btn2.getText().toString().equalsIgnoreCase("O")&&ganoJuego){
                    //Gano O
                    Toast.makeText(this,"Gano O!",Toast.LENGTH_LONG).show();
                    resultados.result.add(2);
                    this.NuevaPartida(tableLayout);
                }
                //Caso contrario no pasa nada -> Sigue el juego
                this.verificarEmpate(tableLayout);
            }
        });
        btn3.setOnClickListener(view -> {
            String label = btn3.getText().toString();
            if (!(label.equals("O") || label.equals("X"))) {
                CambiarEstado(btn3);
                boolean ganoJuego = this.ganoPartida(btn3,tableLayout);
                if(btn3.getText().toString().equalsIgnoreCase("X")&&ganoJuego){
                    //Gano X
                    Toast.makeText(this,"Gano X!",Toast.LENGTH_LONG).show();
                    resultados.result.add(1);
                    this.NuevaPartida(tableLayout);
                }
                if(btn3.getText().toString().equalsIgnoreCase("O")&&ganoJuego){
                    //Gano O
                    Toast.makeText(this,"Gano O!",Toast.LENGTH_LONG).show();
                    resultados.result.add(2);
                    this.NuevaPartida(tableLayout);
                }
                this.verificarEmpate(tableLayout);
            }
        });
        btn4.setOnClickListener(view -> {
            String label = btn4.getText().toString();
            if (!(label.equals("O") || label.equals("X"))) {
                CambiarEstado(btn4);
                boolean ganoJuego = this.ganoPartida(btn4,tableLayout);
                if(btn4.getText().toString().equalsIgnoreCase("X")&&ganoJuego){
                    //Gano X
                    Toast.makeText(this,"Gano X!",Toast.LENGTH_LONG).show();
                    resultados.result.add(1);
                    this.NuevaPartida(tableLayout);
                }
                if(btn4.getText().toString().equalsIgnoreCase("O")&&ganoJuego){
                    //Gano O
                    Toast.makeText(this,"Gano O!",Toast.LENGTH_LONG).show();
                    resultados.result.add(2);
                    this.NuevaPartida(tableLayout);
                }
                this.verificarEmpate(tableLayout);
            }
        });
        btn5.setOnClickListener(view -> {
            String label = btn5.getText().toString();
            if (!(label.equals("O") || label.equals("X"))) {
                CambiarEstado(btn5);
                boolean ganoJuego = this.ganoPartida(btn5,tableLayout);
                if(btn5.getText().toString().equalsIgnoreCase("X")&&ganoJuego){
                    //Gano X
                    Toast.makeText(this,"Gano X!",Toast.LENGTH_LONG).show();
                    resultados.result.add(1);
                    this.NuevaPartida(tableLayout);
                }
                if(btn5.getText().toString().equalsIgnoreCase("O")&&ganoJuego){
                    //Gano O
                    Toast.makeText(this,"Gano O!",Toast.LENGTH_LONG).show();
                    resultados.result.add(2);
                    this.NuevaPartida(tableLayout);
                }
                this.verificarEmpate(tableLayout);
            }
        });
        btn6.setOnClickListener(view -> {
            String label = btn6.getText().toString();
            if (!(label.equals("O") || label.equals("X"))) {
                CambiarEstado(btn6);
                boolean ganoJuego = this.ganoPartida(btn6,tableLayout);
                if(btn6.getText().toString().equalsIgnoreCase("X")&&ganoJuego){
                    //Gano X
                    Toast.makeText(this,"Gano X!",Toast.LENGTH_LONG).show();
                    resultados.result.add(1);
                    this.NuevaPartida(tableLayout);
                }
                if(btn6.getText().toString().equalsIgnoreCase("O")&&ganoJuego){
                    //Gano O
                    Toast.makeText(this,"Gano O!",Toast.LENGTH_LONG).show();
                    resultados.result.add(2);
                    this.NuevaPartida(tableLayout);
                }
                this.verificarEmpate(tableLayout);
            }
        });
        btn7.setOnClickListener(view -> {
            String label = btn7.getText().toString();
            if (!(label.equals("O") || label.equals("X"))) {
                CambiarEstado(btn7);
                boolean ganoJuego = this.ganoPartida(btn7,tableLayout);
                if(btn7.getText().toString().equalsIgnoreCase("X")&&ganoJuego){
                    //Gano X
                    Toast.makeText(this,"Gano X!",Toast.LENGTH_LONG).show();
                    resultados.result.add(1);
                    this.NuevaPartida(tableLayout);
                }
                if(btn7.getText().toString().equalsIgnoreCase("O")&&ganoJuego){
                    //Gano O
                    Toast.makeText(this,"Gano O!",Toast.LENGTH_LONG).show();
                    resultados.result.add(2);
                    this.NuevaPartida(tableLayout);
                }
                this.verificarEmpate(tableLayout);
            }
        });
        btn8.setOnClickListener(view -> {
            String label = btn8.getText().toString();
            if (!(label.equals("O") || label.equals("X"))) {
                CambiarEstado(btn8);
                boolean ganoJuego = this.ganoPartida(btn8,tableLayout);
                if(btn8.getText().toString().equalsIgnoreCase("X")&&ganoJuego){
                    //Gano X
                    Toast.makeText(this,"Gano X!",Toast.LENGTH_LONG).show();
                    resultados.result.add(1);
                    this.NuevaPartida(tableLayout);
                }
                if(btn8.getText().toString().equalsIgnoreCase("O")&&ganoJuego){
                    //Gano O
                    Toast.makeText(this,"Gano O!",Toast.LENGTH_LONG).show();
                    resultados.result.add(2);
                    this.NuevaPartida(tableLayout);
                }
                this.verificarEmpate(tableLayout);
            }
        });
        btn9.setOnClickListener(view -> {
            String label = btn9.getText().toString();
            if (!(label.equals("O") || label.equals("X"))) {
                CambiarEstado(btn9);
                boolean ganoJuego = this.ganoPartida(btn9,tableLayout);
                if(btn9.getText().toString().equalsIgnoreCase("X")&&ganoJuego){
                    //Gano X
                    Toast.makeText(this,"Gano X!",Toast.LENGTH_LONG).show();
                    resultados.result.add(1);
                    this.NuevaPartida(tableLayout);
                }
                if(btn9.getText().toString().equalsIgnoreCase("O")&&ganoJuego){
                    //Gano O
                    Toast.makeText(this,"Gano O!",Toast.LENGTH_LONG).show();
                    resultados.result.add(2);
                    this.NuevaPartida(tableLayout);
                }
                this.verificarEmpate(tableLayout);
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
    public void NuevaPartida(TableLayout tl){
        //Resetear todo el juego
        for (int i = 0; i <= 2; i++) {
            TableRow tr = (TableRow) tl.getChildAt(i);
            for (int j = 0; j <= 2; j++) {
                Button button = (Button) tr.getChildAt(j);
                button.setText("-");
            }
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

    public boolean ganadorFila(TableLayout tl, Button btn) {
        //Hallamos en qué fila se encuentra el button
        String idStr = Character.toString(btn.getResources().getResourceEntryName(btn.getId()).charAt(3));
        int idButton = Integer.parseInt(idStr);
        int fila;
        if (idButton % 3 == 0) {
            fila = idButton / 3 - 1;
        } else {
            fila = (idButton - (idButton % 3)) / 3;
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
        String idStr = Character.toString(btn.getResources().getResourceEntryName(btn.getId()).charAt(3));
        int idButton = Integer.parseInt(idStr);
        int columna = idButton % 3 != 0 ? (idButton % 3 - 1) : 2;
        boolean ganadorColumna = true;
        for (int j = 0; j <= 1; j++) {
            TableRow tr1 = (TableRow) tl.getChildAt(j);
            TableRow tr2 = (TableRow) tl.getChildAt(j + 1);
            Button btnAct = (Button) tr1.getChildAt(columna);
            Button btnPost = (Button) tr2.getChildAt(columna);
            if (!(btnAct.getText().toString().equalsIgnoreCase(btnPost.getText().toString()))) {
                //basta que uno sea distinto
                ganadorColumna = false;
                break;
            }
        }
        return ganadorColumna;
    }

    public boolean ganadorDiagonal(TableLayout tl, Button btn) {
        //validar que el valor sea distinto de '-'
        //primero identifico si el valor se encuentra en la diagonal
        boolean enDiagonal = false;
        boolean ganadorDiagonal = false;
        String idStr = Character.toString(btn.getResources().getResourceEntryName(btn.getId()).charAt(3));
        int idButton = Integer.parseInt(idStr);
        int[] diagonal = {1, 5, 9, 3, 7};
        //obtengo los botones
        //fila 1
        TableRow tr1 = (TableRow) tl.getChildAt(0);
        //fila 2
        TableRow tr2 = (TableRow) tl.getChildAt(1);
        //fila 3
        TableRow tr3 = (TableRow) tl.getChildAt(2);
        String v1 = (((Button) tr1.getChildAt(0)).getText().toString());
        String v3 = (((Button) tr1.getChildAt(2)).getText().toString());
        String v5 = (((Button) tr2.getChildAt(1)).getText().toString());
        String v7 = (((Button) tr3.getChildAt(0)).getText().toString());
        String v9 = (((Button) tr3.getChildAt(2)).getText().toString());
        for (int value : diagonal) {
            if (idButton == value) {
                enDiagonal = true;
                break;
            }
        }
        if (enDiagonal) {
            //si me encuentro en el centro ->Aunque con esta logica deberia unificar porque ambas diagonales pasan por el centro ->Criterio de diversidad espacial
            /**if(idButton==5){**/
            //No es necesario iterar
            if((v5.equalsIgnoreCase(v1)&&v5.equalsIgnoreCase(v9)&&!v5.equalsIgnoreCase("-"))||(v5.equalsIgnoreCase(v3)&&v5.equalsIgnoreCase(v7)&&!v5.equalsIgnoreCase("-"))){
                ganadorDiagonal = true;
            }
            else if (!v5.equalsIgnoreCase(v1) || !v5.equalsIgnoreCase(v9)) {
                //primera diagonal
                //basta que alguno de los dos match
                ganadorDiagonal = false;
            } else if (!v5.equalsIgnoreCase(v3) || !v5.equalsIgnoreCase(v7)) {
                ganadorDiagonal = false;
            }
            /**
             }else if(idButton==1||idButton==9){
             if(!)
             }else{

             }**/
        } else {
            ganadorDiagonal = false;
        }
        return ganadorDiagonal;
    }
    //Analisis de las 3 comparativas
    public boolean  ganoPartida(Button btn,TableLayout tl){
        boolean ganoPorColumna = this.ganadorColumna(tl,btn);
        boolean ganoPorFila = this.ganadorFila(tl,btn);
        boolean ganoPorDiagonal = this.ganadorDiagonal(tl,btn);
        return (ganoPorDiagonal||ganoPorFila||ganoPorColumna);
    }

    public void verificarEmpate(TableLayout tl){
        boolean todoLleno = true;
        for(int i=0;i<=2;i++){
            TableRow tr = (TableRow) tl.getChildAt(i);
            for (int j=0;j<=2;j++){
                Button btnAux = (Button) tr.getChildAt(j);
                if(btnAux.getText().toString().equalsIgnoreCase("-")){
                    todoLleno=false;
                }
            }
        }
        if(todoLleno){
            //hay un empate
            this.NuevaPartida(tl);
            resultados.result.add(3);
            Toast.makeText(this,"Hubo un empate!",Toast.LENGTH_LONG).show();
        }
        //Caso contrario sigue en juego
    }
}