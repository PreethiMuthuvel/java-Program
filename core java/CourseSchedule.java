package com.preethi.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class CourseSchedule {

    public static void main(String[] args) {
        Map<Integer, List<Integer>> adj = new HashMap<>();
        Map<Integer, Integer> inDegree = new HashMap<>();
        int[][] preArr = new int[][]{{1, 0},{1,0}};
        int course = 2;
        for (int i = 0; i < course; ++i) {
            adj.put(i, new LinkedList<>());
            inDegree.put(i, 0);
        }
        for (int[] arr : preArr) {
            int coursee = arr[0];
            int neighbor = arr[1];
            adj.get(neighbor).add(coursee);
            inDegree.put(coursee, inDegree.getOrDefault(coursee, 0) + 1);
        }
        Queue<Integer> queue = new LinkedList<>();
        for (Integer vertex : adj.keySet()) {
            if (!inDegree.containsKey(vertex)) {
                queue.offer(vertex);
            }
        }
        List<Integer> result = new ArrayList<>();
        while (!queue.isEmpty()) {
        
            Integer vertex = queue.poll();
            result.add(vertex);
            List<Integer> neighbors = adj.getOrDefault(vertex, new ArrayList<>());
            for (Integer neighbor : neighbors) {
                inDegree.put(neighbor, inDegree.get(neighbor) - 1);
                if (inDegree.get(neighbor) == 0) {
                    queue.offer(neighbor);
                }
            }
        }
        
        for (int vertex : result) {
            System.out.print(vertex + " ");
        }
        
    }
}
