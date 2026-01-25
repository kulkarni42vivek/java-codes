package CoreJava.OOPS;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;


class Student implements Comparable<Student>{
	int id ;
	String name;
	
	Student(int id , String name){
		this.id = id;
		this.name = name;
	}
	
	public int compareTo(Student s) {
		//compare by name first and then id 
		int nameCompare = this.name.compareTo(s.name);
		if(nameCompare == 0) {
			return this.id - s.id;
		}
		return nameCompare;
	}
	
}
public class ComparableClass {
	public static void main(String[] args) {
		Student s1 = new Student(1,"jlice");
		Student s2 = new Student(2,"bob");
		Student s3 = new Student(3,"klice");
		Student s4 = new Student(1,"Alice");
		List<Student> list  = Arrays.asList(s1,s2,s3,s4);
		Collections.sort(list);
		for(Student s: list) {
			System.out.println(s.name + " " + s.id);
		}
	}
}
