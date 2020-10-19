package com.cg.healthcare.repository;

import java.util.Set;

import com.cg.healthcare.entities.Appointment;

public interface AppointmentRepository{
	Appointment makeAppointment(Appointment appointment, String username, int testId, int diagnosticCenterId)
			throws Exception;
	Set<Appointment> viewAppointments(String username) throws Exception;
	Appointment viewAppointment(int appointmentId) throws Exception;
}
