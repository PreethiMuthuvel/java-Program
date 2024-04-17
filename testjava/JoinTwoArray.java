package com.testjava;

public class JoinTwoArray {

	public int[] joinedArray(int[] arr1,int[] arr2) {
		int[] joinedArray=new int[arr1.length+arr2.length];
		int i=0;
		int j=0;
		int k=0;
		while(i<arr1.length && j<arr2.length) {
			if(arr1[i]<arr2[j]) {
				joinedArray[k++]=arr1[i++];
			}
			else {
				joinedArray[k++]=arr2[j++];
			}
		}
		while(i<arr1.length){
			joinedArray[k++]=arr1[i++];
		}
		while(j<arr2.length) {
			joinedArray[k++]=arr2[j++];
		}
		
		return joinedArray;
	}

	
	

}
