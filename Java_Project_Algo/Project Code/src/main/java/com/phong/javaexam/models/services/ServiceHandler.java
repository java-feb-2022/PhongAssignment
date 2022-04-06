 package com.phong.javaexam.models.services;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.springframework.validation.Errors;

import com.phong.javaexam.controllers.models.ActiveUser;
import com.phong.javaexam.controllers.models.User;
import com.phong.javaexam.repositories.UserRepository;

@Service
public class ServiceHandler {
	
	@Autowired
	private UserRepository userRepo; 
	
	public void validate(User newlyCreatedUser, Errors errors) {
	//pw matching 
		
		 if(!newlyCreatedUser.getPassword().equals(newlyCreatedUser.getConfirm())) {
			errors.rejectValue("password", "Mismatch", "Password does not match");
		
		}
		//check for duplicate 
		
		if(userRepo.findByEmail(newlyCreatedUser.getEmail())!=null) {
			errors.rejectValue("email", "unique","Email is already used"); 
		}
	}
	
	
	
	//hash user pw
	public User registeredUserPw(User newlyCreatedUser) {
		String PwHashed=BCrypt.hashpw(newlyCreatedUser.getPassword(), BCrypt.gensalt());
		newlyCreatedUser.setPassword(PwHashed);
		userRepo.save(newlyCreatedUser);
		return null; 
	}
	
  
	//find user email 
	public User findByEmail(String email) {
		return userRepo.findByEmail(email);   
	}

	//find user id
	public User findByID(Long id) {
		return userRepo.findById(id).orElse(null); 
	}
	
	//Auth user
	public boolean authUser(ActiveUser newActiveUser, Errors errors) {
		User user=userRepo.findByEmail(newActiveUser.getEmail());
		if(user ==null) {
			errors.rejectValue("email", "emailMissing", "Email not registered");
			return false; 
		}else {
			if(!BCrypt.checkpw(newActiveUser.getPassword(),user.getPassword())) {  
				errors.rejectValue("password", "Matches", "Incorrect Password");
				return false; 
			}
		}
		return true; 
	}
	
	public User findUserByID(Long userID) {
		//NEED MORE WORK
		return userRepo.findById(userID).orElse(null); 
	}
	
}
