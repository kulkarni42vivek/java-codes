package CoreJava.OOPS;

// it is OOPS pillar - means hiding details, 
// can be done with abstract keyword or interface
// methods in abstract class are implemented they are defined and are 
// abstract or normal
// abstract class cannot be instantiated 
// class extending abstract must implement its methods

abstract class Animal2{
	public abstract void calling();
	public abstract void attack();
	
	public void sleep() {
		System.out.println("sleep");
	}
}
class TestAnimal extends Animal2{

	@Override
	public void calling() {
		System.out.println("testanimal calling");
	}

	@Override
	public void attack() {
		// TODO Auto-generated method stub
		
	}
	
}
public class Abstraction {

}
