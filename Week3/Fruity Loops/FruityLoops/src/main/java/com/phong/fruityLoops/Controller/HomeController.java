package com.phong.fruityLoops.Controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.phong.fruityLoops.models.Item;


	
	// ... imports (Use shift+ctrl+O or shift+cmd+O to import as you code)
	@Controller
	public class HomeController {
	    
	    @RequestMapping("/")
	    public String index(Model model) {
	        
	        ArrayList<Item> fruits = new ArrayList<Item>();
	        fruits.add(new Item("1. Kiwi", 1.5));
	        fruits.add(new Item("2. Mango", 2.0));
	        fruits.add(new Item("3. Goji Berries", 4.0));
	        fruits.add(new Item("4. Guava", .75));
	        
	        // Add fruits your view model here
	        model.addAttribute("fruits", fruits); 
	        
	        return "index.jsp";
	    }
	}




