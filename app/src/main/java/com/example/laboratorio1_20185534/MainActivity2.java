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