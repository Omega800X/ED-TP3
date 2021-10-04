package com.example.tp3.punto3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractorRegistrosPrefectura {

	private File archivo;

	public ExtractorRegistrosPrefectura(File archivo) {
		this.archivo = archivo;
	}

	public List<RegistroAlturaRio> obtenerRegistros() throws NumberFormatException, IOException {
		List<RegistroAlturaRio> resultado = new ArrayList<RegistroAlturaRio>();
		Pattern patron = Pattern.compile(
				".*\\\"(Puerto|Río|Ultimo\\sRegistro|Fecha\\sHora|Estado):\\\"(\\sclass=\\\"warning\\\")?>(<b>)?([a-zA-Z\\s\\(\\)\\/\\.]*|\\d+\\.+\\d{2}|\\d{2}\\/[A-Z]{3}\\/\\d{2}\\s-{1}\\s\\d{4})(<b>)?<.*");
		Matcher m;
		String puerto, rio, estado, ultimoRegistro, fechaHora;
		FileInputStream fis = new FileInputStream(archivo);
		InputStreamReader isr = new InputStreamReader(fis, StandardCharsets.UTF_8);
		BufferedReader br = new BufferedReader(isr);
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
					switch (m.group(4)) {
					case "ESTAC.":
						estado = m.group(4).substring(0, 5);
						break;
					case "S/E.":
						estado = "SINESTADO";
						break;
					default:
						estado = m.group(4);
					}
					break;
				}
			}

			if (puerto != null & rio != null & estado != null & ultimoRegistro != null & fechaHora != null) {
				resultado.add(new RegistroAlturaRio(puerto, rio, ultimoRegistro, fechaHora, Estado.valueOf(estado)));
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

}
