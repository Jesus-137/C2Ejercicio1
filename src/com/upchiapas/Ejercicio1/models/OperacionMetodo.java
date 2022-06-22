package com.upchiapas.Ejercicio1.models;

public class OperacionMetodo {
    private float area;
    public OperacionMetodo(){
    }
    public void area(float a, float b, float c){area=(float) (Math.sqrt(p(a, b, c)*(p(a, b, c)-a)*(p(a, b, c)-b)*(p(a, b, c)-c)));}
    public float p (float a, float b, float c){
        float p;
        p=(a+b+c)/2.00f;
        return p;
    }

    public float getArea() {return area;}
}
