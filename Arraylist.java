package com.list;
import java.util.*;
public class Arraylist {

	public static void main(String[] args) {
		ArrayList<Integer> a1=new ArrayList<>();
		
		a1.add(24);
		a1.add(52);
		a1.add(100);
		a1.add(200);
		System.out.println(a1);
		a1.remove(1);
		System.out.println(a1);
		System.out.println(a1.size());
		a1.set(2,500 );
		
		ArrayList a2=new ArrayList();
		a2.add(45);
		a2.add(54);
		a2.add("williamson");
		a2.add(true);
		a2.add(null);
		System.out.println(a2);
		System.out.println(a2.contains("williamson"));
		System.out.println(a2.size());
		a2.set(1,"java");
		System.out.println(a2.get(3));
		for(Object o:a2) {
			System.out.println("data is"+o);
		}
		ArrayList a3=new ArrayList();
		a3.addAll(a1);
		System.out.println(a3);
		System.out.println(a1.size());
//		System.out.println(a1.ensureCapacity()));
	
	}

}
