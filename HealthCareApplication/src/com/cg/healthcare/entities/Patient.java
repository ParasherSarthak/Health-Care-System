package com.cg.healthcare.entities;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;



public class Patient implements Serializable {

	private static final long serialVersionUID = 1L;

	private int id;

	private String name;

	private String phoneNo;

	private int age;

	private String gender;
	
	private Set<Appointment> appointments=new HashSet<>();
	

	public Patient() {

	}

	public Patient(int id, String name, int age, String gender, String phoneNo) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.phoneNo = phoneNo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Set<Appointment> getAppointments() {
		return appointments;
	}

	public void setAppointments(Set<Appointment> appointments) {
		this.appointments = appointments;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

}
