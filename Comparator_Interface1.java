package com.comparator;

import java.util.*;


 class Employee <Employee> {
	int id;
	String name;
	double salary;
	Employee(int id,String name,double salary){
		this.id=id;
		this.name=name;
		this.salary=salary;
	}

}
 
class Name implements Comparator<Employee> {

		@Override
		public int compare(Employee o1, Employee o2) {
			// TODO Auto-generated method stub
			return o1.name.compareTo(o2.name);
			
		}
			}


 class Salary implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub.
		if(o1.salary==o2.salary)
		return 0;
		else if(o1.salary>o2.salary)
			return 1;
		else
			return -1;
	}
	

}

public class Comparator_Interface1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Employee> a1=new ArrayList<Employee>();
		a1.add(new Employee(101,"govind",100000));
		a1.add(new Employee(102,"rahul",150000));
		a1.add(new Employee(103,"snajeev",70000));
		a1.add(new Employee(104,"rakesh",90000));
		
		
		Collections.sort(a1,new Salary());
		System.out.println("sorting by salary+ ");
		for(Employee e1:a1) {
			System.out.println(e1.id+" "+e1.name+" "+e1.salary);
		}
		
		System.out.println("  ");

System.out.println("sorting by name ");
Collections.sort(a1,new Name());
for(Employee e2:a1) {
	System.out.println(e2.id+" "+e2.name+" "+e2.salary);
}
	}

}
