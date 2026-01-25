package CoreJava;

public class Operations {
	public static void main(String[] args) {
		int z = 1 ;
		System.out.println(z++ + --z);
		
		//bitwise operator
		int a = 5 ;
		int b = 3 ; 
		System.out.println(Integer.toBinaryString(a));
		System.out.println(Integer.toBinaryString(b));
		
		System.out.println("and"+( a&b));
		System.out.println("or" +(a|b));
		System.out.println(("exor"+ (a^b)));
		
		// relatinal operator
		System.out.println(1==2);
		System.out.println(1!= 2);
		// >= <= 
		
		// 
		System.out.println(false && true);
		System.out.println(true || true);
		System.out.println(!true);
	}
}
