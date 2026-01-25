package CoreJava.OOPS;

interface mobile{
	// it has abstract methods and fields are final and static 
	// also static methods and default methods
	
	int value=1;
	void makeCall();
}
class SmartPhone implements mobile{

	@Override
	public void makeCall() {
		// TODO Auto-generated method stub
		
	}
	
}
public class InterfaceImplentation {
	public static void main(String[] args) {
		System.out.println(mobile.value);
	}
}
