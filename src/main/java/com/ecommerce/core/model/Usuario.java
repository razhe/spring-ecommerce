package com.ecommerce.core.model;

import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name = "usuarios")
public class Usuario {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nombre;
	private String usuario;
	private String email;
	private String direccion;
	private String telefono;
	private String tipo;
	private String clave;
	
	//Relacion con producto uno a muchos
	@OneToMany(mappedBy = "usuario")
	private List<Producto> productos;
	
	//Relacion con orden uno a muchos
	@OneToMany(mappedBy = "usuario")
	private List<Orden> ordenes;
	
	
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
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getClave() {
		return clave;
	}
	public void setClave(String clave) {
		this.clave = clave;
	}
	
	public List<Producto> getProductos() {
		return productos;
	}
	public void setProductos(List<Producto> productos) {
		this.productos = productos;
	}
	
	public List<Orden> getOrdenes() {
		return ordenes;
	}
	public void setOrdenes(List<Orden> ordenes) {
		this.ordenes = ordenes;
	}
	public Usuario(Long id, String nombre, String usuario, String email, String direccion, String telefono, String tipo,
			String clave, List<Producto> productos, List<Orden> ordenes) {
		setId(id);
		setNombre(nombre);
		setUsuario(usuario);
		setEmail(email);
		setDireccion(direccion);
		setTelefono(telefono);
		setTipo(tipo);
		setClave(clave);
		setProductos(productos);
		setOrdenes(ordenes);
	}
	public Usuario() {
	}
	
	
}
