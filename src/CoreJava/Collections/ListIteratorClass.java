package CoreJava.Collections;

import java.util.*;
public class ListIteratorClass {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(25);
		list.add(85);
		list.add(894);
		list.add(142);
		list.add(123);
		
		ListIterator<Integer> itr = list.listIterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		while(itr.hasPrevious()) {
			System.out.println(itr.previous());
		}
	}
}
