package com.example.tp3.punto5;

public class NodoListaDoble<T> {
	protected NodoListaDoble<T> anterior;
	protected T elemento;
	protected NodoListaDoble<T> siguiente;

	public NodoListaDoble(T elemento) {
		this(elemento, null, null);
	}

	public NodoListaDoble(T elemento, NodoListaDoble<T> anterior, NodoListaDoble<T> siguiente) {
		this.anterior = anterior;
		this.elemento = elemento;
		this.siguiente = siguiente;
	}

	public T getElemento() {
		return elemento;
	}

	public void setElemento(T elemento) {
		this.elemento = elemento;
	}

	public NodoListaDoble<T> getAnterior() {
		return anterior;
	}
	
	public void setAnterior(NodoListaDoble<T> anterior) {
		this.anterior = anterior;
	}

	public NodoListaDoble<T> getSiguiente() {
		return siguiente;
	}
	
	public void setSiguiente(NodoListaDoble<T> siguiente) {
		this.siguiente = siguiente;
	}
	
	@Override
    public String toString() {
        return "[" + ((elemento != null)? elemento.toString() : "") + "]";
    }
}
