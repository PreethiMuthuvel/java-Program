package HospitalManagementSystem;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import SocialNetworkingSystem.Post;

public class HospitalManagement {

	Map<Integer, Patient> patientMap = new HashMap<Integer, Patient>();
	Map<Integer, Doctor> doctorMap = new HashMap<Integer, Doctor>();
	List<Patient> patientList = new ArrayList<Patient>();
	List<Doctor> doctorList = new ArrayList<Doctor>();
	Map<Integer, List<MedicalRecord>> medicalRecordMap = new HashMap<Integer, List<MedicalRecord>>();
	Map<Integer, List<Bill>> billGenerateMap = new HashMap<Integer, List<Bill>>();
	Map<Integer,String> checkAvailabilityMap=new HashMap<Integer,String>();
	Map<Integer, Appointments> appoinmentsMap = new HashMap<Integer, Appointments>();


	// HospitalManagement hospitalManagement=new HospitalManagement();
//	Appointments appointment = new Appointments();

	public void addPatient(Patient patient) {
		// TODO Auto-generated method stub
		patientMap.put(patient.getPatientId(), patient);

	}

	public void addDoctor(Doctor doctor) {
		// TODO Auto-generated method stub
		doctorMap.put(doctor.getDoctorId(), doctor);
		System.out.println(doctorMap.toString());

	}

	/*
	 * public void getdetail(int patientid) { // TODO Auto-generated method stub
	 * if(patientMap.containsKey(patientid)) { Patient
	 * patientss=patientMap.get(patientid); System.out.println(patientss); }
	 */

	public void getPatientDetailbyId(int patientid) {
		// TODO Auto-generated method stub
		if (patientMap.containsKey(patientid)) {
			Patient patient = patientMap.get(patientid);
			System.out.println(patient);
		}
	}

	public void getPatientDetailByName(String patientName) {
		// TODO Auto-generated method stub
		for (Map.Entry<Integer, Patient> entry : patientMap.entrySet()) {

			Patient patient = entry.getValue();
			if (patient.getName().equalsIgnoreCase(patientName)) {
				patientList.add(patient);
				System.out.println(patientList);
			}

		}

	}

	public void getDoctorDetailbyId(int doctorId) {
		// TODO Auto-generated method stub

		if (doctorMap.containsKey(doctorId)) {
			Doctor doctor = doctorMap.get(doctorId);
			System.out.println(doctor);

		}
	}

	public void getDoctorDetailByName(String doctorName) {
		// TODO Auto-generated method stub
		for (Map.Entry<Integer, Doctor> entry : doctorMap.entrySet()) {

			Doctor doctor = entry.getValue();
			if (doctor.getName().equalsIgnoreCase(doctorName)) {
				doctorList.add(doctor);
				System.out.println(doctorList);
			}

		}

	}

	public void addMedicalRecord(Patient patient, MedicalRecord record) {
		// TODO Auto-generated method stub

		List<MedicalRecord> records = medicalRecordMap.getOrDefault(patient.getPatientId(),
				new ArrayList<MedicalRecord>());
		records.add(record);

		medicalRecordMap.put(patient.getPatientId(), records);
		System.out.println(medicalRecordMap.toString());

	}

	public void displaymedicalRecordForPatient(int patientId) {
		// TODO Auto-generated method stub

		if (medicalRecordMap.containsKey(patientId)) {
			List<MedicalRecord> medicalRecords = medicalRecordMap.get(patientId);
			for (MedicalRecord medicalRecordd : medicalRecords) {
				// System.out.println("jhddbefg");
				System.out.println(patientId + " " + medicalRecordd);

			}
		}

	}

	public void generateBill(Patient patient, Bill bill) {
		// TODO Auto-generated method stub
		List<Bill> bills = billGenerateMap.getOrDefault(patient.getPatientId(), new ArrayList<Bill>());
		bills.add(bill);

		billGenerateMap.put(patient.getPatientId(), bills);
		System.out.println(billGenerateMap.toString());
	}

	public void displayBillpatientIdForBill(int patientIdForBill) {
		// TODO Auto-generated method stub
		if (billGenerateMap.containsKey(patientIdForBill)) {
			List<Bill> bills = billGenerateMap.get(patientIdForBill);
			for (Bill billForPatient : bills) {
				// System.out.println("jhddbefg");
				System.out.println(patientIdForBill + " " + billForPatient);
				 double total=billForPatient.getDoctorConsultation()+billForPatient.getTest()+billForPatient.getTreatments();
				System.out.print(total);

			}
		}

	}
	//List<Doctor> scheduleList=new ArrayList<Doctor>();

	public void addAvailability(Doctor doctor, String date) {
		// TODO Auto-generated method stub
		checkAvailabilityMap.put(doctor.getDoctorId(), date);
		
	}

	public boolean checkAvailability(Doctor doctor, String datee) {
		// TODO Auto-generated method stub
		/*if(checkAvailabilityMap.containsKey(doctor.getDoctorId())) {
			String date=checkAvailabilityMap.get(doctor.getDoctorId());
			if(date.equalsIgnoreCase(datee)) {
				return true;
			}
		}*/
		boolean check=doctor.checkAvailability(checkAvailabilityMap,datee);
		
		return check;
	}

	
	public void appoinments(Appointments appointment) {
		
		appoinmentsMap.put(appointment.getDoctor().getDoctorId(), appointment);
		System.out.println(appoinmentsMap.toString());
		
	}
	

	



	
	
}