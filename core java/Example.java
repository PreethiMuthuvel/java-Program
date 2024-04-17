package com.preethi.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;

public class Example {
	public static void main(String[] args) {
		/*int arr[]= {16,17,4,3,5,2};
		int n=arr.length-1;
		int last=arr[n];
		Stack<Integer> stack=new Stack<Integer>();
		stack.push(last);
		for(int i=n-1;i>=0;i--) {
			if(stack.peek()<arr[i]) {
			stack.push(arr[i]);
			
		}}
		int resultArray[]=new int[stack.size()];
		int index=0;
		while(!stack.isEmpty()) {
			resultArray[index++]=stack.pop();
		}
		for (int i = 0; i < resultArray.length; i++) {
		    System.out.println(resultArray[i]);
		}*/
		
	
		        try {
		            // Dynamically load the class by its name
		            Class<?> dynamicClass = Class.forName("com.example.DynamicClass");
		            
		            // Now you can work with the dynamically loaded class
		            System.out.println("Dynamically loaded class: " + dynamicClass.getName());
		        } catch (ClassNotFoundException e) {
		            // Handle the exception if the class is not found
		            e.printStackTrace();
		        }
		    }
		}
