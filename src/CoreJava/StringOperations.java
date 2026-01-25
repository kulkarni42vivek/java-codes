package CoreJava;

public class StringOperations {
	public static void main(String[] args) {
		String str= new String("hello");
		
		System.out.println(str.toCharArray());
		System.out.println(str.toUpperCase());
		System.out.println(str.compareTo("bewl"));
		System.out.println(str.compareTo("twe"));
		System.out.println(str.length());
		System.out.println(str.charAt(0));
		System.out.println(str.contains("hel"));
		System.out.println(str.substring(0,3));
	}
}
