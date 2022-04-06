package com.user.projects.services;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.Errors;

import com.user.projects.models.LoginUser;
import com.user.projects.models.User;
import com.user.projects.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepo;

	// Validate User for - Duplicate email and password mismatch
	public void validate(User newUser, Errors errors) { //Error will come from controller 
		//check password
		if(!newUser.getPassword().equals(newUser.getConfirm())) {
			errors.rejectValue("password", "Mismatch", "Password does not match!!");
		}
		//Check for duplicate email
		if(userRepo.findByEmail(newUser.getEmail())!=null) { // pass l@gmail , and it's already there, if it return something l@gmail is already taken
		errors.rejectValue("email", "unique", "Email is already taken!");
		}
		
	}

	// Hash user's password and add to database
	public User registerUser(User newUser) {
		String hashedPass=BCrypt.hashpw(newUser.getPassword(), BCrypt.gensalt());  //get the pw and hash it. 
		newUser.setPassword(hashedPass);
		userRepo.save(newUser);
		return null;
	}

	// find user by provided email
	public User findByEmail(String email) {
		return userRepo.findByEmail(email);  
	}

	// find user by id
	public User findById(Long id) {
		return userRepo.findById(id).orElse(null); 
	}

	// Authenticate user (If everything is true ---then return true, otherwise it's false and return message
	public boolean authenticateUser(LoginUser newLogin, Errors errors) {
		// first find the user by email
		User user= userRepo.findByEmail(newLogin.getEmail());
		//if we can't find user's email, return false
		if(user==null) {
		errors.rejectValue("email", "missingEmail", "Email not found!"); 
		return false; 
	}else {
		//if this is the case -return false and display message otherwise return true
		if(!BCrypt.checkpw(newLogin.getPassword(), user.getPassword())) {
		    errors.rejectValue("password", "Matches", "Invalid Password!");
		    return false; 
		}
	}	
		// if we can't find user by email, return false
			// if user is found check if the passwords match, return true, else, return false
		return true;
	}

}
