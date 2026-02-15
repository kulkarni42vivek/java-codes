package Java8.StreamApi;

import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class Stream5ParallelStream {
	public static void main(String[] args) {
		
		List<Integer> list = Stream.iterate(1, a->a+1)
				.limit(10000)
				.collect(Collectors.toList());
		
		long startTime = System.currentTimeMillis();
		List<Long> factorial = list.stream()
				.map(Stream5ParallelStream::factorial)
				.collect(Collectors.toList());
		
		long endTime = System.currentTimeMillis();
		
		System.out.println("time diff " + (endTime-startTime));
		
		// time calculation using parallelstream
		long startTime1 = System.currentTimeMillis();
		List<Long> factorial1 = list.parallelStream()
				.map(Stream5ParallelStream::factorial)
				.collect(Collectors.toList());
		
		long endTime1 = System.currentTimeMillis();
		
		System.out.println("time diff " + (endTime1-startTime1));
		
		// parallel streams should be used for independant tasks
		// should not be used for stateful or depending tssks
		// values passed inside the stream should be final or effectively final
		List<Integer> integers = Arrays.asList(1,2,3,4,5);
		
		AtomicInteger sum = new AtomicInteger(0);
		
		List<Integer> mappedValues = integers.stream().map(a->{
			return sum.addAndGet(a);
		}).collect(Collectors.toList());
		
		System.out.println(mappedValues);
		
		
		
		AtomicInteger sum2 = new AtomicInteger(0);
		
		List<Integer> mappedValues2 = integers.parallelStream().map(a->{
			return sum2.addAndGet(a);
		}).collect(Collectors.toList());
		
		System.out.println(mappedValues2);
		
		
		// parallel stream to sequential 
		List<Long> factorial12 = list.parallelStream().map(Stream5ParallelStream::factorial).sequential().collect(Collectors.toList());
		System.out.println(factorial12);
	}
	
	private static long factorial(int n) {
		long factorial = 1;
		for(int i= 1;i<n;i++) {
			factorial = factorial*i;
		}
		return factorial;
	}
}
