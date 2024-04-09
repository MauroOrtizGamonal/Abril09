package com.softtek.modelo;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data

public final class Producto {

    public static int CONTADOR=1;
    private final int ID;
    private String nombre;
    private double precio;

    public Producto(){
        this.ID=CONTADOR++;
    }

    public double importar(int cantidad){
        return cantidad *precio;
    }
}
