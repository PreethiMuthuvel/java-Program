package com.preethi.test;

import java.util.ArrayList;
import java.util.List;

public class PerfectSquare {
  public static void main(String args[]) {
	  int n=17;
	  List<Integer> perfectSquareList=new ArrayList<Integer>();
	  for(int i=0;i<n;i++) {
		  if(i*i<n) {
			  perfectSquareList.add(i*i);
		  }
	  }
	  for(int i=1;i<perfectSquareList.size();i++) {
		  for(int j=i+1;j<perfectSquareList.size();j++) {
			  if(perfectSquareList.get(i)+perfectSquareList.get(j)==n) {
				  System.out.println("2");
			  }
			  else if(perfectSquareList.get(i)+perfectSquareList.get(j)>n) {
				 System.out.println("3");
			  }
		  }
	  }
  }
	
	
}
