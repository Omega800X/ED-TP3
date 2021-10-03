package com.example.tp3.punto3;

import java.util.ArrayList;
import java.util.List;


public class RegistrosPrefecturaAdmin {

	
	public List<RegistroAlturaRio> filtrarPorPuerto(String nombrePuerto, List<RegistroAlturaRio> registros) {
		List<RegistroAlturaRio> resultado = new ArrayList<RegistroAlturaRio>();
		for (var registro : registros) {
			if (nombrePuerto.equalsIgnoreCase(registro.getPuerto())) {
				resultado.add(registro);
			}
		}
		return resultado;
	}
	
	public List<RegistroAlturaRio> filtrarPorRio(String rio, List<RegistroAlturaRio> registros) {
		List<RegistroAlturaRio> resultado = new ArrayList<RegistroAlturaRio>();
		for (var registro : registros) {
			if (rio.equalsIgnoreCase(registro.getRio())) {
				resultado.add(registro);
			}
		}
		return resultado;
	}
	
	public List<RegistroAlturaRio> filtrarPorEstado(Estado estado, List<RegistroAlturaRio> registros) {
		List<RegistroAlturaRio> resultado = new ArrayList<RegistroAlturaRio>();
		for (var registro : registros) {
			if (estado == registro.getEstado()) {
				resultado.add(registro);
			}
		}
		return resultado;
	}
}
