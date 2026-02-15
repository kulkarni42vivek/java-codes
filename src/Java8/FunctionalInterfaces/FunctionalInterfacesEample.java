package Java8.FunctionalInterfaces;

import java.util.*;
import java.util.Map.Entry;
import java.util.stream.Collectors;

import Java8.StreamApi.Student;

interface FunctionalInterface{
	public void add(int a , int b);
}
public class FunctionalInterfacesEample {
	public static void main(String[] args) {
		
		// functional interface usage using anonymous class
		FunctionalInterface face  = new FunctionalInterface() {
			public void add(int a , int b) {
				System.out.println(a+b);
			}
		};
		face.add(25, 30);
		
		// functional interface usage using lambda 
		FunctionalInterface face2 = (a,b)->{
			System.out.println(a+b);
		};
		face2.add(25, 32);
		
		// thread using lambda
		Thread thread  = new Thread(()->{
			try {
				Thread.sleep(1000);
				System.out.println("thread open");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		});
		thread.start();
		
		List<Student> list = new ArrayList<>();
		list.add(new Student(25,"vivek"));
		list.add(new Student(36,"sachin"));
		list.add(new Student(45,"sachin"));
		list.add(new Student(12,"sachin"));
		
		Collections.sort(list, (o1,o2)->{
			if(o1.getFirstName().equals(o2.getFirstName())) {
				return o1.getId() - o2.getId();
			}
			return o1.getFirstName().compareTo(o2.getFirstName());
		});
		
		Map<String, Integer> map = new HashMap<>();
		map.put("vivek", 25);
		map.put("sachin", 36);	
		map.put("TEST", 45);
		map.forEach((k,v)->{
			System.out.println(k+" "+v);
		});
		
		map.entrySet().stream().forEach(e-> System.out.println(e.getKey()+" "+e.getValue()));
		
		
		Map<String, Integer> map2 = new HashMap<>();
		map2.put("vivek", 25);
		map2.put("sachin", 36);
		map2.put("TEST", 45);
		map2.put("TEST2", 12);
		map2.put("TEST3", 15);
		
		// sort map 
		List<Map.Entry<String, Integer>> list2 = (List<Entry<String, Integer>>) map2.entrySet();
		
		Collections.sort(list2, new Comparator<Entry<String, Integer>>() {

			@Override
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
				return o2.getValue() - o1.getValue();
			}
			
		});
		
		Collections.sort(list2, (o1,o2)->{
			if(o1.getValue() == o2.getValue()) {
				return o1.getKey().compareTo(o2.getKey());
			}
			return o1.getValue() - o2.getValue();
		});
		
		map2.entrySet().stream().sorted((o1,o2)->o1.getValue()-o1.getValue()).collect(Collectors.toList());
		map2.entrySet().stream().sorted(Map.Entry.comparingByKey()).collect(Collectors.toList());
		
		list.stream().sorted(Comparator.comparing(Student::getId)).collect(Collectors.toList());
	}
}
