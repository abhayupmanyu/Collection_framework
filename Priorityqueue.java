package com.priorityqueue;
import java.util.*;
public class Priorityqueue {
	public static void main(String[] args) {
		PriorityQueue p1=new PriorityQueue();
	
//		p1.remove();
	System.out.println(p1.poll());
//		System.out.println(p1.element());
		System.out.println(p1.peek());
		System.out.println(p1);
		p1.add("java");
		p1.add("python");
		p1.add("c++");
		p1.add("c#");
		p1.add("swift");
		p1.add("swift");
//		p1.add(10);
		for(Object i:p1) {
			System.out.println(i);
		}
		
		System.out.println(p1.offer("kotlin"));
		p1.offer("javascript");
		p1.offer("ruby");
		System.out.println(p1);
		
		
		p1.remove();
		System.out.println(p1);
		
		
		System.out.println(p1.element());
//		System.out.println(p1);
		System.out.println(p1.peek());
	}

}
