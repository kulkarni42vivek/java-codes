package CoreJava.Collections;

import java.util.Iterator;

class TestList<T> implements Iterable<T>{
	private T[] array ;
	private int size ;
	
	TestList(){
		size =  0  ;
		array =(T[]) new Object[100];
	}
	
	void addItem(T value ) {
		array[size] = value;
		size++;
	}
	
	T getItem(T value) {
		return array[(int) value];
	}
	
	
	@Override
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}

public class TestClass{
	
	
	
	public static void main(String[] args) {
		
	}
}
