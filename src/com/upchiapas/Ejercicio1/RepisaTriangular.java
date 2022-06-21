package com.upchiapas.Ejercicio1;

import com.upchiapas.Ejercicio1.models.Impresion;
import com.upchiapas.Ejercicio1.models.LecturaDatos;
import com.upchiapas.Ejercicio1.models.OperacionMetodo;

public class RepisaTriangular {
    private static LecturaDatos datos=new LecturaDatos();
    private static OperacionMetodo metodo=new OperacionMetodo(datos);
    private static Impresion impresion=new Impresion(metodo);
    public static void main(String[] args) {
        datos.leerdatos();
        impresion.resultado();
    }
}
