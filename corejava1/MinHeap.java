package com.preethi.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class MinHeap {
public static void main(String args[]) {
	int[][] meetings = new int[][]{{1, 3}, {5, 7}, {4, 6}, {7, 9},{9, 10}};
	
    // Sort meetings in ascending order by start time
    Arrays.sort(meetings, (a, b) -> a[0] - b[0]);

    // Initialize heap and add the end time of the first meeting
    PriorityQueue<Integer> rooms = new PriorityQueue<>();
    rooms.add(meetings[0][1]);

    for (int i = 1; i < meetings.length; i++) {
        int start = meetings[i][0];
        int end = meetings[i][1];

        // If the earliest ending meeting ends before the next meeting starts,
        // remove it from the heap
        if (rooms.peek() <= start) {
            rooms.poll();
        }

        // Add the current meeting's end time to the heap
        rooms.add(end);
    }

   
     System.out.println(rooms.size());
}
}
