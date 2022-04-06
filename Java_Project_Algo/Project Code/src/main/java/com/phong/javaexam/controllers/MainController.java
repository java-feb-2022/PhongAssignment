package com.phong.javaexam.controllers;

import java.util.List;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.phong.javaexam.controllers.models.ActiveUser;
import com.phong.javaexam.controllers.models.Idea;
import com.phong.javaexam.controllers.models.User;
import com.phong.javaexam.models.services.IdeaService;
import com.phong.javaexam.models.services.ServiceHandler;

@Controller
public class MainController {

	@Autowired
	private ServiceHandler serviceHandler;
	@Autowired
	private HttpSession inSession;
	@Autowired
	private IdeaService ideaService;

	// routing to user registration/login
	@GetMapping("/")
	public String index(@ModelAttribute("newlyCreatedUser") User user,
			@ModelAttribute("newActiveUser") ActiveUser activeUser) {
		return "index.jsp";
	}

	@PostMapping("/registerUser")
	public String registerUser(@Valid @ModelAttribute("newlyCreatedUser") User user, 
			BindingResult result, HttpSession inSession,  
			@ModelAttribute("newActiveUser") ActiveUser activeUser) {
		// validate user
		serviceHandler.validate(user, result);
		if (result.hasErrors()) {
			return "index.jsp";

		}
		// register user
		serviceHandler.registeredUserPw(user);
		// put user in session
		inSession.setAttribute("loggedInUser", user);
		return "redirect:/ideas";
	}

	// login

	@PostMapping("/login")
	public String loginUser(@Valid @ModelAttribute("newActiveUser") ActiveUser activeUser, 
			BindingResult results,
			@ModelAttribute("newlyCreatedUser") User user) {
		serviceHandler.authUser(activeUser, results);
		if (results.hasFieldErrors()) {
			return "index.jsp";
		}
		User loggedInUser = serviceHandler.findByEmail(activeUser.getEmail()); 
		
 				 
		inSession.setAttribute("loggedInUser", loggedInUser);
		return "redirect:/ideas";

	}

	// logout
	@GetMapping("/logout")
	public String logout() {
		inSession.invalidate();
		return "redirect:/";
	}

	// routing to ideas page after login

	@GetMapping("/ideas")
	public String ideas(Model model, HttpSession inSession) {

		if (inSession.getAttribute("loggedInUser") != null) {
			User user = (User) inSession.getAttribute("loggedInUser");
			User currentLoggedIn = serviceHandler.findByID(user.getId());
			model.addAttribute("ideas", ideaService.allIdeas());
			model.addAttribute("currentLoggedIn", currentLoggedIn);
			return "ideas.jsp";
		} else {

			return "redirect:/";

		}
	}
	
	
	@GetMapping("/newIdea")
	public String newIdea(@ModelAttribute("newIdea") Idea idea) {
		if(inSession.getAttribute("loggedInUser")!=null) {
			return "newIdea.jsp"; 
		}
		else {
			return "redirect:/"; 
		}
	}

	@PostMapping("/ideas/new")
	public String newIdea(@Valid @ModelAttribute ("newIdea") Idea idea, BindingResult result) {
		if(result.hasErrors()) {
			return "newidea.jsp";
		}
		else {
			ideaService.createIdea(idea);
			return "redirect:/ideas"; 
		}
	}
	
	 

	//get one idea and delete it
	
	@GetMapping("/ideas/ideaDetails/{id}")
	public String ideaDetails(@PathVariable Long id, Model ideaModel, 
			HttpSession inSession) {
	if (inSession.getAttribute("loggedInUser") != null) {
		 
			Idea userIdea= ideaService.getOneIdea(id);
			ideaModel.addAttribute("idea",userIdea);
			return "ideadetails.jsp"; 
			
	}
	else {
		return "redirect:/"; 
	}
	}
		 
	
	 
	@GetMapping("/ideas/{id}/edit")
	public String edit(@PathVariable Long id,		 
			Model model, HttpSession inSession) {
		if (inSession.getAttribute("loggedInUser") != null)
		{
		Idea editIdea=ideaService.getOneIdea(id); 
		model.addAttribute("editIdea", editIdea); 
		return "editIdea.jsp"; 
	}
	else {
		return "redirect:/"; 
	}
}

		
	//delete idea
		@GetMapping("/delete/{id}")
		
		public String deleteIdea(@PathVariable Long id) {
			if(inSession.getAttribute("loggedInUser")!=null) {
				ideaService.deleteIdea(id);
				return "redirect:/ideas"; 
			}
			else {
				return "redirect:/"; 
			}
		}
	
	@PutMapping("/update/{id}")
	public String updateIdea(@Valid  @ModelAttribute ("editIdea") Idea idea,
			BindingResult result, Model model) {
		if(result.hasErrors()) {
			return "editIdea.jsp"; 
		}else {
			ideaService.updateIdea(idea);
			return "redirect:/ideas";
		}
	}
	
	
	
	
	@GetMapping("/idea/{id}/like")
	public String likeIdea(@PathVariable("id") Long id, HttpSession inSession) {
		if (inSession.getAttribute("loggedInUser") != null) {
		
		Idea idea=ideaService.getOneIdea(id); 
		User user=(User) inSession.getAttribute("loggedInUser"); 
		User Userlike=serviceHandler.findByID(user.getId()); 
		ideaService.likeIdea(idea, Userlike); 
		
		return "redirect:/ideas"; 
	}else {
		return "redirect:/"; 
	}
	}
	
	@GetMapping("/idea/{id}/unlike")
	public String UnLikeIdea(@PathVariable("id") Long id, HttpSession inSession) {
		if (inSession.getAttribute("loggedInUser") != null) {
		
		Idea idea=ideaService.getOneIdea(id); 
		User user=(User)inSession.getAttribute("loggedInUser"); 
		User UserNotLike=serviceHandler.findByID(user.getId()); 
		ideaService.unLikeIdea(idea, UserNotLike); 
		return "redirect:/ideas"; 
	}
		else {
			return "redirect:/"; 
			}
		
		}

}