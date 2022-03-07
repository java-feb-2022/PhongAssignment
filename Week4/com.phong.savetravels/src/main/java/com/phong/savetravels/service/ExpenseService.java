package com.phong.savetravels.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.phong.savetravels.model.Expense;
import com.phong.savetravels.repository.ExpenseRepository;

@Service
public class ExpenseService {
	@Autowired
	private ExpenseRepository expenseRepo;

	
 
	
	public List<Expense> getAllExpenses()  {
		return expenseRepo.findAll(); 
	}
	
	//create expense
	
	public Expense createExpense(Expense newExpense) {
		return expenseRepo.save(newExpense); 
	}
	
	
 

	public Expense updateExpense(Expense expense) { 
		return expenseRepo.save(expense); 
	}
	
	//Get expense
	public Expense getExpense(Long id) {
		return expenseRepo.findById(id).orElse(null); 
	}
	
	//delete expense
	public void delete(Long id ) {
		expenseRepo.deleteById(id);
		
	}

}
