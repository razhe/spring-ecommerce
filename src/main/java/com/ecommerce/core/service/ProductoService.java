package com.ecommerce.core.service;

import java.util.List;
import java.util.Optional;

import com.ecommerce.core.model.Producto;

public interface ProductoService {
	
	abstract Producto guardarProducto(Producto producto);
	abstract List<Producto> listarProductos();
	abstract Optional<Producto> obtenerProducto(Long id);
	abstract void actualizarProducto(Producto producto);
	abstract void borrarProducto(Long id);
}
