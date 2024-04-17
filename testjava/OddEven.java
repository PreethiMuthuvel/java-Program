package com.testjava;

public class OddEven {
	public int[] oddEvenArray(int[] arr) {
		int last=arr.length-1;
		int first=0;
		while(first<last){
			if(arr[first]%2!=0) {
				first++;
			}
			else {
				int temp=arr[first];
				arr[first]=arr[last];
				arr[last]=temp;
				last--;
			}
			
		}
		return arr;
	}
}
