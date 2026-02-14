package Java8.FunctionalInterfaces;

import java.util.function.Predicate;

public class PredicateInterface {
	public static void main(String[] args) {
		
		// Predicate
		Predicate<String> predicate = (a)->{
			return a.startsWith("a");
		};
		Predicate<String> predicate2 = a->a.startsWith("a");
		
		System.out.println(predicate.test("aest"));
		System.out.println(predicate.test("alo"));
		
		// create new predicate
		Predicate<String> pred = predicate2.and(predicate);
		System.out.println(pred.test("aasdf"));
		
		System.out.println(pred.negate().test("test"));
		
		
		Predicate<Integer> test = a -> a%2 ==0;
		
		
	}
}
