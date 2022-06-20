package com.upchiapas.Ejercicio1.models;

import java.util.Scanner;

public class LecturaDatos {
    private int a; private int b; private int c;
    private Scanner entrada=new Scanner(System.in);

    public LecturaDatos(){}

    public void leerdatos(){
        System.out.println("ingrese el primer dato");
        a=entrada.nextInt();
        System.out.println("ingrese el segundo dato");
        b=entrada.nextInt();
        System.out.println("ingrese el tercer dato");
        c=entrada.nextInt();
    }

    public int getA() {return a;}

    public int getB() {return b;}

    public int getC() {return c;}
}
