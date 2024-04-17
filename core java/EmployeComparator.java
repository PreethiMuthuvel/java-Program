package com.preethi.test;

import java.util.Comparator;

public class EmployeComparator implements  Comparator<Employe>{

	@Override
	public int compare(Employe o1, Employe o2) {
		 System.out.println(Double.compare(o2.getSalary(), o1.getSalary()));
			return Double.compare(o2.getSalary(), o1.getSalary());
		}
		
		/*Double d1=(double)o1.salary;
		Double d2=(double)o2.salary;
	
		return d1.compareTo(d2);*/
		//return o1.name.compareTo(o2.name);
}
