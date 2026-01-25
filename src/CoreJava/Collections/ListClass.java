package CoreJava.Collections;

// test comments 
//first interface is iterable and collections interface implements iterable and 
//collection is extended by three interfaces list , set and queue 
//list is implemented by arraylist linked list and vector 
import java.util.*;

public class ListClass {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(12);
		list.add(25);
		list.add(85);
		list.add(65);
		list.add(86);
		list.add(441);
		list.add(32);
		
//		for(Integer i : list) {
//			System.out.println(i);
//		}
		Iterator itr = list.iterator();
//		while(itr.hasNext()) {
//			System.out.println(itr.next());
//		}
//		
		list.set(1, 85);
		list.set(3,56);
//		for(Integer value : list) {
//			System.out.println(value);
//		}
		
		ArrayList<Integer> copyList = new ArrayList<>(list);
		copyList.addAll(list) ; 
		System.out.println(copyList.toString());
		
		System.out.println(copyList.indexOf(85));
		
		
	}
}
