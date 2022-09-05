package com.example.laboratorio1_20185534;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;

import com.example.laboratorio1_20185534.Entity.Tiempos;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class MainActivityMemoria extends AppCompatActivity {

    ArrayList<String> lista_1 = new ArrayList<>();
    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn10,btn11,btn12,btn13,btn14,btn15,btn16;
    Button[] botonera = new Button[16];
    //ArrayList<Integer> cantidadJuegos = new ArrayList<Integer>();
    int juegos=0;
    int aciertos = 0;

    Map<Integer, String> cantidadJuegos = new HashMap<>();

    Handler handler = new Handler();
    long tiempoInicial;
    long tiempoFinal;
    Button primero;
    boolean bloqueo = false;
    //Tiempos tiempos = new Tiempos();
    List<Integer> tiempos = new ArrayList<>();

    TextView textView = findViewById(R.id.textResultado);


    String primeraLetra, segundaLetra;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_memoria);

          juegos++;
          tiempoInicial = System.currentTimeMillis();
          metodoRandom();
          cargarBotones();
          iniciarJuego();
          Log.d("juegos","numero de juego: " + Integer.toString(juegos));
          Button btnEstadisticas = findViewById(R.id.btnEstadisticas);
          btnEstadisticas.setOnClickListener(view -> {
              Intent intent = new Intent(MainActivityMemoria.this, EstadisticasMemoria.class);
              intent.putExtra("Resultados", (Serializable) cantidadJuegos);
              startActivity(intent);
          });
          Button btnNuevo = findViewById(R.id.btnNuevo);
          btnNuevo.setOnClickListener(view -> {
              textView.setText("¿Cuanto tiempo te demoras?");
              if(aciertos!=8){
                  cantidadJuegos.put(juegos,"se canceló juego");
                  Log.d("resultado","juego " +Integer.toString(juegos)+ "se canceló ");
              }
                  juegos++;
                  Log.d("juegos","numero de juego: " + Integer.toString(juegos));
                  bloqueo=false;
                  lista_1.clear();
                  metodoRandom();
                  cargarBotones();
                  iniciarJuego();


          });
    }

    public void iniciarJuego(){
        for(int i=0; i<botonera.length;i++){
            botonera[i].setText(lista_1.get(i));
        }
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                for (int i=0; i< botonera.length;i++){
                    botonera[i].setText("-");
                }


                //los eventos
                for (int j=0; j<16;j++ ){
                    final int k=j;
                    botonera[j].setEnabled(true);
                    botonera[j].setOnClickListener(view -> {
                        if(!bloqueo){
                            comprobar(k, botonera[k]);
                        }
                    });
                }
            }
        }, 5000);
    }

    public void comprobar(int i, final Button btnValor){


        if (primero==null){

            primero = btnValor;


            primero.setText(lista_1.get(i));
            primero.setEnabled(false);

            primeraLetra = lista_1.get(i);
            Log.d("msg","valor de la 1ra letra: " + primeraLetra);

        }else{
            btnValor.setText(lista_1.get(i));
            bloqueo=true;
            segundaLetra = lista_1.get(i);
            Log.d("msg","valor de la 2da letra: " + segundaLetra);
            btnValor.setEnabled(false);

            if (primeraLetra==segundaLetra){
                Log.d("msg","Coinciden las letras");
                primero=null;
                bloqueo=false;
                aciertos++;
                if (aciertos==8){
                    Log.d("msg","completo el juego!!");
                    tiempoFinal = System.currentTimeMillis();
                    long TiempoTotal = tiempoFinal-tiempoInicial;

                    long minutes = TimeUnit.MILLISECONDS.toMinutes(TiempoTotal);
                    Log.d("resultado","juego " + Integer.toString(juegos) + " total de minutos " + Long.toString(minutes));
                    cantidadJuegos.put(juegos, " Realizó un total de " + Long.toString(minutes).toString() + " minutos");

                    textView.setText("Total de minutos : " + Long.toString(minutes).toString());

                }else{

                }

            }else{
                Log.d("msg","No coinciden las letras");
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {

                        primero.setText("-");
                        primero.setEnabled(true);
                        btnValor.setEnabled(true);
                        btnValor.setText("-");
                        primero =null;
                        bloqueo=false;

                    }
                }, 1000);

            }

        }

    }

    public void metodoRandom(){

        lista_1.add("A");lista_1.add("B");lista_1.add("C");
        lista_1.add("D");lista_1.add("E");lista_1.add("F");
        lista_1.add("G");lista_1.add("H");
        lista_1.add("A");lista_1.add("B");lista_1.add("C");
        lista_1.add("D");lista_1.add("E");lista_1.add("F");
        lista_1.add("G");lista_1.add("H");

        Collections.shuffle(lista_1);

        for(String valor_random: lista_1){
            Log.d("msg","valor: " + valor_random);

        }
        int array = lista_1.toArray().length;
        Log.d("msg", "length de la lista :" +array );


    }


    public void cargarBotones(){

        btn1 = findViewById(R.id.btn1);
        botonera[0]=btn1;

        btn2 = findViewById(R.id.btn2);
        botonera[1]=btn2;

        btn3 = findViewById(R.id.btn3);
        botonera[2]=btn3;

        btn4 = findViewById(R.id.btn4);
        botonera[3]=btn4;

        btn5 = findViewById(R.id.btn5);
        botonera[4]=btn5;

        btn6 = findViewById(R.id.btn_6);
        botonera[5]=btn6;

        btn7 = findViewById(R.id.btn7);
        botonera[6]=btn7;

        btn8 = findViewById(R.id.btn8);
        botonera[7]=btn8;

        btn9 = findViewById(R.id.btn9);
        botonera[8]=btn9;

        btn10 = findViewById(R.id.btn10);
        botonera[9]=btn10;

        btn11 = findViewById(R.id.btn11);
        botonera[10]=btn11;

        btn12 = findViewById(R.id.btn12);
        botonera[11]=btn12;

        btn13 = findViewById(R.id.btn13);
        botonera[12]=btn13;

        btn14 = findViewById(R.id.btn14);
        botonera[13]=btn14;

        btn15 = findViewById(R.id.btn15);
        botonera[14]=btn15;

        btn16 = findViewById(R.id.btn16);
        botonera[15]=btn16;

    }
}