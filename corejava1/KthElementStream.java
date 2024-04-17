package com.preethi.test;

import java.util.PriorityQueue;

class Largest {
	static PriorityQueue<Integer> minHeap = new PriorityQueue<>();
	static int k;

	public Largest(int k, int[] arr) {
		this.k = k;
		for (int num : arr) {
			minHeap.add(num);
			if (minHeap.size() > k) {
				minHeap.poll();
			}
		}
		//System.out.println(minHeap.peek());

	}

	public void add(int num) {
		minHeap.add(num);
		if (minHeap.size() > k) {
			minHeap.poll();
		}
		System.out.println(minHeap.peek());
	}
}

public class KthElementStream {
	public static void main(String[] args) {
		int arr[] = { 4, 5, 8, 2 };
		int k = 3;
		Largest largest = new Largest(k, arr);
		largest.add(3);
		largest.add(5);
		largest.add(10);
		largest.add(9);
		largest.add(4);

	}

}
