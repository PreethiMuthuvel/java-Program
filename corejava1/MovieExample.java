package com.preethi.test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;import java.util.function.Function;
import java.util.stream.Collectors;

public class MovieExample {
	public static void main(String[] args) {
	    List<Director> directorList=new ArrayList<Director>();
	    List<Movie> movieList=new ArrayList<Movie>();
		Director preethi=new Director(011,"preethi","content");
		Director saran=new Director(012,"saran","content");
		Movie ayan=new Movie(10,"ayan",1999,"rating 5");
		Movie sura=new Movie(11,"sura",1998,"rating 4");
		Movie ayalan=new Movie(12,"ayalan",2024,"rating 4.5");
		Movie miller=new Movie(13,"miller",2024,"rating 5");
		directorList.add(preethi);
		directorList.add(saran);
		movieList.add(miller);
		movieList.add(ayalan);
		movieList.add(sura);
		movieList.add(ayan);
		preethi.addMovie(ayan);
		preethi.addMovie(sura);
		saran.addMovie(ayalan);
		saran.addMovie(miller);
		//System.out.println(preethi.getMovies());
		
		 Map<String, Long> countMap = directorList.stream()
	                .collect(Collectors.toMap(
	                        Director::getName,
	                        director -> (long) director.getMovies().size()));
		System.out.println(countMap);
		
	}

}
