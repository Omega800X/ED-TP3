package com.example.tp3.punto10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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

	private List<T> randomQueueToList(ColaAleatoria param) {
		List<T> res = new ArrayList<T>();
		NodoLista<T> nodoActual = param.front;
		while (nodoActual != null) {
			res.add(nodoActual.getElemento());
			nodoActual = nodoActual.getSiguiente();
		}
		return res;
	}

	@Override
	public void removeRandom() {
		List<T> aux = randomQueueToList(this);
		int randomIndex = (int) (Math.random() * (aux.size()));
		aux.remove(randomIndex);
		makeEmpty();
		for(var elem : aux) {
			this.enqueue(elem);
		}
		cantElem--;
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
