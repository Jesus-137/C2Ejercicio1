package com.upchiapas.Ejercicio1.models;

import java.util.Scanner;

public class LecturaDatos {

    public void leerdatos() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el dato A: ");
        float a = entrada.nextFloat();
        System.out.println("Ingrese el dato B: ");
        float b = entrada.nextFloat();
        System.out.println("Ingrese el dato C: ");
        float c = entrada.nextFloat();
        OperacionMetodo metodo = new OperacionMetodo();
        metodo.imprime(a, b, c);
    }
}
