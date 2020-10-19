package com.cg.healthcare.entities;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;


public class DiagnosticCenter implements Serializable {
	private static final long serialVersionUID = 1L;
	private int id;

	private String name;

	private String contactNo;

	private String address;

	private String contactEmail;
	
	private String servicesOffered;		
	private Set<DiagnosticTest> tests = new HashSet<>();



	public DiagnosticCenter() {

	}
	
	

	public DiagnosticCenter(int id, String name, String contactNo, String address, String contactEmail,
			String servicesOffered) {
		this.id = id;
		this.name = name;
		this.contactNo = contactNo;
		this.address = address;
		this.contactEmail = contactEmail;
		this.servicesOffered = servicesOffered;
	}



	public DiagnosticCenter(String name, String contactNo, String address, String contactEmail, String servicesOffered) {
		this.address = address;
		this.contactEmail = contactEmail;
		this.contactNo = contactNo;
		this.name = name;
		this.servicesOffered = servicesOffered;
	}

	public String getServicesOffered() {
		return servicesOffered;
	}
	
	public void setServicesOffered(String servicesOffered) {
		this.servicesOffered = servicesOffered;
	}


	public Set<DiagnosticTest> getTests() {
		return tests;
	}

	public void setTests(Set<DiagnosticTest> tests) {
		this.tests = tests;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContactNo() {
		return contactNo;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getContactEmail() {
		return contactEmail;
	}

	public void setContactEmail(String contactEmail) {
		this.contactEmail = contactEmail;
	}

}
