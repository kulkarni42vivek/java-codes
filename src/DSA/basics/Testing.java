package DSA.basics;
public class Testing {
	static String reverse(String str) {
		if(str.length() == 1) {
			return str.substring(0,1);
		}
		int length = str.length() - 1;
		char lastChar = str.charAt(length);
		return lastChar + reverse(str.substring(0,length));
	}

	public static void main(String[] args) {
		String value = reverse("12345678");
		System.out.println(value);
	}
}
