package CoreJava.Collections;

import java.util.Iterator;

class CustomListClass<T> implements Iterable<T>{
	private T[] items ; 
	private int size;
	
	public CustomListClass() {
		// TODO Auto-generated constructor stub
		size =  0  ;
		items =(T[]) new Object[100];
	}
	public void addItem(T value) {
		items[size] = value;
		size ++ ;
	}
	public T getItem(T index) {
		return items[(int) index];
	}
	@Override
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return null;
	}
	
	private class CustomIterator implements Iterator<T>{
		private CustomListClass<T> list;
		private int size = 0 ;
		public CustomIterator(CustomListClass<T> list) {
			this.list = list;
		}
		@Override
		public boolean hasNext() {
			return list.size > size ; 
		}

		@Override
		public T next() {
			T item = list.items[size];
			size ++;
			return item ;
		}
		
	}
}
public class CustomList{
	public static void main(String[] args) {
		CustomListClass<Integer> list = new CustomListClass() ; 
		list.addItem(25);
		list.addItem(45);
		
		System.out.println(list.getItem(0));
	}
}
