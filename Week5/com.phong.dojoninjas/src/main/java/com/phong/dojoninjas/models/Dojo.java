package com.phong.dojoninjas.models;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "dojo_name")

public class Dojo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id; 
	private String name;
	private Date createAt; 
	private Date updateAt;
	 
	//
	@OneToMany(mappedBy = "dojo", fetch = FetchType.LAZY)
	private List<NinjasModel>ninjasClasses; 
	
	
	public Date getCreateAt() {
		return createAt;
	}

	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}

	public Date getUpdateAt() {
		return updateAt;
	}

	public void setUpdateAt(Date updateAt) {
		this.updateAt = updateAt;
	}

	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<NinjasModel> getNinjas() {
		return ninjasClasses;
	}

	public void setNinjas(List<NinjasModel> ninjas) {
		this.ninjasClasses = ninjas;
	} 
	
	
	
	

}
