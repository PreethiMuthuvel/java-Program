package HospitalManagementSystem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Appointments {

	Patient patient;
	Doctor doctor;
	String datee;

	
	public Appointments(Patient patient, Doctor doctor, String datee) {
		// TODO Auto-generated constructor stub
		this.patient = patient;
		this.doctor = doctor;
		this.datee = datee;

	}


	public Appointments() {
		// TODO Auto-generated constructor stub
	}


	public Patient getPatient() {
		return patient;
	}


	public void setPatient(Patient patient) {
		this.patient = patient;
	}


	public Doctor getDoctor() {
		return doctor;
	}


	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}


	public String getDatee() {
		return datee;
	}


	public void setDatee(String datee) {
		this.datee = datee;
	}


	@Override
	public String toString() {
		return "Appointments [patient=" + patient + ", doctor=" + doctor + ", datee=" + datee + "]";
	}



	

}
