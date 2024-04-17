package com.preethi.test;

public class Pattern1 {

	public static void main(String[] args) {
		int n = 7;
		for (int i = 1; i <= n; i++) {
			for (int j = n; j >= 1; j--) {
				if (j == i || j == n + 1 - i) {
					System.out.print(j);
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}