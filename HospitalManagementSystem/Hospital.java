package HospitalManagementSystem;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Hospital {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Patient patient1 = new Patient("Preethi", "female", "09-10-1999", "8508608265");
		Patient patient2 = new Patient("Saran", "male", "03-10-2000", "9876567890");
		Patient patient3 = new Patient("Kavitha", "female", "09-04-1979", "9867854345");
		Patient patient4 = new Patient("Muthuvel", "male", "04-05-1970", "7896767678");
		Patient patient5 = new Patient("Kavi", "female", "07-08-1990", "8976879876");
		Patient patient6 = new Patient("Kavi", "female", "09-08-1997", "8976879000");

		Doctor doctor1 = new Doctor("Sara", "Dermatology", "9878987890");
		Doctor doctor2 = new Doctor("Bala", "Cardiology", "8795647321");
		Doctor doctor3 = new Doctor("Kavin", "Oncologist", "8769506879");
		Doctor doctor4 = new Doctor("Pranitha", "Neurologist", "8956435678");
		Doctor doctor5 = new Doctor("Janvi", "Dentist", "9897898967");

		HospitalManagement management = new HospitalManagement();
		management.addPatient(patient1);
		management.addPatient(patient2);
		management.addPatient(patient3);
		management.addPatient(patient4);
		management.addPatient(patient5);
		management.addPatient(patient6);

		management.addDoctor(doctor1);
		management.addDoctor(doctor2);
		management.addDoctor(doctor3);
		management.addDoctor(doctor4);
		management.addDoctor(doctor5);

		int choice;

		do {

			// String patientName=sc.next();
			Scanner sc = new Scanner(System.in);
			System.out.println("1.Enter the patient id");
			// int patientid=sc.nextInt();
			System.out.println("2.Enter the name");
			System.out.println("3.Exit");
			System.out.println("Enter the choice");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				int patientid = sc.nextInt();
				management.getPatientDetailbyId(patientid);
				break;

			case 2:
				String patientName = sc.next();
				management.getPatientDetailByName(patientName);
				break;

			}

		} while (choice <= 2);
		int choice1;

		do {
			Scanner sc = new Scanner(System.in);
			System.out.println("1.Enter the doctor id");

			System.out.println("2.Enter the name");
			System.out.println("3.Exit");
			System.out.println("Enter the choice");
			choice1 = sc.nextInt();
			// String patientName=sc.next();

			switch (choice1) {
			case 1:
				int doctorId = sc.nextInt();
				management.getDoctorDetailbyId(doctorId);
				break;

			case 2:
				String doctorName = sc.next();
				management.getDoctorDetailByName(doctorName);
				break;
			}

		} while (choice1 <= 2);

		// management.doctorScheduleList(doctor1);
		MedicalRecord record1 = new MedicalRecord("Diagnosis1", "Prescription1", "Treatment1");
		management.addMedicalRecord(patient1, record1);
		MedicalRecord record2 = new MedicalRecord("Diagnosis2", "Prescription2", "Treatment2");
		management.addMedicalRecord(patient1, record2);
		MedicalRecord record3 = new MedicalRecord("Diagnosis3", "Prescription3", "Treatment3");
		// management.addMedicalRecord(patient1, record1);
		management.addMedicalRecord(patient2, record3);
		management.addMedicalRecord(patient2, record2);
		// management.displayMedicalRecords();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the patient id");
		int patientId = sc.nextInt();
		management.displaymedicalRecordForPatient(patientId);
		Bill bill1 = new Bill(500, 1000, 2000);
		management.generateBill(patient1, bill1);
		System.out.println("Enter the patientId");
		int patientIdForBill = sc.nextInt();

		management.displayBillpatientIdForBill(patientIdForBill);
		// management.TotalBillforpatientId(patientIdForBill);
		System.out.println("Enter the date");
		String date = sc.next();

		System.out.println("enter the doctor id");
		int doctorId = sc.nextInt();
		Appointments appoinment = new Appointments();
		management.addAvailability(doctor1, "09-01-2024");
		management.addAvailability(doctor2, "10-01-2024");
		/*
		 * appoinment.addAvailability(doctor3,"11-01-2024");
		 * appoinment.addAvailability(doctor4,"12-01-2024");
		 * appoinment.addAvailability(doctor5,"13-01-2024"); //
		 * management.checkAvailability(doctorId,date);
		 */

		System.out.println("Enter the date");
		String datee = sc.next();
		boolean checkAvailability = management.checkAvailability(doctor1, datee);
		Appointments appointment1 = new Appointments(patient1, doctor1, datee);
		if (checkAvailability) {
			management.appoinments(appointment1);
		}

	}
}
