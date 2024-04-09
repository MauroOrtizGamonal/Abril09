package com.softtek.presentacion;

public class Consumidores {

    // Consumidor para imprimir en mayúsculas
    static void imprimirEnMayusculas(String texto) {
        System.out.println(texto.toUpperCase());
    }

    // Consumidor para imprimir números y sus cuadrados
    static void imprimirCuadrado(int num) {
        System.out.println("Número: " + num + ", Cuadrado: " + num*num);
    }

    // Clase Producto para mostrar detalles de un producto
    static class Producto {
        String nombre;
        double precio;

        public Producto(String nombre, double precio) {
            this.nombre = nombre;
            this.precio = precio;
        }

        @Override
        public String toString() {
            return "Nombre: " + nombre + ", Precio: " + precio;
        }
    }

    // Consumidor para imprimir detalles de un producto
    static void imprimirDetalles(Producto producto) {
        System.out.println(producto);
    }

    // Interfaz de usuario simulada para mostrar un mensaje en un cuadro de diálogo
    static void mostrarMensajeEnCuadroDialogo(String mensaje) {
        System.out.println("Cuadro de diálogo: " + mensaje);
    }

    // Consumidor para escribir en un archivo de registro
    static void escribirEnArchivoRegistro(String evento) {
        System.out.println("Archivo de registro: " + evento);
    }

    public static void main(String[] args) {
        // Ejemplos de uso de los consumidores
        System.out.println("Consumidor para imprimir en mayúsculas:");
        imprimirEnMayusculas("hola mundo");

        System.out.println("\nConsumidor para imprimir números y sus cuadrados:");
        imprimirCuadrado(5);

        System.out.println("\nConsumidor para imprimir detalles de un producto:");
        Producto producto = new Producto("Laptop", 1200.50);
        imprimirDetalles(producto);

        System.out.println("\nConsumidor para mostrar un mensaje en un cuadro de diálogo:");
        mostrarMensajeEnCuadroDialogo("Este es un mensaje importante.");

        System.out.println("\nConsumidor para escribir en un archivo de registro:");
        escribirEnArchivoRegistro("Evento de inicio de sesión.");
    }
}
