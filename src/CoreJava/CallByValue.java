package CoreJava;

// Java is always call be value 
// In case of primitive value is passed 
// In case of object - value of reference is passed

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
	
	// Here value of reference is passed , new array is not getting created 
	// Value of reference is passed therefore original array is changed
	public int[] changeArrayValue(int[] array) {
		array[0] = 25;
		return array;
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
