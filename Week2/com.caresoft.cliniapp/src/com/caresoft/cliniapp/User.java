package com.caresoft.cliniapp;

public class User {
	
	
	
    public User(Integer id) {
		
		this.id = id;
		
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	protected Integer id;
    protected int pin;
    
    
    // TO DO: Getters and setters-DONE 
    // Implement a constructor that takes an ID -DONE


}
