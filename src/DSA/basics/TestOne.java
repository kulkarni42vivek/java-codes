package DSA.basics;

interface Test{
	public void call();
}
public class TestOne {
	int a = 2 ;
	public static void main(String[] args) {
		
		Test test  = () -> {
			System.out.println("hello");
		};
		test.call();
		
		Test testano = new Test() {
			int x = 5;
			@Override
			public void call() {
				System.out.print("bello");
				this.x = 5;
			}
			
		};
		testano.call();
		
		
	}
}
