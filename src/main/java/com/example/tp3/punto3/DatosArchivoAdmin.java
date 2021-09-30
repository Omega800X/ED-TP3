package com.example.tp3.punto3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DatosArchivoAdmin {

	public List<RegistroAlturaRio> obtenerRegistros(File archivo) throws NumberFormatException, IOException {
		List<RegistroAlturaRio> resultado = new ArrayList<RegistroAlturaRio>();
		Pattern patron = Pattern.compile(
				".*\\\"(Puerto|Río|Ultimo\\sRegistro|Fecha\\sHora|Estado):\\\"(\\sclass=\\\"warning\\\")?>(<b>)?([a-zA-Z\\s\\(\\)]*|\\d+\\.+\\d+\\d+|\\d{2}\\/[A-Z]{3}\\/\\d{2}\\s-{1}\\s\\d{4})(<b>)?<.*");
		Matcher m;
		String puerto, rio, estado, ultimoRegistro, fechaHora;
		BufferedReader br = new BufferedReader(new FileReader(archivo));
		puerto = null;
		rio = null;
		estado = null;
		ultimoRegistro = null;
		fechaHora = null;
		String linea;
		while ((linea = br.readLine()) != null) {
			m = patron.matcher(linea);
			if (m.matches()) {
				switch (m.group(1)) {
				case "Puerto":
					puerto = m.group(4);
					break;
				case "Río":
					rio = m.group(4);
					break;
				case "Ultimo Registro":
					ultimoRegistro = m.group(4);
					break;
				case "Fecha Hora":
					fechaHora = m.group(4).substring(12, 14) + ":" + m.group(4).substring(14, 16) + " "
							+ m.group(4).substring(0, 2) + "/" + m.group(4).substring(3, 6) + "/"
							+ m.group(4).substring(7, 9);
					break;
				case "Estado":
					estado = m.group(4);
					break;
				}
			}

			if (puerto != null & rio != null & estado != null & ultimoRegistro != null & fechaHora != null) {
				resultado
						.add(new RegistroAlturaRio(puerto, rio, Double.parseDouble(ultimoRegistro), fechaHora, Estado.valueOf(estado)));
				puerto = null;
				rio = null;
				estado = null;
				ultimoRegistro = null;
				fechaHora = null;
			}
		}
		br.close();
		return resultado;
	}
	
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
