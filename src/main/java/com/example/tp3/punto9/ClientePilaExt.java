package com.example.tp3.punto9;

import com.example.tp3.punto8.PilaExtImp;

public class ClientePilaExt {
	public static void main(String[] args) {
		PilaExtImp<Integer> pila = new PilaExtImp();
		PilaExtImp<Integer> pila2 = new PilaExtImp();
		PilaExtImp<Integer> pila3 = new PilaExtImp();
		PilaExtImp<Integer> pila4 = new PilaExtImp();

		pila.push(1);
		pila.push(2);
		pila.push(3);
		pila.push(4);
		// -------------
		pila2.push(5);
		pila2.push(6);
		pila2.push(7);
		pila2.push(8);
		// -------------
		pila3.push(9);
		pila3.push(10);
		pila3.push(11);
		pila3.push(12);
		pila4.push(35);
		// -------------
		pila4.push(1);
		pila4.push(2);
		pila4.push(3);
		pila4.push(4);

		System.out.println("Pila1: " + pila.toString());
		System.out.println("\n");
		System.out.println("despues de agregar todos los elementos de pila 1 en pila2");
		pila.agregarTodos(pila2);
		System.out.println("");
		System.out.println(pila.toString());

		pila.invertirOrden();
		System.out.println("pila invertida");
		System.out.println(pila.toString());

		System.out.println("\n");
		pila4.intercalar(pila3);
		System.out.println("Nueva Pila: " + pila4.toString());

	}
}
