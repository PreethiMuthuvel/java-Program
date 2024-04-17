package com.preethi.test;
import java.util.LinkedList;
import java.util.Queue;

public class CountStudents {

	public static void main(String[] args) {
        int[] sandwiches = {1,0,0,0,1,1};
        int[] students = {1,1,1,0,0,1};
        Queue<Integer> sandwichQueue = new LinkedList<>();
        Queue<Integer> studentQueue = new LinkedList<>();
        for (int sandwich : sandwiches) {
            sandwichQueue.offer(sandwich);
        }
        for (int student : students) {
            studentQueue.offer(student);
        }
        int notServed=0;
        int initialStudentCount = studentQueue.size(); 
        while (!studentQueue.isEmpty() && !sandwichQueue.isEmpty() && notServed<studentQueue.size()) {
            int student = studentQueue.poll();
            int sandwich = sandwichQueue.peek();
            if (student == sandwich) {
            	notServed=0;
            	sandwichQueue.poll();
                initialStudentCount--; 
            } else {
                studentQueue.offer(student);
                notServed++;
            }
            System.out.println("nb");
        }
        System.out.println("Number of students who won't get sandwiches " +initialStudentCount);
    }
}