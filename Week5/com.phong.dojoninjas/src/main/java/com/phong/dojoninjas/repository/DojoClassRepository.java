package com.phong.dojoninjas.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.phong.dojoninjas.models.Dojo;

@Repository
public interface DojoClassRepository extends CrudRepository<Dojo, Long>{
	List<Dojo>findAll(); 
	

}
