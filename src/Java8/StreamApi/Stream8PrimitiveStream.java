package Java8.StreamApi;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Stream8PrimitiveStream {
	public static void main(String[] args) {
		int[] number  = {1,2,5,5,1};
		IntStream stream = Arrays.stream(number);
		
		stream.boxed().collect(Collectors.toList());
	}
}
