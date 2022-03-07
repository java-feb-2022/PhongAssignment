package com.phong.savetravels.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.phong.savetravels.model.Expense;
import com.phong.savetravels.service.ExpenseService;

@Controller 
public class MainController {
	@Autowired
	private ExpenseService expenseService; 	 	
	
	@GetMapping("/")
	public String index(Model model, @ModelAttribute Expense newExpense) {
		model.addAttribute("expenses", expenseService.getAllExpenses());
		return "index.jsp"; 
	}
	
	
 //get the view and show the info
	//bind the data and send to jsp (@ModelAttribute)
//	@GetMapping("/expenses")
//	public String index(Model viewmodel, @ModelAttribute Expense newExpense) {
//		viewmodel.addAttribute("expAttribute", ExpenseService.getAllExpenses()); 
//		return "index.jsp"; 
//		
//	}


	// 
	// receive the info people type in 
	
	//create 
	@PostMapping("/expense")
	public String newExpense(@Valid @ModelAttribute Expense newExpense, BindingResult result, Model model) {
		//newExpense is just a variable , can be anything. 
		if(result.hasErrors()) {
			model.addAttribute("expenses", expenseService.getAllExpenses()); 
			return "index.jsp"; 
		} else {
			//send the info they typed into service 
			expenseService.createExpense(newExpense); 
			return "redirect:/"; 
		}
		  
	}
	
	//Edit/update
	
	@GetMapping("/edit/{id}")
	public String edit(@PathVariable Long id, Model model) {
		Expense editExpense=expenseService.getExpense(id);  
		model.addAttribute("editExpense", editExpense); 
		return "edit.jsp";
	}
	
	@PutMapping("/update/{id}")
	public String update(@Valid @ModelAttribute Expense editExpense , BindingResult result, Model model, @PathVariable Long id) {
		if(result.hasErrors()) {
			model.addAttribute("editExpense", expenseService.getExpense(id)); 
			return "edit.jsp";  
		}
		expenseService.updateExpense(editExpense); 
		return "redirect:/"; 
		
	}
	
	@DeleteMapping("/delete/{id}")
	public String delete(@PathVariable Long id){
		expenseService.delete(id); 
		return "redirect:/"; 
		
	}
	
	
}
 

	
 
