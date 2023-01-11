package com.ecommerce.core.model;

import java.util.Date;

import jakarta.persistence.*;

@Entity
@Table(name = "ordenes")
public class Orden {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String numero;
	private Date fechaCreacion;
	private Date fechaRecibida;
	private int total;
	
	//Relacion con usuario muchos a uno
	@ManyToOne
	private Usuario usuario;
	
	//Relacion con detalle uno a uno
	@OneToOne(mappedBy = "orden")
	private DetalleOrden detalleOrden;
	
	public DetalleOrden getDetalleOrden() {
		return detalleOrden;
	}
	public void setDetalleOrden(DetalleOrden detalleOrden) {
		this.detalleOrden = detalleOrden;
	}
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
	
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	public Orden(Long id, String numero, Date fechaCreacion, Date fechaRecibida, int total, Usuario usuario,
			DetalleOrden detalleOrden) {
		setId(id);
		setNumero(numero);
		setFechaCreacion(fechaCreacion);
		setFechaRecibida(fechaRecibida);
		setTotal(total);
		setUsuario(usuario);
		setDetalleOrden(detalleOrden);
	}
	public Orden() {
	}
	
	
}
