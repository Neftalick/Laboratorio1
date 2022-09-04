package com.example.laboratorio1_20185534.Entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Tiempos implements Serializable {
    public List<String> getTiemposGuardados() {
        return tiemposGuardados;
    }

    public void setTiemposGuardados(List<String> tiemposGuardados) {
        this.tiemposGuardados = tiemposGuardados;
    }

    List<String> tiemposGuardados = new ArrayList<>();
}
