package com.user.projects.controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.user.projects.models.LoginUser;
import com.user.projects.models.User;
import com.user.projects.services.UserService;

@Controller
public class HomeController {

	@Autowired
	private UserService userService;

	@GetMapping("/")
	//one is for user registration in DB and one is for the loginUser just help validate if user exist then login (on the landing page) 
	public String index(@ModelAttribute("newUser") User user, @ModelAttribute("newLogin") LoginUser loginUser) {
		return "index.jsp";
	}

// ************Register a User***************
	//click on register -goes into PostMapping 
	@PostMapping("/registration")
	public String registerUser(@Valid @ModelAttribute("newUser") User user, 	BindingResult result, HttpSession session, 
			@ModelAttribute("newLogin") LoginUser loginUser
			) {
//		Validate user
		userService.validate(user, result); 
		if(result.hasErrors()) {
			return "index.jsp"; 
		}
//		Register User
		userService.registerUser(user); 
//		Put User in Session
		session.setAttribute("loggedInUser", user);   //will use loggedUser later on to get info/show info in UI
		
		return "redirect:/dashboard";
	}

//******************Login********************
	@PostMapping("/login")
	public String loginUser(@Valid @ModelAttribute("newLogin") LoginUser loginuser, BindingResult results, HttpSession session, @ModelAttribute("newUser") User user) {
		// Authenticate User
		userService.authenticateUser(loginuser, results); 
		 
		if(results.hasErrors()) {
			return "index.jsp"; 
		}	
		
		
		User loggedInUser= userService.findByEmail(loginuser.getEmail()); 
		
		// Put User in Session
		
		session.setAttribute("loggedInUser", loggedInUser); 
		// session.setAttribute("loggedInUser", user);   //will use loggedUser later on to get info/show info in UI
		 
		return "redirect:/dashboard";
	}

//****************Logout*********************
	@GetMapping("/logout")
	public String logout(HttpSession session) {
		session.invalidate(); 
		
		return "redirect:/";
	}

	
	//check if user is in session
	@GetMapping("/dashboard")
	public String dashboard(HttpSession session) {
//		Check if user is in session
		if (session.getAttribute("loggedInUser")!=null) {
			return "dashboard.jsp"; 
		}
		else {
			return "redirect:/";  
	}
	}

}
