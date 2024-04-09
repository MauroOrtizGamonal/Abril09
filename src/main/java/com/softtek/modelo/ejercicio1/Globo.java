package com.softtek.modelo.ejercicio1;

public class Globo {
    private static int idGlobo = 0;
    private int id;

    public Globo() {
        idGlobo++;
        id = idGlobo;
    }

    public int getId() {
        return id;
    }
}


