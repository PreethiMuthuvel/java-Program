package streamproject;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class definitions {

	public static void main(String[] args) {

		int[] arr= {1,2,3,4,5,6,7,8};
	    IntStream intStream=Arrays.stream(arr);
	    intStream
	    .map(value->value*3)
	    .filter(value->value>5)
	    .forEach(System.out::print);
	}

}
