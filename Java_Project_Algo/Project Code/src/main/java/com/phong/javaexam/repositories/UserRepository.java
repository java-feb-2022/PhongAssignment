package com.phong.javaexam.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.phong.javaexam.controllers.models.User;

@Repository
public interface UserRepository extends CrudRepository <User, Long> {
	User findByEmail(String email); 

}
