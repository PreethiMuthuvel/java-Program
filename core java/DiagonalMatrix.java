package com.preethi.test;

public class DiagonalMatrix {

	public static void main(String[] args) {
		int[][] mat = {
	            {1, 2, 3},
	            {4, 5, 6},
	            {7, 8, 9}
	        };
		int[] result=findDiagonalOrder(mat);
		for(int n: result) {
		System.out.print(n);
	}
	}
	private static int[] findDiagonalOrder(int[][] mat) {
		int m=mat.length,n=mat[0].length;
        if(m == 0 || n == 0) 
        {
            return new int[0]; 
        }
        int res[]=new int[m*n];
        int i=0,j=0,idx=0;
        boolean up=true;
        while(i<m && j<n)
        {
            if(up)
            {
                while(i>0 && j<n-1)
                {
                    res[idx++]=mat[i][j];
                    i--;
                    j++;
                }
                res[idx++]=mat[i][j];
                if(j==n-1)
                i++;
                else 
                {
                    j++;
                }
                    up=false;
            }
            else
            {
                while(j>0 && i<m-1)
                {
                    res[idx++]=mat[i][j];
                    i++;
                    j--;
                }
                res[idx++]=mat[i][j];
                if(i==m-1)
                j++;
                else 
                {
                    i++;
                }
                    up=true;
            }
        }
        return res;
    }
}
