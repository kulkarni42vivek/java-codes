package CoreJava;

class TestObject {
	int data;
	TestObject(int data) {
		this.data = data;
	}
	void changeData(int data) {
		this.data = data;
	}
}
public class CallByValue {
	public static void swap(int a, int b) {
		int temp = a;
		a = b ;
		b = temp ;
	}
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

		System.out.println(a+ " " + b);
        swap(a, b);
		System.out.println(a+ " " + b);
		
		TestObject s1 = new TestObject(25);
		s1.changeData(50);
		System.out.println(s1.data);
    }
}
