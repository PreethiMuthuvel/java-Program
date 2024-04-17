package com.codestax.interview.preethi;

public class MinimumCostPath {
	public static int minCostPath(int[][] grid) {
		int rows = grid.length;
		int cols = grid[0].length;
		int[][] dp = new int[rows][cols];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				dp[i][j] = Integer.MAX_VALUE;
			}
		}
		dp[0][0] = grid[0][0];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				if (i > 0) {
					dp[i][j] = Math.min(dp[i][j], dp[i - 1][j] + grid[i][j]);
				}
				if (j > 0) {
					dp[i][j] = Math.min(dp[i][j], dp[i][j - 1] + grid[i][j]);
				}
			}
		}
		return dp[rows - 1][cols - 1];
	}

	public static void main(String[] args) {
		int[][] grid = { { 1, 3, 1 }, { 1, 5, 1 }, { 4, 2, 1 } };
		System.out.println("Minimum cost path: " + minCostPath(grid));
	}

}
