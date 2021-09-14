package com.example.tp3.punto2;

import com.example.tp3.punto1.ValidadorTelefonoMovil;

public class ClienteValidadorTelefonoMovil {
	public static void main(String[] args) {
		String patron = "([+]549)?[(]?0?(345)[)]? ?(15)?4{1}(\\d{6})";
		ValidadorTelefonoMovil validador = new ValidadorTelefonoMovil(patron);
		System.out.println("Patrón: " + validador.getPatron());
		String[] numeros = {"(0345) 154123456", "+5493454123456", "3454123456", "+54011123456", "34564123456"};
		for(var num : numeros) {
			System.out.println(num + ":");
			validador.validarNumero(num);
		}
		
	}
}
