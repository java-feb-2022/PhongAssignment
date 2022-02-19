package com.caresoft.cliniapp;

public interface HIPAACompliantUser {
	
	
	abstract boolean assignPin(int pin);
	abstract boolean accessAuthorized(Integer confirmedAuthID);
	


}
