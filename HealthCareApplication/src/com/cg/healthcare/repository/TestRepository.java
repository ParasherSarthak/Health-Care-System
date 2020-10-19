package com.cg.healthcare.repository;

import com.cg.healthcare.entities.DiagnosticTest;

public interface TestRepository{
	DiagnosticTest findBytestName(String testName);
}
