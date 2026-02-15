package Java8.StreamApi;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Stream7CollectorsClass {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("alice","inthe","wonder","land");
		List<String> nameslist =  names.stream()
			.filter(a->a.startsWith("a"))
			.collect(Collectors.toList());
		System.out.println(nameslist);
		
		// toset
		names.stream()
			.collect(Collectors.toSet());
		
		// to specific collection 
		names.stream()
			.collect(Collectors.toCollection(()->new ArrayDeque<>()));
		
		// joining string names
		String value = names.stream()
			.collect(Collectors.joining(""));
		System.out.println(value);
		
		// collectors counting
		List<Integer> intlist = Arrays.asList(1,2,3,4,5,6);
		long counting = intlist.stream()
			.collect(Collectors.counting());
		
		intlist.stream()
			.collect(Collectors.averagingInt(a->a));
		
		// grouping by usage
		Map<Integer,List<String>> answer = names.stream()
			.collect(Collectors.groupingBy(a->a.length()));
		
		System.out.println(answer);
		
		Map<Integer,String> answer2 = names.stream()
				.collect(Collectors.groupingBy(a->a.length() , Collectors.joining("")));
			
		System.out.println(answer2);
		
		
		// counting words by occurances
		String sentence = "hello world hello there any there any hello";
		Arrays.stream(sentence.split(" "))
			.collect(Collectors.groupingBy(a ->a , Collectors.counting()));
		
		// partitioning
		System.out.println(intlist.stream()
				.collect(Collectors.partitioningBy(a->a%2==0)));
		
		// summing values in map 
		Map<String , Integer> map = new HashMap<String, Integer>();
		map.put("hello",2);
		map.put("two",5);
		map.put("twe", 45);
		
		Integer value3 = map.values().stream().collect(Collectors.summingInt(a->a));
		
		
		// create map from stream elements
		List<String> list = Arrays.asList("apple", "banana","cherry");
		Map<String, Integer> map3 = list.stream()
			.collect(Collectors.toMap(a->a, a->a.length()));
		
		
	}
}
