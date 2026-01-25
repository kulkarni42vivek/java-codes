package DSA.basics;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

class Student{
	int id ;
	String name ;
	
}
public class TestTwo {
	public static void main(String[] args) {
		Predicate<Integer> salaryTest =  t -> t> 10000 ;
		System.out.println(salaryTest.test(500));
		System.out.println(salaryTest.test(500000));
		
		Predicate<Integer> salarayNEW = t -> t< 70000;
		System.out.println(salarayNEW.test(7000));
		
		Predicate<Integer> newP = salaryTest.and(salarayNEW);
		System.out.println(newP.test(6000));
		
		Function<String, Integer> function  = t -> t.length();
		int value  = function.apply("jellp").intValue();
		System.out.println(value);
		
		Function<List<Student>, List<Student>> nae = t ->{
			List<Student> stu = new ArrayList<>();
			for(Student s : t) {
				if(s.id == 0) {
					stu.add(s);
				}
			}
			return stu;
		};
		
		Function<String, String> fun1 = t -> t.toLowerCase() ;
		Function<String, String> fun2  = t -> t.substring(0,3);
		System.out.println(fun1.andThen(fun2).apply("Hello"));
	}
}
