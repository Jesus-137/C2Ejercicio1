package com.upchiapas.Ejercicio1.models;

public class OperacionMetodo {
    public OperacionMetodo(){
    }

    public float area(float a, float b, float c){
        float area;
        area=(float) (Math.sqrt(p(a, b, c)*(p(a, b, c)-a)*(p(a, b, c)-b)*(p(a, b, c)-c)));
        return area;
    }

    public float p (float a, float b, float c){
        float p;
        p=(a+b+c)/2.00f;
        return p;
    }

    public void imprime(float a, float b, float c){
        Impresion imprime=new Impresion();
        imprime.resultado(area(a, b, c));
    }
}
