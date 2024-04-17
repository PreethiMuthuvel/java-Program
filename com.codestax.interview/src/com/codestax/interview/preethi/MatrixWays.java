package com.codestax.interview.preethi;

public class MatrixWays {
	public static void main(String[] args) {
		int[][] grid = { {1,2,3,4 }, { 5,6,7,8 }, {9,10,11,12 } ,{13,14,15,16}};
		System.out.println("NO of ways " + findWaysfromMatrix(grid));
	}

	private static int findWaysfromMatrix(int[][] grid) {
		int rows = grid.length;
		int cols = grid[0].length;
		int[][] dp = new int[rows][cols];
		dp[0][0]=1;
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				if (i > 0) {
					dp[i][j] =  dp[i - 1][j] + dp[i][j];
				}
				if (j > 0) {
					dp[i][j] = dp[i][j - 1] + dp[i][j];
				}
			}
		}
		
		return dp[rows - 1][cols - 1];
	}

}


