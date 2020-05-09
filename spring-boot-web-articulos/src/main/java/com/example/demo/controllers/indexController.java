package com.example.demo.controllers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.models.Articulo;


@Controller

@RequestMapping("/app")
public class indexController {
	
	@GetMapping({"/index"})
	public String index(Model model) {
		model.addAttribute("titulo", "Articulos inicio");
		return "index";
	}
	@RequestMapping("/articulos")
	public String articulos(Model model) {
		model.addAttribute("titulo", "Articulos inicio");
		return "articulos";
	}
	//
	@ModelAttribute("articulos")
	public List<Articulo> setArticulos(Model model) {
		List<Articulo> articulo= Arrays.asList(
				new Articulo("idkdescription",14.3f,"Chevrolet",12,"nose"));
		model.addAttribute("titulo", "Articulos inicio");
		return articulo;
	}
	
}
