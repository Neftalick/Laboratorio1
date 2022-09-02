package com.example.laboratorio1_20185534;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.example.laboratorio1.R;

import java.util.Collection;
import java.util.Collections;

public class MainActivityMemoria extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_memoria);
        metodoRandom();
    }

    public void metodoRandom(){
        char[] lista = new char[]{'A','B','C','D','E','F','G','H','A','B','C','D','E','F','G','H'};

        Collections.shuffle(Collections.singletonList(lista));
        for(char valor_random: lista){
            Log.d("msg","valor: " + valor_random);
        }
    }
}