package Java8.StreamApi;

import java.util.*;
import java.util.stream.Collectors;

public class Stream3TerminalOperations {
	public static void main(String[] args) {
		// collect
		List<Integer> list = Arrays.asList(1,2,4);
		list.stream().skip(1).collect(Collectors.toList());
		List<Integer> llist = list.stream()
				.collect(Collectors.toUnmodifiableList());
		//		llist.add(5); code will fail here
		
		// foreach
		list.stream().forEach(System.out::println);
		
		// reduce
		Optional<Integer> answer = list.stream().reduce((a,b)->a+b);
		
		
		// allmatch 
		boolean value = list.stream().allMatch(a->a%2==0);
		
		
		// anymatch
		boolean value2 = list.stream().anyMatch(a->a%2==0);
		
		// nonematch 
		boolean value3 = list.stream().noneMatch(a->a%2 ==0);
		
		// findfirst
		Integer firt = list.stream().findFirst().get();
		
		// findany 
		Integer any = list.stream().findAny().get();
		
		// above operators mentioned are short circuit
	}
}
