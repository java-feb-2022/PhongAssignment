package com.phong.dojoninjas.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


import com.phong.dojoninjas.models.NinjasModel;

@Repository
public interface NinjaClassRepository extends CrudRepository<NinjasModel, Long>{
	List <NinjasModel>findAll(); 

}
