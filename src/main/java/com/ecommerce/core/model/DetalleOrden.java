package com.ecommerce.core.model;

import jakarta.persistence.*;

@Entity
@Table(name = "detalles")
public class DetalleOrden {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nombre;
	private int cantidad;
	private int precio;
	private int total;
	
	//Relacion uno a uno con orden
	@OneToOne
	private Orden orden;
	
	//Relacion muchos a uno con producto
	@ManyToOne
	private Producto producto;
	
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
	
	public Orden getOrden() {
		return orden;
	}
	public void setOrden(Orden orden) {
		this.orden = orden;
	}
	
	public Producto getProducto() {
		return producto;
	}
	public void setProducto(Producto producto) {
		this.producto = producto;
	}
	public DetalleOrden(Long id, String nombre, int cantidad, int precio, int total,
			Orden orden, Producto producto) {
		setId(id);
		setNombre(nombre);
		setCantidad(cantidad);
		setPrecio(precio);
		setTotal(total);
		
		setOrden(orden);
		setProducto(producto);
	}
	public DetalleOrden() {
	}
}
