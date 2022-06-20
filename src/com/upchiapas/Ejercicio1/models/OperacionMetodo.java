package com.upchiapas.Ejercicio1.models;

public class OperacionMetodo {
    private LecturaDatos datos;
    private float area;
    private float p;
    public OperacionMetodo(LecturaDatos datos){
        this.datos=datos;
    }
    public void area(){
       area=(float) (Math.sqrt(p()*(p()-datos.getA())*(p()-datos.getB())*(p()-datos.getC())));
    }
    public float p (){
        p=(datos.getA()+datos.getB()+datos.getC())/2.00f;
        return p;
    }

    public float getArea() {
        return area;
    }

    public float getP() {
        return p;
    }
}
