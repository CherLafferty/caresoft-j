package com.caresoft.clinicapp;

import java.util.ArrayList;
import java.util.Date;

public abstract class Physician extends User implements HIPAACompliantUser {

	// Inside class:
	private ArrayList<String> patientNotes;

	// TO DO: Constructor that takes an ID
	public Physician(Integer id) {
		super(id);
	}
	
	
	// TO DO: Implement HIPAACompliantUser!
	public void newPatientNotes(String notes, String patientName, Date date) {
		String report = String.format("Datetime Submitted: %s \n", date);
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
	
//	@Override
//	public ArrayList<String> reportSecurityIncidents() {
//		// TODO Auto-generated method stub
//		return null;
//	}
	
}
