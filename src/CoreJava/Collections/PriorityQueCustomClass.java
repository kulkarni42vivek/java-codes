package CoreJava.Collections;
import java.util.*;

class Student{
	
	int math ;
	int science;
	
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getScience() {
		return science;
	}
	public void setScience(int science) {
		this.science = science;
	}
	
	public Student(int math, int science ) {
		this.math = math;
		this.science = science ;
	}
	
}

public class PriorityQueCustomClass {
	public static void main(String[] args) {
		
		ArrayList<Student> list = new ArrayList<>();
		list.add(new Student(25,45));
		list.add(new Student(35,45));
		list.add(new Student(45,45));
		list.add(new Student(25,85));
		list.add(new Student(42,25));
		list.add(new Student(11,45));
		list.add(new Student(12,45));
		
		PriorityQueue<Student> pq = new PriorityQueue<>(list);
		System.out.println(pq);
	}
}
