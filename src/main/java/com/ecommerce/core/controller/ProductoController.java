package com.ecommerce.core.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ecommerce.core.service.ProductoServiceImpl;

@Controller
@RequestMapping(path = {"/productos"})
public class ProductoController {
	@Autowired
	private ProductoServiceImpl psi;
	
	@GetMapping(path = {""})
	public ModelAndView listarProductos() {
		return new ModelAndView("productos/show");
	}
}
