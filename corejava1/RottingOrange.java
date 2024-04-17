package com.preethi.test;

import java.util.LinkedList;
import java.util.Queue;

public class RottingOrange {
	public static void main(String[] args) {
		int[][] grid = { { 2, 1, 1 }, { 0, 1, 1 }, { 1, 0, 1 } };
		int n = grid.length, m = grid[0].length;
		Queue<Pair> queue = new LinkedList<Pair>();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (grid[i][j] == 2)
					queue.add(new Pair(i, j));
			}
		}
		int count = 0;
		while (!queue.isEmpty()) {
			int size = queue.size();
			boolean isRotted = false;
			for (int i=0;i<size;i++) {
				Pair pair = queue.poll();
				int row = pair.getX();
				int col = pair.getY();
				if (row > 0 && grid[row - 1][col] == 1) {
					grid[row - 1][col] = 2;
					queue.add(new Pair(row - 1, col));
					isRotted = true;
				}
				if (row < grid.length - 1 && grid[row + 1][col] == 1) {
					grid[row + 1][col] = 2;
					queue.add(new Pair(row + 1, col));
					isRotted = true;
				}
				if (col > 0 && grid[row][col - 1] == 1) {
					grid[row][col - 1] = 2;
					queue.add(new Pair(row, col - 1));
					isRotted = true;
				}
				if (col < grid[row].length - 1 && grid[row][col + 1] == 1) {
					grid[row][col + 1] = 2;
					queue.add(new Pair(row, col + 1));
					isRotted = true;
				}
				
			}
			if (isRotted) {
				count++;
			}
			
		}
			
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[0].length; j++) {
				if (grid[i][j] == 1) {
					System.out.println(-1);
				}
			}
			System.out.println();
		}
		System.out.println(count);
	}
}