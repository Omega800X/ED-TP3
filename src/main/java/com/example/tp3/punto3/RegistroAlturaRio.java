package com.example.tp3.punto3;

public class RegistroAlturaRio {
	private String puerto;
	private String rio;
	private String ultimoReg;
	private String fechaHora;
	private Estado estado;

	public RegistroAlturaRio(String puerto, String rio, String ultimoReg, String fechaHora, Estado estado) {
		this.puerto = puerto;
		this.rio = rio;
		this.ultimoReg = ultimoReg;
		this.fechaHora = fechaHora;
		this.estado = estado;
	}

	public String getPuerto() {
		return puerto;
	}

	public void setPuerto(String puerto) {
		this.puerto = puerto;
	}

	public String getRio() {
		return rio;
	}

	public void setRio(String rio) {
		this.rio = rio;
	}

	public String getUltimoReg() {
		return ultimoReg;
	}

	public void setUltimoReg(String ultimoReg) {
		this.ultimoReg = ultimoReg;
	}

	public String getFechaHora() {
		return fechaHora;
	}

	public void setFechaHora(String fechaHora) {
		this.fechaHora = fechaHora;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("--------------------");
		builder.append("\n");
		builder.append("Registro Altura Rio");
		builder.append("\n");
		builder.append("puerto: ");
		builder.append(puerto);
		builder.append("\n");
		builder.append("río: ");
		builder.append(rio);
		builder.append("\n");
		builder.append("último registro: ");
		builder.append(ultimoReg);
		builder.append("\n");
		builder.append("fecha y hora: ");
		builder.append(fechaHora);
		builder.append("\n");
		builder.append("estado: ");
		builder.append(estado.getDescripcion());
		builder.append("\n");
		builder.append("--------------------");
		return builder.toString();
	}

}
