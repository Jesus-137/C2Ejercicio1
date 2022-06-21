package com.upchiapas.Ejercicio1.models;

public class Impresion {
    public OperacionMetodo operacion;
    public Impresion(OperacionMetodo operacion){
        this.operacion=operacion;
    }
    public void resultado(){
        System.out.println(operacion.p());
        System.out.println("El area es: "+operacion.area());
    }
}
