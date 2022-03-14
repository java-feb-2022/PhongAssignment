package com.phong.dojoninjas.services;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.phong.dojoninjas.models.Dojo;

import com.phong.dojoninjas.models.NinjasModel;
import com.phong.dojoninjas.repository.DojoClassRepository;
import com.phong.dojoninjas.repository.NinjaClassRepository;

@Service
public class NinjaServices {
	@Autowired
	private DojoClassRepository dojoClassRepo; 
	@Autowired
	private NinjaClassRepository ninjaClassRepo; 
	
	//List All Dojo
	public List<Dojo>getAllDojo(){
		return dojoClassRepo.findAll();  
	}
	//List All ninja
	public List<NinjasModel>getAllNinjas(){
		return ninjaClassRepo.findAll(); 
	}
	
	//create dojo
	public Dojo createDojo(Dojo dojo) {
		return dojoClassRepo.save(dojo); 
	}
	
	//create ninja 
	public NinjasModel createNinjas(NinjasModel ninjas) {
		return ninjaClassRepo.save(ninjas); 
	}
	
	public Dojo getSingleDojo(Long id) {
		return dojoClassRepo.findById(id).orElse(null); 
	}

}
