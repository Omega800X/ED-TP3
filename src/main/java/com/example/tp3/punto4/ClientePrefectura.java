package com.example.tp3.punto4;

import java.io.File;
import java.io.IOException;
import java.util.List;

import com.example.tp3.punto3.RegistrosPrefecturaAdmin;
import com.example.tp3.punto3.Estado;
import com.example.tp3.punto3.ExtractorRegistrosPrefectura;
import com.example.tp3.punto3.RegistroAlturaRio;

public class ClientePrefectura {

	public static void main(String[] args) {
		File archivoPrefectura = new File("src/main/java/com/example/tp3/punto3/prefectura.html");
		ExtractorRegistrosPrefectura ext = new ExtractorRegistrosPrefectura(archivoPrefectura);
		RegistrosPrefecturaAdmin admin = new RegistrosPrefecturaAdmin();

		try {
			List<RegistroAlturaRio> array = ext.obtenerRegistros();
			System.out.println("---------------Registros---------------");
			for (RegistroAlturaRio registro : array) {
				System.out.println(registro.toString());
			}
			
			
			List<RegistroAlturaRio> filtradoPorPuerto = admin.filtrarPorPuerto("Gualeguaychu", array);
			List<RegistroAlturaRio> filtradoPorRio = admin.filtrarPorRio("PARANA", array);
			List<RegistroAlturaRio> filtradoPorEstadoCrece = admin.filtrarPorEstado(Estado.CRECE, array);
			List<RegistroAlturaRio> filtradoPorEstadoBaja = admin.filtrarPorEstado(Estado.BAJA, array);
			List<RegistroAlturaRio> filtradoPorEstadoEstac = admin.filtrarPorEstado(Estado.ESTAC, array);
			List<RegistroAlturaRio> filtradoPorAusenciaEstado = admin.filtrarPorEstado(Estado.SINESTADO, array);

			System.out.println("---------------Registros filtrados por puerto---------------");
			for (var reg : filtradoPorPuerto) {
				System.out.println(reg);
			}
			System.out.println("---------------Registros filtrados por río---------------");
			for (var reg : filtradoPorRio) {
				System.out.println(reg);
			}
			System.out.println("---------------Registros filtrados por estado de crecimiento---------------");
			for (var reg : filtradoPorEstadoCrece) {
				System.out.println(reg);
			}
			System.out.println("---------------Registros filtrados por estado de decrecimiento---------------");
			for (var reg : filtradoPorEstadoBaja) {
				System.out.println(reg);
			}
			System.out.println("---------------Registros filtrados por estado estacionario---------------");
			for (var reg : filtradoPorEstadoEstac) {
				System.out.println(reg);
			}
			System.out.println("---------------Registros filtrados por ausencia de estado---------------");
			for (var reg : filtradoPorAusenciaEstado) {
				System.out.println(reg);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
