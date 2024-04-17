package com.codestax.interview.preethi;

import java.util.Arrays;

public class CoinChangeMinCoins {
	public static int minCoins(int[] coins, int amount) {
		int[][] dp = new int[coins.length + 1][amount + 1];
		Arrays.fill(dp[0], Integer.MAX_VALUE - 1); // Fill first row with a large value

        dp[0][0] = 0; // Set dp[0][0] to 0

        
		for (int i = 0; i <= coins.length; i++) {
            for (int j = 0; j <= amount; j++) {
                if (i == 0 || j == 0) {
                    dp[i][j] = 0;
                } else if (j >= coins[i - 1]) {
                    dp[i][j] = Math.min(dp[i - 1][j], 1 + dp[i][j - coins[i - 1]]);
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }

        return dp[coins.length][amount] == Integer.MAX_VALUE - 1 ? -1 : dp[coins.length][amount];
	}
	public static void main(String[] args) {
		int[] coins = { 1, 2, 5 };
		int amount = 11;
		System.out.println("Minimum number of coins to make " + minCoins(coins, amount));
	}
}
