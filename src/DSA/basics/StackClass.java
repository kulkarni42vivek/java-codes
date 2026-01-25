package DSA.basics;

class StackArray {
	int arr[];
	int top;
	
	StackArray(int value){
		this.top = -1;
		arr = new int[value];
	}
	
	void push(int value) {
		if(this.isFull()) {
			System.out.println("full");
		}
		else {
			arr[top+1] = value;
			top++;
		}
	}
	int pop() {
		if(this.isEmpty()) {
			System.out.println("empty");
			return -1;
		}
		else {
			int value = arr[top];
			top--;
			return value;
		}
	}
	int peek() {
		if(this.isEmpty()) {
			return -1;
		}
		else {
			return arr[top];
		}
	}
	boolean isEmpty() {
		if(top < 0) {
			return true;
		}
		else {
			return false ;
		}
	}
	boolean isFull() {
		if(top == arr.length-1) {
			return true;
		}
		else {
			return false;
		}
	}
}
public class StackClass {

}
