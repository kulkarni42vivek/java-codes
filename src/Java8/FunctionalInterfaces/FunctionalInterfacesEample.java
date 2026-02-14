package Java8.FunctionalInterfaces;

interface FunctionalInterface{
	public void add(int a , int b);
}
public class FunctionalInterfacesEample {
	public static void main(String[] args) {
		
		// functional interface usage using anonymous class
		FunctionalInterface face  = new FunctionalInterface() {
			public void add(int a , int b) {
				System.out.println(a+b);
			}
		};
		face.add(25, 30);
		
		// functional interface usage using lambda 
		FunctionalInterface face2 = (a,b)->{
			System.out.println(a+b);
		};
		face2.add(25, 32);
		
		// thread using lambda
		Thread thread  = new Thread(()->{
			try {
				Thread.sleep(1000);
				System.out.println("thread open");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		});
		thread.start();
	}
}
