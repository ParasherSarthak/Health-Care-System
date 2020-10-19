package com.cg.healthcare.service;

import java.util.List;

import com.cg.healthcare.entities.Patient;
public interface IPatientService {

	public Patient getPatientByUserName(String patientUserName);
	 public Patient addPatient(Patient patient);
	 public Patient removePatient(Patient patient);
	 public List<Patient> ViewAllPatients();
	 public List<Patient> viewAllPatientCenterwise(int centerid);
}