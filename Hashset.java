package com.hashset;
import java.util.*;
public class Hashset {
	public static void main(String [] main) {
		HashSet h1=new HashSet();
	h1.add(100);
	h1.add(null);
	h1.add(200);
	h1.add('A');
	h1.add(100);
	for(Object i:h1) {
		System.out.println(i);
	}
		
		
		System.out.println(h1.contains('A'));
		h1.toArray(new Object[20]);
		System.out.println(h1);
		
		
	for(Object j:h1) {
		System.out.println(j);
	}
Iterator<Object> i= h1.iterator();
while(i.hasNext()) {
	Object ele=i.next();
	System.out.println(ele);
	
}
HashSet h2=new HashSet();
h2.add(100);
h2.add(500);
h2.add(460);
h1.retainAll(h2);
System.out.println(" ");
System.out.println(h1);
	}

}
