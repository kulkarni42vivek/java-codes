package CoreJava.OOPS;

// compile time - method overloading
// runtime - method overriding
class Calculator{
	int add(int a , int b) {
		return a+b;
	}
	int add(int a,int b, int c ) {
		return a+b+c;
	}
}

// runtime 
class Calc{
	int add(int a, int b) {
		return a+b;
	}
}
class AdvancedCalc extends Calc{
	int add(int a, int b) {
		return (a+b)*10;
	}
}
public class Polymorphism {
	public static void main(String[] args) {
		// many forms of methods
		// compile time and runtime 
		Calculator calc = new Calculator();
		System.out.println(calc.add(5, 10));
		System.out.println(calc.add(5, 10, 15));
		
		Calc cal= new AdvancedCalc();
		System.out.println(cal.add(56, 10));
	}
}
