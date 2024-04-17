package com.preethi.test;

import java.util.ArrayList;

public class Meals {
	
	public String cuisine;
	public ArrayList<String> ingredients = new ArrayList<String>();
	Meals(String cuisine, String[] ingredientArray) {
		this.cuisine = cuisine;
		for (String ingredient : ingredientArray) {
			ingredients.add(ingredient);
		}
	}

}
