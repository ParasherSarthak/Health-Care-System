package com.cg.healthcare.entities;

import java.io.Serializable;
import java.sql.Timestamp;


public class WaitingPatient implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private int id;
	
	private Appointment appointment;
	
	private Timestamp requestedOn;
	
	private String type;
	
	public WaitingPatient() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Appointment getAppointment() {
		return appointment;
	}

	public void setAppointment(Appointment appointment) {
		this.appointment = appointment;
	}

	public Timestamp getRequestedOn() {
		return requestedOn;
	}

	public void setRequestedOn(Timestamp requestedOn) {
		this.requestedOn = requestedOn;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}	
	
	
	
}
