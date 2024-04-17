package com.preethi.test;

public class Employe  {
	String name;
	double salary;
	Department department;
	
	Employe(String name,double salary,Department department){
		
		this.name=name;
		this.salary=salary;
		this.department=department;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

/*	@Override
	public int compareTo(Employe o) {
		
		return Double.compare(this.salary,o.getSalary());
	}*/

	@Override
	public String toString() {
		return "Employe [name=" + name + ", salary=" + salary + ", department=" + department + "]";
	}
	
	

}
