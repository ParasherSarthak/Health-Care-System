package com.cg.healthcare.service;

import java.util.List;

import com.cg.healthcare.entities.DiagnosticCenter;

public interface IDiagnosticCenterService {

	public DiagnosticCenter getDiagnosticCenterByUsername(String diagnosticCenterUsername);
	public DiagnosticCenter addDiagnosticCenter(DiagnosticCenter center);
	public DiagnosticCenter removeDiagnosticCenter(int centerid);
	public DiagnosticCenter updateDiagnosticCenter(DiagnosticCenter center);
	public List<DiagnosticCenter> viewAllCenters();
	public List<DiagnosticCenter> viewAllCenterLocationwise(String location);
	
}