package com.ecommerce.core.controller;

import org.slf4j.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ecommerce.core.model.Producto;
import com.ecommerce.core.model.Usuario;
import com.ecommerce.core.service.ProductoService;

@Controller
@RequestMapping(path = {"/productos"})
public class ProductoController {
	@Autowired
	private ProductoService ps;
	
	//Para depurar(?
	private final Logger LOGGER = LoggerFactory.getLogger(ProductoController.class);
	
	@GetMapping(path = {""})
	public ModelAndView listarProductos() {
		return new ModelAndView("productos/show");
	}
	@GetMapping(path = {"/crear"})
	public String crearProducto() {
        return "productos/create";
	}
	@PostMapping(path = {"/guardar"})
	public String guardarProducto(Producto producto) {
		LOGGER.info(producto.toString());
		Usuario usr = new Usuario();
		usr.setId((long) 1);
		
		producto.setUsuario(usr);
		ps.guardarProducto(producto);
		return "redirect:/productos";
	}
}
