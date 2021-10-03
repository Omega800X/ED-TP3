package com.example.tp3.punto3;

public enum Estado {
	CRECE("CRECE"), BAJA("BAJA"), ESTAC("ESTAC."), SINESTADO("S/E");
	private final String descripcion;

	private Estado(String descripción) {
		this.descripcion = descripción;
	}

	public String getDescripcion() {
		return descripcion;
	}
}
