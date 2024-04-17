package com.preethi.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class DeckRevealedIncreasing {

	public static void main(String[] args) {
		int[] deck = { 1,1000};
		Arrays.sort(deck);
		Queue<Integer> queue = new LinkedList<>();
		for (int i = 0; i < deck.length; i++) {
			queue.offer(i);
		}
		int[] result = new int[deck.length];
		for (int card : deck) {
			result[queue.poll()] = card;
			if (!queue.isEmpty()) {
				queue.offer(queue.poll());
			}
		}
		for(int n:result) {
			System.out.println(n);
		}
	}
}
