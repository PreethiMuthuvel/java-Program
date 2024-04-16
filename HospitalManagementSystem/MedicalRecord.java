package HospitalManagementSystem;

public class MedicalRecord {

	String diagnosis;
	String prescription;
	String treatment;
	public MedicalRecord(String diagnosis, String prescription, String treatment) {
		// TODO Auto-generated constructor stub
		this.diagnosis=diagnosis;
		this.prescription=prescription;
		this.treatment=treatment;
	}
	public String getDiagnosis() {
		return diagnosis;
	}
	public void setDiagnosis(String diagnosis) {
		this.diagnosis = diagnosis;
	}
	public String getPrescription() {
		return prescription;
	}
	public void setPrescription(String prescription) {
		this.prescription = prescription;
	}
	public String getTreatment() {
		return treatment;
	}
	public void setTreatment(String treatment) {
		this.treatment = treatment;
	}
	@Override
	public String toString() {
		return "MedicalRecord [diagnosis=" + diagnosis + ", prescription=" + prescription + ", treatment=" + treatment
				+ "]";
	}
	
	
}
