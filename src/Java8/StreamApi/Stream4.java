package Java8.StreamApi;

public class Stream4 {
	public static void main(String[] args) {
		// counting occurance
		
		String sentence = "HelloWorld";
		int count = (int) sentence.chars()
				.filter(a->a=='l').count();
		
	}
}
