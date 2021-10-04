package com.example.tp3.punto7;

import com.example.tp3.punto5.ListaDoble;
import com.example.tp3.punto6.IteradorListaDobleInterfaz;

public class ClienteListaDoble {

	public static void main(String[] args) {
		ListaDoble<Integer> lista = new ListaDoble<Integer>();
		System.out.println("isEmpty(): " + lista.isEmpty());
		System.out.println("size(): " + lista.size());
		lista.add(25);
		System.out.println("add(25): " + lista.toString());
		lista.add(62);
		System.out.println("add(62): " + lista.toString());
		lista.add(24);
		System.out.println("add(24): " + lista.toString());
		lista.add(62);
		System.out.println("add(62): " + lista.toString());
		lista.add(73);
		System.out.println("add(73): " + lista.toString());
		Integer get = lista.get(2);
		System.out.println("get(2): " + get);
		lista.remove(62);
		System.out.println("remove(62): " + lista.toString());
		System.out.println("toString(): " + lista.toString());
		
		IteradorListaDobleInterfaz iterador = lista.iterador();
		System.out.println("siguiente(): " + iterador.siguiente().toString());
		System.out.println("existeAnterior(): " + iterador.existeAnterior());
		System.out.println("existeSiguiente(): " + iterador.existeSiguiente());
		System.out.println("siguiente(): " + iterador.siguiente().toString());
		System.out.println("existeAnterior(): " + iterador.existeAnterior());
		System.out.println("anterior(): " + iterador.anterior());
		System.out.println("ultimo(): " + iterador.ultimo());
		System.out.println("existeSiguiente(): " + iterador.existeSiguiente());
		System.out.println("primero(): " + iterador.primero());
	}

}
