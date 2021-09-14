package com.example.tp3.punto1;

public class ValidadorTelefonoMovil {
	private String patron;

	public ValidadorTelefonoMovil() {
		this.patron = "";
	}
	
	public ValidadorTelefonoMovil(String patron) {
		this.patron = patron;
	}
	
	public void validarNumero(String numero) {
		if (numero.matches(patron)) {
			System.out.println("El número es válido.");
		} else {
			System.out.println("El número es inválido.");
		}
	}

	public String getPatron() {
		return patron;
	}

	public void setPatron(String patron) {
		this.patron = patron;
	}

	@Override
	public String toString() {
		return "ValidadorTelefonoMovil:" + "\n" +  "Patrón:" + patron + ".";
	}
	
	
}
