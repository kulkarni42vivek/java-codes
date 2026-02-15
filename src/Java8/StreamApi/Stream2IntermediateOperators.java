package Java8.StreamApi;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream2IntermediateOperators {
	public static void main(String[] args) {
		List<String> list =  Arrays.asList("vivek","vvi","test","test");
		List<String> llist = list.stream()
				.filter(a->a.startsWith("v"))
				.collect(Collectors.toList());
		
		list.stream()
			.map(a->a.toUpperCase())
			.collect(Collectors.toList());
		
		list.stream()
			.sorted()
			.collect(Collectors.toList());
		list.stream()
			.sorted((a,b)->a.compareTo(b))
			.collect(Collectors.toList());
		
		list.stream()
			.sorted()
			.collect(Collectors.toList());
		//list.stream().sorted(Comparator.comparing(Function.identity()).reversed()).collect(Collectors.toList());
		
		// for finding distinct
		list.stream()
			.distinct()
			.collect(Collectors.toList());
		
		// limit
		list.stream()
			.limit(2)
			.collect(Collectors.toList());
		
		// peek - very important while debugging
		long vlaue = list.stream()
					.peek(System.out::println).count();
		System.out.println(vlaue);
		
		
		// ma and min 
		list.stream()
			.min(Comparator.naturalOrder());
		
		
		
		// eaple 
		
		List<Integer>list3 =  Arrays.asList(11,4,35,7,51,61,451,19);
        Optional<Integer> sum  = list3.stream().reduce(Integer::sum);
        System.out.println(sum.get());

        Double answer =  list3.stream().mapToInt(e-> e).average().getAsDouble();
        System.out.println(answer);

        List<Integer>list2 =  Arrays.asList(1,10,20,30,15);
        Double sumS = list2.stream().mapToInt(e->e*e).filter(x->x>100).average().getAsDouble();
        System.out.println(sumS);

        List<Integer> evenList =  list2.stream().filter(x->x%2==0).collect(Collectors.toList());
        System.out.println(evenList);

        List<Integer>twoList =  list2.stream().map(x->x.toString()).filter(x->x.startsWith("2")).map(x->Integer.valueOf(x)).collect(Collectors.toList());
        System.out.println(twoList);

        List<Integer> duplicateNumbers =  Arrays.asList(11,11,45,74,45,41,320);
        Set<Integer> duplicateNumbers1 = duplicateNumbers.stream().filter(x-> Collections.frequency(duplicateNumbers, x)>1).collect(Collectors.toSet());
        System.out.println(duplicateNumbers1);

        HashSet<Integer> hset = new HashSet<>();
        duplicateNumbers.stream().filter(x -> !hset.add(x)).collect(Collectors.toSet());
        Optional<Integer> max = duplicateNumbers.stream().max((a,b)-> a-b);
        duplicateNumbers.stream().max(Comparator.comparing(Integer::valueOf));
        System.out.println(max.orElse(0));
        List<Integer>sorted= duplicateNumbers.stream().sorted(Comparator.comparing(Integer::valueOf)).collect(Collectors.toList());
        System.out.println(sorted);
        List<Integer>sorted2= duplicateNumbers.stream().peek(x->System.out.println(x)).sorted().collect(Collectors.toList());
        System.out.println(sorted2);


        duplicateNumbers.stream().limit(5).skip(2).forEach(System.out::println);
        System.out.println(duplicateNumbers.stream().sorted(Collections.reverseOrder()).distinct().skip(1).limit(1).findFirst().get());
        System.out.println(duplicateNumbers.stream().collect(Collectors.toSet()).stream().sorted(Collections.reverseOrder()).skip(1).limit(1).findFirst().get());



        int[] array = new int[]{12,45,1,52,51};
        Arrays.stream(array).boxed().max(Comparator.comparing(Integer::valueOf)).get();


        int reduce = Arrays.stream(array).reduce(0, (a, b) -> a + b);

        Arrays.stream(array).boxed().max((o1, o2) -> (int)(o1-o2)).get();


        Stream.of(array).forEach(System.out::println);

		
	}
}
