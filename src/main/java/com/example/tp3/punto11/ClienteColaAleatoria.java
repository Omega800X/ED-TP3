
package com.example.tp3.punto11;

import com.example.tp3.punto10.ColaAleatoria;

public class ClienteColaAleatoria {
    public static void main(String[] args) {
        ColaAleatoria colaAle = new ColaAleatoria();
        for (int i = 0; i < 10; i++) {
            colaAle.add(i); 
        }
        System.out.println("cola");
        System.out.println(colaAle.toString());
        
//        System.out.println("metodo isEmpty");
//        System.out.println(colaAle.isEmpty());
        
//        System.out.println("");
//        System.out.println("metodo isFull");
//        System.out.println(colaAle.isFull());
//        
//        System.out.println("obtener un elemento random");
//        System.out.println(colaAle.random());
//        
//        System.out.println(colaAle.toString());
//        System.out.println("Quitar un elemento aleatorio");
//        colaAle.removeRandom();
//        System.out.println(colaAle.toString());
//        
//        
//        System.out.println("");
//        System.out.println("Agregar un elemento al final de la estructura");
//        colaAle.enqueue(22);
//        System.out.println("");
//        
//        
        System.out.println("vacía la estructura");
        colaAle.makeEmpty();
        System.out.println(colaAle.toString());
//        
    }
    
    
    
}
