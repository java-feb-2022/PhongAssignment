package com.user.projects.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.user.projects.models.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

	//check email should be unique when user click register , email should not be in DB.  Pass the email/and look in db and validate 
  User findByEmail(String email);
    
}