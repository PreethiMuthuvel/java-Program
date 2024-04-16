package HospitalManagementSystem;

public class Patient {
	private static int id = 1;
	private int patientId;
	private String name;
	private String gender;
	private String dateOfBirth;
	private String contact;
	public Patient(String name, String gender, String dateOfBirth, String contact) {
		// TODO Auto-generated constructor stub
		this.name=name;
		this.gender=gender;
		this.dateOfBirth=dateOfBirth;
		this.contact=contact;
		patientId = id++;
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	
	public int getPatientId() {
		return patientId;
	}
	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}
	@Override
	public String toString() {
		return "Patient [patientId=" + patientId + ", name=" + name + ", gender=" + gender + ", dateOfBirth="
				+ dateOfBirth + ", contact=" + contact + "]";
	}
	
	
	
	
}
