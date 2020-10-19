package com.cg.healthcare.entities;

import java.io.Serializable;
import java.time.LocalDate;

public class Appointment implements Serializable{
	
	
	private int id;
	
	private LocalDate appointmentDate;
	
	private int approvalStatus; // 0 - Pending 1 - Approved 2 - Rejected
	
	private String diagnosis;
	
	private String symptoms;
	
	private DiagnosticTest diagnosticTest;
	
	private Patient patient;
	
	private DiagnosticCenter diagnosticCenter;
	
	private TestResult testResult;
	
	public Appointment()
	{
		
	}
	

	public Appointment(int id, LocalDate appointmentDate, int approvalStatus, String diagnosis, String symptoms, Patient patient, DiagnosticCenter diagnosticCenter) {
		this.id = id;
		this.appointmentDate = appointmentDate;
		this.approvalStatus = approvalStatus;
		this.diagnosis = diagnosis;
		this.symptoms = symptoms;
		this.patient = patient;
		this.diagnosticCenter = diagnosticCenter;
	}

	
	public Appointment(int id, LocalDate appointmentDate, String diagnosis, String symptoms, DiagnosticTest diagnosticTest,
			Patient patient, DiagnosticCenter diagnosticCenter) {
		super();
		this.id = id;
		this.appointmentDate = appointmentDate;
		this.diagnosis = diagnosis;
		this.symptoms = symptoms;
		this.diagnosticTest = diagnosticTest;
		this.patient = patient;
		this.diagnosticCenter = diagnosticCenter;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	

	public LocalDate getAppointmentDate() {
		return appointmentDate;
	}

	public void setAppointmentDate(LocalDate appointmentDate) {
		this.appointmentDate = appointmentDate;
	}

	public int getApprovalStatus() {
		return approvalStatus;
	}

	public void setApprovalStatus(int approvalStatus) {
		this.approvalStatus = approvalStatus;
	}

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	public String getDiagnosis() {
		return diagnosis;
	}

	public void setDiagnosis(String diagnosis) {
		this.diagnosis = diagnosis;
	}

	public String getSymptoms() {
		return symptoms;
	}

	public void setSymptoms(String symptoms) {
		this.symptoms = symptoms;
	}

	public DiagnosticCenter getDiagnosticCenter() {
		return diagnosticCenter;
	}

	public void setDiagnosticCenter(DiagnosticCenter diagnosticCenter) {
		this.diagnosticCenter = diagnosticCenter;
	}


	public DiagnosticTest getDiagnosticTest() {
		return diagnosticTest;
	}


	public void setDiagnosticTest(DiagnosticTest diagnosticTest) {
		this.diagnosticTest = diagnosticTest;
	}

	public TestResult getTestResult() {
		return testResult;
	}


	public void setTestResult(TestResult testResult) {
		this.testResult = testResult;
	}


	@Override
	public String toString() {
		return "Appointment [id=" + id + ", appointmentDate=" + appointmentDate + ", approvalStatus=" + approvalStatus
				+ ", diagnosis=" + diagnosis + ", symptoms=" + symptoms + ", patient=" + patient + "]";
	}
	
	
	
	
}