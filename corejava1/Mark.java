package com.preethi.test;

import java.util.ArrayList;
import java.util.List;

public class Mark {

	private Course course;
	private Student student;
	private int score;
	private String grade;

	public Mark(Student student, Course course, int score) {
		// TODO Auto-generated constructor stub
		// this(student1,course1);
		this.student = student;
		this.course = course;
		this.score = score;
		//System.out.println(student);
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "Mark [course=" + course + ", student=" + student + ", score=" + score + "]";
	}

}
