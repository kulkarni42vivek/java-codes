package Java8.StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Stream1Creation {
	public static void main(String[] args) {
		// stream creation
		List<Integer> list = Arrays.asList(1,2,3,4);
		List<Integer> newList =  list.stream()
				.filter(a->a%2==0)
				.collect(Collectors.toList());
		
		// from array
		String[] array  = {"a","t","c"};
		List<String> slit =  Arrays.stream(array)
				.filter(a->a.startsWith("a"))
				.collect(Collectors.toList());
		
		// stream of 
		List<String> slit2 = (List<String>) Stream.of("a","b");
		
		// generate
		Stream.generate(()->1).limit(500);
		
	}
}
