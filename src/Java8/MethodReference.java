package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Mobile{
	String mobile;
	Mobile(String mobile){
		this.mobile = mobile;
	}
}
public class MethodReference {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("test","get");
		list.forEach(System.out::println);
		
		// constructor reference
		list.stream().map(Mobile::new).collect(Collectors.toList());
	}
}
