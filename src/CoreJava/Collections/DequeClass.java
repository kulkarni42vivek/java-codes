package CoreJava.Collections;

import java.util.*;
public class DequeClass {
	
	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<>();
		queue.offer(25);
		queue.offer(45);
//		queue.offer(95520);
//		System.out.println(queue.peek());
//		System.out.println(queue.poll());
//		System.out.println(queue.peek());
//		System.out.println(queue.contains(45));
		
		
//		Stack<Integer> stack = new Stack<>();
//		stack.push(25);
//		stack.push(56);
//		stack.push(250);
//		stack.push(5230);
//		
//		while(!stack.isEmpty()) {
//			int value = stack.pop();
//			System.out.println(value);
//		}
		
		
		// most important note
		// if you want to use stack - use linked list or stack 
		// if you want basic lifo queue - use linkedlist 
		// if you want doubley ended queue - use arraydeque
		
		ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();
		arrayDeque.add(250);
		arrayDeque.add(45);
		arrayDeque.add(89);
		
		
		// main methods of doubly ended queue
		arrayDeque.offerFirst(25);
		arrayDeque.offerLast(36);
		System.out.println(arrayDeque.getFirst());
		System.out.println(arrayDeque.getLast());
		
		System.out.println(arrayDeque.pollFirst());
		System.out.println(arrayDeque.pollLast());
		
		System.out.println(arrayDeque.peekFirst());
		System.out.println(arrayDeque.peekLast());
		System.out.println(arrayDeque.peek());
	}
}
