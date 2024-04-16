package HospitalManagementSystem;

public class Bill {
	private static int billId = 1;
	private int billIdd;
	
    double doctorConsultation;
	double test;
	double treatments;
	public Bill(double doctorConsultation, double test, double treatments) {
		// TODO Auto-generated constructor stub
		this.doctorConsultation=doctorConsultation;
		this.test=test;
		this.treatments=treatments;
		billIdd=billId++;
		
	}
	public double getDoctorConsultation() {
		return doctorConsultation;
	}
	public void setDoctorConsultation(double doctorConsultation) {
		this.doctorConsultation = doctorConsultation;
	}
	public double getTest() {
		return test;
	}
	public void setTest(double test) {
		this.test = test;
	}
	public double getTreatments() {
		return treatments;
	}
	public void setTreatments(double treatments) {
		this.treatments = treatments;
	}
	@Override
	public String toString() {
		return "Bill [billIdd=" + billIdd + ", doctorConsultation=" + doctorConsultation + ", test=" + test
				+ ", treatments=" + treatments + "]";
	}
	
	
}
