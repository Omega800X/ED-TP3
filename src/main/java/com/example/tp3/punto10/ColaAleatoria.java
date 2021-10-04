package com.example.tp3.punto10;

import ar.edu.uner.fcad.ed.edlineales.NodoLista;

public class ColaAleatoria<T> implements ColaAleatoriaInterfaz<T> {

	protected NodoLista<T> front;
	protected NodoLista<T> back;
	private int cantElem;

	public ColaAleatoria() {
		makeEmpty();
		this.cantElem = 0;
	}

	@Override
	public boolean isEmpty() {
		return front == null;
	}

	@Override
	public boolean isFull() {
		return false;
	}

	@Override
	public T random() {
		if (isEmpty()) {
			return null;
		}
		int numRandom = (int) (Math.random() * this.cantElem);
		NodoLista<T> nodoActual = this.front;
		for (int i = 0; i < numRandom; i++) {
			nodoActual = nodoActual.getSiguiente();
		}
		return nodoActual.getElemento();
	}

	@Override
	public void removeRandom() {
		int numRandom = (int) (Math.random() * this.cantElem);
		NodoLista<T> nodoActual = this.front;
		for (int i = 0; i < numRandom - 1; i++) {
			nodoActual = nodoActual.getSiguiente();
		}
		if (nodoActual.getSiguiente().getSiguiente() != null) {
			nodoActual.setSiguiente(nodoActual.getSiguiente().getSiguiente());
		} else {
			nodoActual.setSiguiente(null);
		}
	}

	@Override
	public void enqueue(T elemento) {
		NodoLista<T> nuevoNodo = new NodoLista<T>(elemento);
		if (isEmpty()) {
			this.front = nuevoNodo;
			this.back = nuevoNodo;
		} else {
			this.back.setSiguiente(nuevoNodo);
			this.back = back.getSiguiente();
		}
		this.cantElem += 1;
	}

	@Override
	public void makeEmpty() {
		this.front = this.back = null;
	}

	@Override
	public String toString() {
		String resultado = "";

		if (isEmpty()) {
			return resultado;
		}

		NodoLista<T> nodoActual = this.front;

		while (nodoActual != null) {
			resultado += ", " + nodoActual.toString();
			nodoActual = nodoActual.getSiguiente();
		}

		resultado = resultado.substring(2);

		return resultado;
	}

}
