package com.testjava;
import java.util.*;
public class Meals {
	String cuisine;
	ArrayList<String> dish = new ArrayList<>();
	public Meals(String s, String[] arr) {
		cuisine = s;
		for (String i : arr) {
			dish.add(i);
		}
	}

	public static void main(String[] args) {
		List<Meals> li = new ArrayList<Meals>();
		li.add(new Meals("American", new String[] { "lacctice", "tomato", "cheese", "potato" }));
		li.add(new Meals("Mexican", new String[] { "lacctice", "tomato", "garlic", "potato" }));
		li.add(new Meals("French", new String[] { "lacctice", "tomato", "garlic", "potato" }));
		li.add(new Meals("Continental", new String[] { "lacctice", "tomato", "cheese", "potato" }));
		Map<String, Integer> mp = new HashMap<String, Integer>();
		for (Meals meals : li) {
			List<String> dishlist = meals.dish;
			Collections.sort(dishlist);
			//System.out.println(dishlist);
			String key = String.join(",", dishlist);
			System.out.println(key);

}
}}