package com.softtek.presentacion.ejercicio2;

import com.softtek.modelo.ejercicio2.Calculadora;

public class PruebasCalculadora {
    public static void main(String[] args) {

        double resultadoSuma = Calculadora.suma(10, 5);
        double resultadoResta = Calculadora.resta(10, 5);
        double resultadoMultiplica = Calculadora.multiplicacion(10, 5);
        double resultadoDivide = Calculadora.division(10, 5);

        System.out.println("Suma: " + resultadoSuma);
        System.out.println("Resta: " + resultadoResta);
        System.out.println("Multiplicación: " + resultadoMultiplica);
        System.out.println("División: " + resultadoDivide);
    }
}
