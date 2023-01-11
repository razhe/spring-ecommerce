package com.ecommerce.core.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(path = {"/administrador"})
public class AdministradorController {

	@GetMapping(path = {""})
	public ModelAndView home() {
		return new ModelAndView("administrador/home");
	}
}
