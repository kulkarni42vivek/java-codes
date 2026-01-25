package CoreJava.OOPS;

class Vehicle1{
	private String color;
	
	Vehicle1(String color){
		this.color = color;
	}
	
	public String getColor(){
		return this.color;
	}
}
public class Encapsulation {
	public static void main(String[] args) {
		Vehicle1 vh = new Vehicle1("red");
		
	}
}
