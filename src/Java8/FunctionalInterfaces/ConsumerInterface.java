package Java8.FunctionalInterfaces;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class ConsumerInterface {
	public static void main(String[] args) {
		
		// consumer interface
		Consumer<String> consumer = (a)->System.out.println(a);
		consumer.accept("test");
		
		// supplier
		Supplier<String> stringspp = ()->{
			return "jel";
		};
		System.out.println(stringspp.get());
		
	}
}
