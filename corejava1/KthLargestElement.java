package com.preethi.test;

import java.util.PriorityQueue;

public class KthLargestElement {
	public static void main(String args[]) {
		int[] arr= {3,2,1,5,6,4};
		int k=3;
		PriorityQueue<Integer> priorityOueue=new PriorityQueue<>();
		for(int number : arr) {
			priorityOueue.offer(number);
			if(priorityOueue.size()>k) {
				priorityOueue.poll();
			}
		}
		int element=priorityOueue.peek();
		System.out.println(element);
		
	}

}
