package com.preethi.test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class LambdaExample {

	public static void main(String[] args) {
		List<PersonLambda> people = Arrays.asList(new PersonLambda("preethi", "Mutuvel", 24),
				new PersonLambda("kavitha", "Mutuvell", 40), new PersonLambda("saran", "Saran", 20),
				new PersonLambda("saranya", "murugan", 24), new PersonLambda("sowmi", "saran", 24));
		Collections.sort(people, (p1, p2) -> p1.getlName().compareTo(p2.getlName()));
		// System.out.println("Print names");
		people.stream().filter(p -> p.getfName().startsWith("p")).forEach(p -> System.out.println(p.getfName()));
		long count = people.stream().filter(p -> p.getlName().startsWith("M")).count();
		System.out.println(count);
		// printConditionally(people, p->true,p->System.out.println(p));
		// System.out.println("Starts with M");
		// printConditionally(people, p ->
		// p.getlName().startsWith("M"),p->System.out.println(p));
	}
	/*
	 * private static void printConditionally(List<PersonLambda> people,
	 * Predicate<PersonLambda> predicate,Consumer<PersonLambda> consumer) { for
	 * (PersonLambda p : people) { if (predicate.test(p)) { consumer.accept(p); } }
	 */
	/*
	 * @FunctionalInterface public interface Condition { boolean test(PersonLambda
	 * p);
	 * 
	 * }
	 */
}
