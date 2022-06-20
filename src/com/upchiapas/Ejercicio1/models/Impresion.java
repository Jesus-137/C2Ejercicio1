package com.upchiapas.Ejercicio1.models;

public class Impresion {
    private LecturaDatos datos;
    public OperacionMetodo operacion;
    public Impresion(LecturaDatos datos, OperacionMetodo operacion){
        this.datos=datos;
        this.operacion=operacion;
    }
    public void resultado(){
        System.out.println(operacion.getP());
        System.out.println("El area es: "+operacion.getArea());
    }
}
