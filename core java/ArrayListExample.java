package com.preethi.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;


public class ArrayListExample{
	public static void main (String[] args) 
    { 
        // creating an ArrayList 
        List<String> al = new ArrayList<String>(); 
  
        // adding object to arraylist 
        al.add("Practice.GeeksforGeeks.org"); 
        al.add("www.GeeksforGeeks.org"); 
        al.add("code.GeeksforGeeks.org"); 
        al.add("contribute.GeeksforGeeks.org"); 
  
        // traversing elements using Iterator' 
        System.out.println("ArrayList elements are:"); 
        Iterator it = al.iterator(); 
        while (it.hasNext()) 
            System.out.println(it.next()); 
    
        Comparator comp = Collections.reverseOrder();
        Collections.sort(al, String.CASE_INSENSITIVE_ORDER);
      //  g Collections.sort(list, String.CASE_INSENSITIVE_ORDER);
        System.out.println(al);
        Collections.sort(al, String.CASE_INSENSITIVE_ORDER);
        System.out.println(al);


}
}