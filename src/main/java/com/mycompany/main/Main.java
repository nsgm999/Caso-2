package com.mycompany.main;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class Main {

    static List<Amigo> listadoAmigos(){
        return Arrays.asList(new Amigo("Joshua"),
                new Amigo("Greivin"),
                new Amigo("Guillermo"),
                new Amigo("Andres"),
                new Amigo("Tavo"),
                new Amigo("David"));
    }

    static List<Movimiento> listadoMovimientos(){
        List<Amigo> amigos = listadoAmigos();
        List<Amigo> parti1 = Arrays.asList(amigos.get(0),amigos.get(1),amigos.get(2),amigos.get(3),amigos.get(4));
        List<Amigo> parti2 = Arrays.asList(amigos.get(0),amigos.get(5));
        List<Amigo> parti3 = Arrays.asList(amigos.get(1),amigos.get(2),amigos.get(3),amigos.get(4));
        List<Movimiento> movimientos = new ArrayList<>();
        movimientos.add(new Movimiento("Desayuno CoffeePrime",amigos,amigos.get(2),120,"Dolares"));
        movimientos.add(new Movimiento("Almuerzo Pig Factory",parti1,amigos.get(2),200,"Dolares"));
        movimientos.add(new Movimiento("Cena FastFood",parti2,amigos.get(5),50,"Dolares"));
        movimientos.add(new Movimiento("Pizza Hut",parti3,amigos.get(4),100,"Dolares"));
        movimientos.add(new Movimiento("Quicksilver store", Collections.singletonList(amigos.get(2)),amigos.get(1),150,"Dolares"));
        movimientos.add(new Movimiento("Apple store", Collections.singletonList(amigos.get(3)),amigos.get(0),200,"Dolares"));
        movimientos.add(new Movimiento("Desayuno Chillis", amigos,amigos.get(1),150,"Dolares"));
        movimientos.add(new Movimiento("Almuerzo hooters",amigos,amigos.get(4),180,"Dolares"));
        return movimientos;
    }

    public static void main(String[] args) {
        Analisis analisis = new Analisis(listadoAmigos(),listadoMovimientos());
        imprimirDeuda(2,analisis);
        System.out.println("");
        imprimirDeuda(3,analisis);
        System.out.println("");
        imprimirDeuda(4,analisis);
        System.out.println("");
        imprimirDeuda(5,analisis);
        System.out.println("");
        imprimirDeuda(1,analisis);
        System.out.println("");
        imprimirDeuda(0,analisis);
        
 
        
    }

    public static void imprimirDeuda(int indiceA, Analisis analisis){
        System.out.println(listadoAmigos().get(indiceA) + ":");
        for (int i = 0; i < listadoAmigos().size(); i++) {
            if(i == indiceA)
                continue;
            System.out.println(analisis.calcularDeuda(listadoAmigos().get(indiceA),listadoAmigos().get(i)));
        }
    }

}