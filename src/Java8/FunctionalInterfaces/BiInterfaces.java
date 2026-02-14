package Java8.FunctionalInterfaces;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class BiInterfaces {
	public static void main(String[] args) {
		BiPredicate<Integer, Integer> bipredicate = (a,b)->(a+b)%2==0;
		BiConsumer<String,String> biconsumer= (a,b)-> System.out.println(a+b);
		BiFunction<String, Integer, String> bifunction= (a,b)->{
			return a.substring(b);
		};
		System.out.println(bifunction.apply("hello", 2));
	}
}
