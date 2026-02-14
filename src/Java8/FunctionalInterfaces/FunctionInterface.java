package Java8.FunctionalInterfaces;

import java.util.function.Function;

public class FunctionInterface {
	public static void main(String[] args) {
		
		// function 
		Function<String, Integer> function = a->a.length();
		System.out.println(function.apply("jello"));
		
		Function<Integer, Integer> function2 = a->a*a;
		
		Function<String, Integer> func = function.andThen(function2);
		System.out.println(func.apply("test"));
		
		
		//
	}
}
