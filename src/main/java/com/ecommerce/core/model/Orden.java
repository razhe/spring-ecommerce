package com.ecommerce.core.model;

import java.util.Date;

public class Orden {
	private Long id;
	private String numero;
	private Date fechaCreacion;
	private Date fechaRecibida;
	private int total;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public Date getFechaCreacion() {
		return fechaCreacion;
	}
	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}
	public Date getFechaRecibida() {
		return fechaRecibida;
	}
	public void setFechaRecibida(Date fechaRecibida) {
		this.fechaRecibida = fechaRecibida;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public Orden(Long id, String numero, Date fechaCreacion, Date fechaRecibida, int total) {
		setId(id);
		setNumero(numero);
		setFechaCreacion(fechaCreacion);
		setFechaRecibida(fechaRecibida);
		setTotal(total);
	}
	public Orden() {
	}
	
	
}
