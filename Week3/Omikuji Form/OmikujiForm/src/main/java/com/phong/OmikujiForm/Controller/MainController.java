package com.phong.OmikujiForm.Controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
	@GetMapping("/omikuji")
	public String index() {
		
		return "omikuji.jsp";
	}
 
		 




	@PostMapping(value="/show")
	public String show(@RequestParam int number, @RequestParam String city, 
		String name, String hobby, String livingThing, String saySomething, Model fields, HttpSession inSession) {
		fields.addAttribute("number", number); 
		fields.addAttribute("city", city);
		fields.addAttribute("name", name);
		fields.addAttribute("hobby", hobby);
		fields.addAttribute("livingThing", livingThing);
		fields.addAttribute("saySomething", saySomething);
		
		inSession.setAttribute("number", number);
		inSession.setAttribute("city", city);
		inSession.setAttribute("name", name);
		inSession.setAttribute("hobby", hobby);
		inSession.setAttribute("livingThing", livingThing);
		inSession.setAttribute("saySomething", saySomething);
		

		return "show.jsp";
	}

}
