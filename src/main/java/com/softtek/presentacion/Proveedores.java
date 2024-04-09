package com.softtek.presentacion;

import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;

public class Proveedores {

    // Proveedor de números aleatorios en un rango específico
    static Supplier<Integer> numeroAleatorio(int min, int max) {
        Random random = new Random();
        return () -> random.nextInt(max - min + 1) + min;
    }

    // Proveedor de una lista predefinida de elementos
    static Supplier<List<String>> listaPredefinida(List<String> elementos) {
        return () -> elementos;
    }

    // Proveedor de fecha y hora actual del sistema
    static Supplier<Date> fechaHoraActual() {
        return Date::new;
    }

    // Proveedor de un nuevo objeto String vacío
    static Supplier<String> cadenaVacia() {
        return String::new;
    }

    public static void main(String[] args) {
        // Ejemplos de uso de los proveedores
        System.out.println("Proveedor de números aleatorios:");
        Supplier<Integer> generarNumero = numeroAleatorio(1, 100);
        System.out.println("Número aleatorio: " + generarNumero.get());

        System.out.println("\nProveedor de una lista predefinida:");
        List<String> elementos = List.of("Manzana", "Banana", "Naranja");
        Supplier<List<String>> obtenerLista = listaPredefinida(elementos);
        System.out.println("Lista predefinida: " + obtenerLista.get());

        System.out.println("\nProveedor de fecha y hora actual:");
        Supplier<Date> obtenerFechaHora = fechaHoraActual();
        System.out.println("Fecha y hora actual: " + obtenerFechaHora.get());

        System.out.println("\nProveedor de un nuevo objeto String vacío:");
        Supplier<String> obtenerCadena = cadenaVacia();
        System.out.println("Cadena vacía: " + obtenerCadena.get());
    }
}
