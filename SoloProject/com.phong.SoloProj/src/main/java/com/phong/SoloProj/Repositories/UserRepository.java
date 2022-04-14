package com.phong.SoloProj.Repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.phong.SoloProj.Models.User;

@Repository
public interface UserRepository  extends CrudRepository <User, Long> {
	User findByEmail(String email);  

}
