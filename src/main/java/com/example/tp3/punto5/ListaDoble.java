package com.example.tp3.punto5;

import com.example.tp3.punto6.IteradorListaDoble;
import com.example.tp3.punto6.IteradorListaDobleInterfaz;

public class ListaDoble<T> implements ListaDobleInterfaz<T> {

	protected NodoListaDoble<T> header;

	public ListaDoble() {
		this.header = new NodoListaDoble<T>(null);
	}

	@Override
	public boolean isEmpty() {
		return this.header.siguiente == null;
	}

	@Override
	public int size() {
		int tamanio = 0;
		NodoListaDoble<T> nodoActual = header.siguiente;

		while (nodoActual != null) {
			tamanio++;
			nodoActual = nodoActual.siguiente;
		}

		return tamanio;
	}

	@Override
	public T get(int index) {
		if (index < 0 || index >= size()) {
			throw new IllegalArgumentException("El parámetro index es inválido.");
		}

		NodoListaDoble<T> nodoActual = header.siguiente;
		for (int i = 0; i < index; i++) {
			nodoActual = nodoActual.siguiente;
		}

		return nodoActual.elemento;
	}

	@Override
	public void add(T element) {
		NodoListaDoble<T> nodoPorAgregar = new NodoListaDoble<T>(element);
		if (size() == 0) {
			this.header.siguiente = nodoPorAgregar;
		} else {

			NodoListaDoble<T> nodoActual = header.siguiente;
			while (nodoActual.siguiente != null) {
				nodoActual = nodoActual.siguiente;
			}
			nodoPorAgregar.anterior = nodoActual;
			nodoActual.siguiente = nodoPorAgregar;
		}
	}

	@Override
	public void remove(T element) {
		if (size() == 0) {
			throw new IllegalArgumentException("No hay elementos en la estructura");
		}
		NodoListaDoble<T> nodoElem = null;
		NodoListaDoble<T> nodoActual = header.siguiente;
		while (nodoActual.siguiente != null) {
			if (nodoActual.elemento == element) {
				nodoElem = nodoActual;
				break;
			}
			nodoActual = nodoActual.siguiente;
		}
		if (nodoElem == null) {
			throw new IllegalArgumentException("El elemento especificado no forma parte de la estructura");
		}
		if (nodoElem.siguiente != null) {
			nodoElem.anterior.siguiente = nodoElem.siguiente;
			nodoElem.siguiente.anterior = nodoElem.anterior;
		} else {
			nodoElem.anterior.siguiente = nodoElem.siguiente;
		}
	}

	@Override
	public IteradorListaDobleInterfaz iterador() {
		return new IteradorListaDoble(this.header);
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("");
		if (isEmpty()) {
			return sb.toString();
		}
		
		NodoListaDoble<T> nodoActual = this.header.siguiente;
		while (nodoActual != null) {
			sb.append(", ");
			sb.append(nodoActual.getElemento().toString());
			nodoActual = nodoActual.siguiente;
		}
		
		return sb.toString().substring(2);
	}

}
