package com.cg.healthcare.service;

import java.util.Date;
import java.util.Set;

import com.cg.healthcare.entities.Appointment;

public interface IAppointmentService {
	Appointment addAppointment(Appointment appointment)	throws Exception;
	Appointment cancelAppointment(Appointment appointment);
	Set<Appointment> viewAppointments(String username) throws Exception;
	Appointment viewMyAppointment(int appointmentId) throws Exception;
	Appointment updateAppointment(Appointment appointment) throws Exception;
	Set<Appointment>viewAppointmentsDatewise(Date date) throws Exception;
}
