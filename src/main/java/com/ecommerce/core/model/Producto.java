package com.ecommerce.core.model;

public class Producto {
	private Long id;
	private String nombre;
	private String descripcion;
	private String imagen;
	private int precio;
	private int cantidad;
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
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getImagen() {
		return imagen;
	}
	public void setImagen(String imagen) {
		this.imagen = imagen;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public Producto(Long id, String nombre, String descripcion, String imagen, int precio, int cantidad) {
		setId(id);
		setNombre(nombre);
		setDescripcion(descripcion);
		setImagen(imagen);
		setPrecio(precio);
		setCantidad(cantidad);
	}
	public Producto() {
	}
	
	
}
