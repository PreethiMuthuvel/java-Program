package com.preethi.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class EmployeMaximumSalary {

	public void MaximumSalaryByDepartment(List<Employe> employeList) {
		ArrayList<Integer> list=new ArrayList<>();
		List llist=list;

		Map<String, List<Employe>> employeMap = new HashMap<String, List<Employe>>();

		for (Employe employe : employeList) {

			List<Employe> employeListt = employeMap.getOrDefault(employe.getDepartment().getName(),
					new ArrayList<Employe>());

			employeListt.add(employe);

			employeMap.put(employe.getDepartment().getName(), employeListt);
		}

		for (Map.Entry<String, List<Employe>> entry : employeMap.entrySet()) {

			String departmentName = entry.getKey();
			List<Employe> listOfEmploye = entry.getValue();
			EmployeComparator employeComparator = new EmployeComparator();
			// Collections.sort(listOfEmploye,Collections.reverseOrder());
			// Employe maximum = Collections.max(listOfEmploye);
			// System.out.println(maximum.toString());
			Collections.sort(listOfEmploye, employeComparator);
			for (Employe a : listOfEmploye) {
				System.out.println(a);
			}
			Employe maxSalEmp = listOfEmploye.get(0);
			System.out.println(departmentName + ":");
			System.out.println(maxSalEmp.name + "," + maxSalEmp.salary);

		}

	}
}
