package com.ecommerce.core.model;

public class DetalleOrden {
	private Long id;
	private String nombre;
	private int cantidad;
	private int precio;
	private int total;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public DetalleOrden(Long id, String nombre, int cantidad, int precio, int total) {
		setId(id);
		setNombre(nombre);
		setCantidad(cantidad);
		setPrecio(precio);
		setTotal(total);
	}
	public DetalleOrden() {
	}
}
