package com.preethi.test;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
public class ConcurrentModificationExample {
	
		public static void main(String[] args)
		{
			List<String> myList = new ArrayList<>();
	        myList.add("Alice");
	        myList.add("Bob");
	        myList.add("Charlie");

	        // Using ListIterator
	        ListIterator<String> iterator = myList.listIterator();
	        while (iterator.hasNext()) {
	            String name = iterator.next();
	            System.out.println("Current: " + name);
	            
	            // Simulating a scenario where another thread adds an element to the list
	            try {
	                Thread.sleep(1000); // Simulate some processing time
	            } catch (InterruptedException e) {
	                e.printStackTrace();
	            }
	            
	            // Adding an element while iterating
	            if (name.equals("Bob")) {
	                myList.add("David");
	            }
	           
	        }
	        for(String s: myList) {
	        	System.out.println(s);
	        }
	       
	    }
	}