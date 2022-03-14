package com.phong.dojoninjas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.phong.dojoninjas.models.Dojo;
import com.phong.dojoninjas.models.NinjasModel;
import com.phong.dojoninjas.services.NinjaServices;

@Controller 

public class HomeController {
	@Autowired
	private NinjaServices ninjaServices; 
	
	@GetMapping("/")
	public String index(Model ninjasModel) {
		ninjasModel.addAttribute("ninjaList", ninjaServices.getAllNinjas()); 
		return "dojos.jsp"; 
	}
	
	@GetMapping("/newdojos")
	public String newdojos(@ModelAttribute("newDojo") Dojo dojo){
		return "newdojos.jsp"; 
	}
	
	@PostMapping("/createDojo")
	public String createDojo(@ModelAttribute("newDojo") Dojo dojo) {
		ninjaServices.createDojo(dojo);
		return "redirect:/"; 
		
	}
	
	@GetMapping("/newninja")
	public String newNinjas(@ModelAttribute("newNinja") NinjasModel ninjasModel, Model dojomodel) {
		dojomodel.addAttribute("dojos",ninjaServices.getAllDojo() ); 
		return "newninjas.jsp"; 
	}
	
	@PostMapping("/createNinja")
	public String createNinjaString(@ModelAttribute("newNinja") NinjasModel ninjasModel) {
		ninjaServices.createNinjas(ninjasModel); 
		return "redirect:/"; 
	}

	@GetMapping("/{id}")
	public String showDojoLocation(Model model, @PathVariable("id") Long id) {
		model.addAttribute("dojo", ninjaServices.getSingleDojo(id)); 
		return "dojos.jsp"; 
	}
	
}
