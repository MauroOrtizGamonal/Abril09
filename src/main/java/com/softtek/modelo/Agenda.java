package com.softtek.modelo;

import java.util.TreeSet;

public class Agenda {
    private TreeSet<String> contactos;

    public Agenda() {
        this.contactos = new TreeSet<>();
    }

    public void agregarContacto(String nombre) {
        contactos.add(nombre);
    }

    public void eliminarContacto(String nombre) {
        contactos.remove(nombre);
    }

    public void mostrarContactos() {
        System.out.println("Contactos en la agenda:");
        for (String contacto : contactos) {
            System.out.println(contacto);
        }
    }
}
