package com.softtek.modelo.ejercicio3;

public class Persona {
    private String nombre;
    private int edad;
    private EstadoCivil estadoCivil;

    public Persona(String nombre, int edad, EstadoCivil estadoCivil) {
        this.nombre = nombre;
        this.edad = edad;
        this.estadoCivil = estadoCivil;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Edad: " + edad + ", Estado Civil: " + estadoCivil;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persona persona = (Persona) o;
        return edad == persona.edad && nombre.equals(persona.nombre) && estadoCivil == persona.estadoCivil;
    }
}
