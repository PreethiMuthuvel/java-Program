package com.preethi.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Course {
	private String courseCode;
	private String courseName;
	private String instructor;
	 List<Mark> markList = new ArrayList<Mark>();
	List<Student> entrolledList = new ArrayList<Student>();
	// Map<String, List<Student>> entrolledMap = new HashMap<String,
	// List<Student>>();
	Map<Integer, List<Mark>> marksMap = new HashMap<Integer, List<Mark>>();
	Map<Integer, Integer> studentMarkMap = new HashMap<Integer, Integer>();

	Course(String courseCode, String courseName, String instructor) {
		this.courseCode = courseCode;
		this.courseName = courseName;
		this.instructor = instructor;
		// this.markList = new ArrayList<Mark>();

	}

	public Course() {
		// TODO Auto-generated constructor stub
	}

	public String getCourseCode() {
		return courseCode;
	}

	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getInstructor() {
		return instructor;
	}

	public void setInstructor(String instructor) {
		this.instructor = instructor;
	}

	@Override
	public String toString() {
		return "Course [courseCode=" + courseCode + ", courseName=" + courseName + ", instructor=" + instructor + "]";
	}

	/*
	 * public void manageMarks(Mark mark) { // TODO Auto-generated method stub int
	 * studentId=mark.getStudent().getStudentId();
	 * if(marksMap.containsKey(studentId)) {
	 * 
	 * markList=marksMap.get(studentId); if(!markList.contains(mark)) {
	 * marksMap.get(studentId).add(mark); }
	 * 
	 * } else { markList.add(mark); marksMap.put(studentId, markList); }
	 * System.out.println(marksMap);
	 * 
	 * }
	 */

	/*
	 * public void getGpa() { // TODO Auto-generated method stub
	 * 
	 * for(Map.Entry<Integer, List<Mark>> entry : marksMap.entrySet()) {
	 * System.out.println("studentid = " + entry.getKey() +
	 * 
	 * ", Value = " + entry.getValue());
	 * 
	 * markList= entry.getValue();
	 * 
	 * 
	 * 
	 * }
	 * 
	 * }
	 */

	public Mark addMark(Student student, int score) {
		// TODO Auto-generated method stub
		Mark mark = new Mark(student, this, score);
		studentMarkMap.put(student.getStudentId(), score);
		
		markList.add(mark);
		/*if (marksMap.containsKey(student.getStudentId())) {
			marksMap.get(student.getStudentId()).add(mark);
		} else {
			List<Mark> markList = new ArrayList<Mark>();
			markList.add(mark);
			marksMap.put(student.getStudentId(), markList);
 
		}
		System.out.println(marksMap);*/
		return mark;
		
	}
	public int  getMark(Student student) {
		
		int studentMark=0;
		
		if(studentMarkMap.containsKey(student.getStudentId())) {
			
			studentMark=studentMarkMap.get(student.getStudentId());
		}
		
	
		return studentMark;
		
		
			}
	
	/*public void studentMarks() {
		// TODO Auto-generated method stub
		for(Mark mark: markList) {
			System.out.println(mark.getStudent().getStudentName() + " 's " + mark.getCourse().getCourseName() + "is" + mark.getScore());
			
			
		}
		System.out.println("preethi");
		
	}*/
	
	

	
	public void addStudent(Student student) {
		// TODO Auto-generated method stub

		entrolledList.add(student);
	}

	
}
