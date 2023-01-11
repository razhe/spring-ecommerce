package com.ecommerce.core.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.core.model.Producto;
import com.ecommerce.core.repository.ProductoRepository;

@Service
public class ProductoServiceImpl implements ProductoService {

	@Autowired
	private ProductoRepository pr;
	
	@Override
	public Producto guardarProducto(Producto producto) {
		return pr.save(producto);
	}

	@Override
	public Optional<Producto> obtenerProducto(Long id) {
		return pr.findById(id);
	}

	@Override
	public void actualizarProducto(Producto producto) {
		pr.save(producto);
	}

	@Override
	public void borrarProducto(Long id) {
		pr.deleteById(id);
	}

	@Override
	public List<Producto> listarProductos() {
		List<Producto> productos = pr.findAll();
		return productos;
	}

}
