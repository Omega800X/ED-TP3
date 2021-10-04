package com.example.tp3.punto10;

public interface ColaAleatoriaInterfaz<T> {

    /**
     * Indica si la estructura está vacía
     * @return 
     */
    public boolean isEmpty();

    /**
     * Indica si la estructura está llena
     * @return 
     */
    public boolean isFull();

    /**
     * Obtiene un elemento aleatoriamente de la estructura
     * @return 
     */
    public T random();

    /**
     * Quita un elemento aleatoriamente de la estructura.
     */
    public void removeRandom();

    /**
     * Agrega un elemento al final de la estructura
     * @param elemento
     */
    public void enqueue(T elemento);

    /**
     * Vacía la estructura
     */
    public void makeEmpty();
}
