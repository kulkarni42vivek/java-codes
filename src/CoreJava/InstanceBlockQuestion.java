package CoreJava;

public class InstanceBlockQuestion {
	
	static String value = "test";
	
	// static block  - it will be called first when code is run 
	// this is used for initialzing class , static values
	static {
		System.out.println("This is the static block");
		System.out.println(value);
	}
	
	// instance initializer block - used for initializing instances
	// this will be called before constructor
	{
		System.out.println("Instance initializer block");
		
	}
	
	// constructor 
	public InstanceBlockQuestion() {
		System.out.println("Constructor called");
	}
	public static void main(String[] args) {
		System.out.println("In main method");
		
		InstanceBlockQuestion obj = new InstanceBlockQuestion();
		InstanceBlockQuestion obj2 = new InstanceBlockQuestion();
	}

}
