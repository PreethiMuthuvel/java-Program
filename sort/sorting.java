package com.sort;

import java.util.Arrays;

public class sorting {
	
	public static void main(String args[]) {
	
	Sort sort=new Sort();
	int[] numberArray= {23,43,12,6,8,7};
	sort.bubbleSort(numberArray);
	System.out.println(Arrays.toString(numberArray));
	int[] numberArray1= {23,43,12,6,8,7};
	sort.insertionSort(numberArray1);
	System.out.println(Arrays.toString(numberArray1));
	int[] numberArray2= {23,43,12,6,8,7};
	sort.selectionSort(numberArray2);
	System.out.println(Arrays.toString(numberArray2));

	int[] numberArray3= {5,4,7,1};
	int[] resultArray=mergeSort.mergeSort(numberArray3);
	System.out.println(Arrays.toString(resultArray));
	
	int[] numberArray4= {5,8,4,3,7,6,2,9,5};
	QuickSort.quickSort(numberArray4,0,numberArray4.length-1);
	System.out.println(Arrays.toString(numberArray4));

 }
}