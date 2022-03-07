package com.phong.savetravels.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.phong.savetravels.model.Expense;

@Repository
public interface ExpenseRepository extends CrudRepository<Expense, Long> {
//this method return list of expenses
	List<Expense>findAll(); 
	

}
