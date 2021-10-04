
package com.example.tp3.punto8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import ar.edu.uner.fcad.ed.edlineales.colas.ColaPorEnlaces;
import ar.edu.uner.fcad.ed.edlineales.pilas.PilaPorEnlaces;

public class PilaExtImp<T> extends PilaPorEnlaces implements PilaExtInterfaz<T> {

	private ArrayList<T> stackToArrayList(PilaPorEnlaces<T> pilaParam){
		ArrayList<T> resultado = new ArrayList<T>();
		while(!pilaParam.isEmpty()) {
			resultado.add(pilaParam.top());
			pilaParam.pop();
		}
		return resultado;
	}
	
	/**
	 * Mezcla los elementos la estructura con los de pilaParam.
	 * 
	 * @param pilaParam
	 */
	
	public void intercalar(PilaPorEnlaces<T> pilaParam) {
		PilaPorEnlaces<T> pilaAux = new PilaPorEnlaces();
		List<T> listaAux = stackToArrayList(pilaParam);
		listaAux.addAll(stackToArrayList(this));
		Collections.shuffle(listaAux);
		this.makeEmpty();
		for(int i = 0; i < listaAux.size(); i++) {
			this.push(listaAux.get(i));
		}
	}

	/*
	 * 
	 * Agrega al final de la estructura los elementos de pilaPam**
	 * 
	 * @param pilaParam
	 */
	@Override
	public void agregarTodos(PilaPorEnlaces<T> pilaParam) {
		while (!pilaParam.isEmpty()) {
			this.push(pilaParam.top());
			pilaParam.pop();
		}

	}

	/*
	 * 
	 * Invierte el orden de los elementos de la estructura.
	 */

	@Override
	public void invertirOrden() {
		ColaPorEnlaces<T> aux = new ColaPorEnlaces();
		while (!this.isEmpty()) {
			aux.enqueue((T) this.top());
			this.pop();
		}
		while (!aux.isEmpty()) {
			this.push(aux.getFront());
			aux.dequeue();
		}

	}
}