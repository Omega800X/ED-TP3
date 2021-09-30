package com.example.tp3.punto3;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class ClientePrefectura {

	public static void main(String[] args) {
		File archivoPrefectura = new File("prefectura.txt");
		DatosArchivoAdmin admin = new DatosArchivoAdmin();

		try {
			List<RegistroAlturaRio> array = admin.obtenerRegistros(archivoPrefectura);
			System.out.println("---------------Registros---------------");
			for (RegistroAlturaRio registro : array) {
				System.out.println(registro.toString());
			}
			
			
			List<RegistroAlturaRio> filtradoPorPuerto = admin.filtrarPorPuerto("Gualeguaychu", array);
			List<RegistroAlturaRio> filtradoPorRio = admin.filtrarPorRio("PARANA", array);
			List<RegistroAlturaRio> filtradoPorEstadoCrece = admin.filtrarPorEstado(Estado.CRECE, array);
			List<RegistroAlturaRio> filtradoPorEstadoBaja = admin.filtrarPorEstado(Estado.BAJA, array);

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
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
