package CoreJava;

public class DataType {
	public static void main(String[] args) {
		byte byteNumber = 4 ;
		short shortNumber= 5 ;
		int integerNumber = 10 ;
		long longNumber = 25;
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Short.MAX_VALUE);
		System.out.println(Short.MIN_VALUE);
		
		
		float floatNumber = 1.5621321f;
		System.out.println(floatNumber);
		System.out.println(Float.MIN_VALUE);
		System.out.println(Float.MAX_VALUE);
		
		double doubleNumber = 1.513651;
		System.out.println(Double.MIN_VALUE);
		System.out.println(Double.MAX_VALUE);
		
		boolean booleanFlag = true ;
		System.out.println(booleanFlag);
		System.out.println(Boolean.FALSE);
		
		char characterValue = 'c';
		System.out.println(characterValue);
		System.out.println((int)Character.MAX_VALUE);
		System.out.println((char)100002);
		
		
		// widening and narrowing 
		
		byte value = 25;
		int avalue = value ;
		long bvalue = value;
		float fvalue = value;
		
		// narrowing
		double dvalue = 123.545256;
		int narrowintvalue =(int) dvalue;
		byte narrowByteValue = (byte) dvalue;
		
		// string and string pool;
		String str1 = "Hello";
		String str2 = "Hello";
		String str3 = new String("Hello");
		
		System.out.println(str1 == str2);
		System.out.println(str1 == str3);
		System.out.println(str1.equals(str3));
		
	}
}
