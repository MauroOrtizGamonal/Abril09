package com.softtek.presentacion;

import com.softtek.modelo.Agenda;

class Main {
    public static void main(String[] args) {
        // Crear una instancia de Agenda
        Agenda agenda = new Agenda();

        // Agregar algunos contactos
        agenda.agregarContacto("Juan");
        agenda.agregarContacto("María");
        agenda.agregarContacto("Carlos");

        // Mostrar los contactos
        agenda.mostrarContactos();

        // Eliminar un contacto
        agenda.eliminarContacto("María");

        // Mostrar los contactos actualizados
        System.out.println("\nContactos después de eliminar 'María':");
        agenda.mostrarContactos();
    }
}
