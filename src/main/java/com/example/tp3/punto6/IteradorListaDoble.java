package com.example.tp3.punto6;

import com.example.tp3.punto5.NodoListaDoble;

public class IteradorListaDoble<T> implements IteradorListaDobleInterfaz<T> {
	private NodoListaDoble<T> nodoActual;

	public IteradorListaDoble(NodoListaDoble<T> header) {
		this.nodoActual = header;
	}

	@Override
	public boolean existeSiguiente() {
		return nodoActual.getSiguiente() != null;
	}

	@Override
	public T siguiente() {
		T resultado = null;

		if (existeSiguiente()) {
			nodoActual = nodoActual.getSiguiente();
			resultado = nodoActual.getElemento();
		}
		return resultado;
	}

	@Override
	public T primero() {
		while (existeAnterior()) {
			nodoActual = nodoActual.getAnterior();
		}
		return nodoActual.getElemento();
	}

	@Override
	public boolean existeAnterior() {
		return nodoActual.getAnterior() != null;
	}

	@Override
	public T anterior() {
		T resultado = null;

		if (existeAnterior()) {
			nodoActual = nodoActual.getAnterior();
			resultado = nodoActual.getElemento();
		}
		return resultado;
	}

	@Override
	public T ultimo() {
		while (existeSiguiente()) {
			nodoActual = nodoActual.getSiguiente();
		}
		return nodoActual.getElemento();
	}

}
