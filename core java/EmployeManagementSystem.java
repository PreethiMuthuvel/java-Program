package com.preethi.test;

import java.util.ArrayList;
import java.util.List;

public class EmployeManagementSystem {

	static List<Employe> employeList=new ArrayList<Employe>();
	
	public static void main(String[] args) {
		
		Department department1=new Department("Developer", "D101");
		Department department2=new Department("testing", "T101");
		Department department3=new Department("HR","H1101");
		
		Employe employe1=new Employe("Preethi", 25000, department1);
		Employe employe2=new Employe("saran", 20000, department2);
		Employe employe3=new Employe("kavitha", 35000, department3);
		Employe employe4=new Employe("muthuvel", 55000, department1);
		Employe employe5=new Employe("saranya", 15000, department2);
		Employe employe6=new Employe("dinesh", 65000, department3);
		
		employeList.add(employe1);
		employeList.add(employe2);
		employeList.add(employe3);
		employeList.add(employe4);
		employeList.add(employe5);
		employeList.add(employe6);
		
		EmployeMaximumSalary maximumSalary=new EmployeMaximumSalary();
		maximumSalary.MaximumSalaryByDepartment(employeList);
		
		

	}

}
