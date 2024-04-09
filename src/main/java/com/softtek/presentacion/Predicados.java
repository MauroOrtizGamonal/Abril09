package com.softtek.presentacion;

import java.util.function.Predicate;

public class Predicados {

    // Predicado para números positivos
    static Predicate<Integer> esPositivo = num -> num > 0;

    // Predicado para cadenas no vacías
    static Predicate<String> noVacia = str -> !str.isEmpty();

    // Predicado para números pares
    static Predicate<Integer> esPar = num -> num % 2 == 0;

    // Predicado para números mayores que un valor dado
    static Predicate<Integer> esMayorQue(int valor) {
        return num -> num > valor;
    }

    // Predicado para números primos
    static Predicate<Integer> esPrimo = num -> {
        if (num <= 1)
            return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    };

    public static void main(String[] args) {
        // Ejemplos de uso de los predicados
        System.out.println("Predicado para números positivos:");
        System.out.println("¿Es 5 positivo? " + esPositivo.test(5));
        System.out.println("¿Es -3 positivo? " + esPositivo.test(-3));

        System.out.println("\nPredicado para cadenas no vacías:");
        System.out.println("¿La cadena 'Hola' no está vacía? " + noVacia.test("Hola"));
        System.out.println("¿La cadena '' no está vacía? " + noVacia.test(""));

        System.out.println("\nPredicado para números pares:");
        System.out.println("¿Es 4 par? " + esPar.test(4));
        System.out.println("¿Es 7 par? " + esPar.test(7));

        System.out.println("\nPredicado para números mayores que un valor dado:");
        Predicate<Integer> mayorQue5 = esMayorQue(5);
        System.out.println("¿Es 7 mayor que 5? " + mayorQue5.test(7));
        System.out.println("¿Es 3 mayor que 5? " + mayorQue5.test(3));

        System.out.println("\nPredicado para números primos:");
        System.out.println("¿Es 7 primo? " + esPrimo.test(7));
        System.out.println("¿Es 10 primo? " + esPrimo.test(10));
    }
}
