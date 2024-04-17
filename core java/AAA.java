package com.preethi.test;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AAA {
	
	
	    public static void main(String[] args) {
	        List<String> list = new ArrayList<>();
	        list.add("Apple");
	        list.add("Banana");
	        list.add("Orange");

	        Iterator<String> iterator = list.iterator();

	        // Modify the list while iterating
	        while (iterator.hasNext()) {
	            String fruit = iterator.next();
	            System.out.println(fruit);
	            if (fruit.equals("Orange")) {
	                // This will throw ConcurrentModificationException
	            	list.remove(fruit);
	            }
	        }
	    }
	

}
