package com.softtek.presentacion.ejercicio3;

import com.softtek.modelo.ejercicio3.EstadoCivil;
import com.softtek.modelo.ejercicio3.Persona;

public class TestPersona {
    public static void main(String[] args) {

        Persona persona1 = new Persona("Juan", 30, EstadoCivil.SOLTERO);
        Persona persona2 = new Persona("María", 35, EstadoCivil.CASADO);
        Persona persona3 = new Persona("Carlos", 40, EstadoCivil.VIUDO);
        Persona persona4 = new Persona("Carlos", 40, EstadoCivil.DIVORCIADO);

        System.out.println("Información de Persona 1: " + persona1);
        System.out.println("Información de Persona 2: " + persona2);
        System.out.println("Información de Persona 3: " + persona3);
        System.out.println("Información de Persona 4: " + persona4);

    }
}
