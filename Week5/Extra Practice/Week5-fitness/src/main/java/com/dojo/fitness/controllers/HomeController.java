package com.dojo.fitness.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	@GetMapping("/")
	public String index() {
		return "index.jsp";
	}
//	New Trainer - Get & POST routes
	
	
//	New Fitness class - Get & POST routes
	
}
