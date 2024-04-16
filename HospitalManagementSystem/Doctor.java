package HospitalManagementSystem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Doctor {
	
	private static int id = 1;
	private int doctorId;
	
	String name;
	String specialization;
	String contact;
	
	
	public Doctor(String name, String specialization, String contact) {
		// TODO Auto-generated constructor stub
		this.name=name;
		this.specialization=specialization;
		this.contact=contact;
		doctorId=id++;
		//id++;
		
		
	}
/*	public String day;
	public ArrayList<String> time = new ArrayList<String>();

	Doctor(String day, String[] timeArray) {
		this.day = day;
		for (String availableTime : timeArray) {
			time.add(availableTime);
		}
	}*/
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSpecialization() {
		return specialization;
	}
	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public int getDoctorId() {
		return doctorId;
	}
	public void setDoctorId(int doctorId) {
		this.doctorId = doctorId;
	}
	@Override
	public String toString() {
		return "Doctor [doctorId=" + doctorId + ", name=" + name + ", specialization=" + specialization + ", contact="
				+ contact + "]";
	}
	
	public boolean checkAvailability(Map<Integer, String> checkAvailabilityMap, String datee) {
		// TODO Auto-generated method stub
		if(checkAvailabilityMap.containsKey(this.doctorId)) {
			String date=checkAvailabilityMap.get(this.doctorId);
			if(date.equalsIgnoreCase(datee)) {
				return true;
			}
		}
		return false;
		
	}
	

}
