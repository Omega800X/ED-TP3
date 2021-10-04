package com.example.tp3.punto10;

import ar.edu.uner.fcad.ed.edlineales.ListaEnlazadaOrdenada;

public class ColaAleatoria<T> extends ListaEnlazadaOrdenada  implements ColaAleatoriaInterfaz<T> {

    /**
     * Indica si la estructura está vacía
     * @return 
     */
    @Override
    public boolean isEmpty() {
        boolean aux;
        if (this.size()<1){
            aux = true; 
        }else {
            aux=false;
        }
        
        return aux;
    }

    /**
     * Indica si la estructura está llena
     * @return 
     */
    @Override
    public boolean isFull() {
        boolean aux;
        if (this.isFull()){
            aux = true; 
        }else {
            aux=false;
        }
        
        return aux;
    }

    /**
     * Obtiene un elemento aleatoriamente de la estructura
     */
    @Override
    public T random() {
        T elem;
        int aux = (int)(Math.random()*this.size());
        elem=(T) this.get(aux);
        return elem;
    }

    /**
     * Quita un elemento aleatoriamente de la estructura.
     */
    @Override
    public void removeRandom() {
        int aux = (int)(Math.random()*this.size());
        this.remove(aux); 
    }
    /** Agrega un elemento al final de la estructura
     * @param elemento*/
    @Override
    public void enqueue(T elemento) {
        if (!this.isEmpty()){
            this.header.getSiguiente().setElemento(elemento); ;
        }
         
    }
    /** Vacía la estructura */
    @Override
    public void makeEmpty() {
       while(!this.isEmpty()){
            this.removeLast();
        }
    }

}
