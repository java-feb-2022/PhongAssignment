package com.caresoft.cliniapp;

import java.util.ArrayList;
import java.util.Date;


public class Physician extends User implements HIPAACompliantUser {

//... imports class definition...--DONE 
    
    // Inside class:    
    
	
	private ArrayList<String> patientNotes;
	
    
    // TO DO: Constructor that takes an ID-DONE 
    // TO DO: Implement HIPAACompliantUser!-DONE 
	
 


	public Physician(Integer id) {
		super(id);
		// TODO Auto-generated constructor stub
	}


	public void newPatientNotes(String notes, String patientName, Date date) {
        String report = String.format(
            "Datetime Submitted: %s \n", date);
        report += String.format("Reported By ID: %s\n", this.id);
        report += String.format("Patient Name: %s\n", patientName);
        report += String.format("Notes: %s \n", notes);
        this.patientNotes.add(report);
    }


	public ArrayList<String> getPatientNotes() {
		return patientNotes;
	}


	public void setPatientNotes(ArrayList<String> patientNotes) {
		this.patientNotes = patientNotes;
	}


	@Override
	public boolean assignPin(int pin) {
		// TODO Auto-generated method stub
		if (pin < 1000 || pin > 9999) {
			return false;
		}
		this.pin = pin;
		return true; 
	}


	@Override
	public boolean accessAuthorized(Integer confirmedAuthID) {
		// TODO Auto-generated method stub
		if(this.id==confirmedAuthID) {
			return true;
		}
		return false;
	}
	
    // TO DO: Setters & Getters-DONE 

	
}
