package Java8.StreamApi;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream6FlatMap {
	public static void main(String[] args) {
		List<List<String>> list = Arrays.asList(
				Arrays.asList("test","testsfd","aweg"),
				Arrays.asList("AGG")
				);
		List<String> listNew = list.stream()
				.flatMap(a->a.stream())
				.map(a->a.toUpperCase()).toList();
		System.out.println(listNew);
		
		// to split arraylist of string
		List<String> alist = Arrays.asList(
				"hello wrod asdf",
				"gesg saw we",
				"woe pwe as");
		List<String> blist = alist.stream()
				.flatMap(a-> Stream.of(a.split(" ")))
				.collect(Collectors.toList());
		System.out.println(blist);
		
		
		// stream cannot be used after terminal operator has been 
		// called 
	}
}
