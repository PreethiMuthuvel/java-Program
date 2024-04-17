package com.preethi.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MarkManagement {

	List<Student> students = new ArrayList<Student>();
	List<Course> courses = new ArrayList<Course>();
	private Map<Integer, List<Course>> studentMap = new HashMap<Integer, List<Course>>();
	public void entrollStudentInCourse(Student student, Course course) {
		course.addStudent(student);
		if (studentMap.containsKey(student.getStudentId())) {
			studentMap.get(student.getStudentId()).add(course);
		} else {
			List<Course> courseList = new ArrayList<Course>();
			courseList.add(course);
			studentMap.put(student.getStudentId(), courseList);
		}
		System.out.println(studentMap);
	}
}
