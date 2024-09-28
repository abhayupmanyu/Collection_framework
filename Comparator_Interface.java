package com.comparable;
import java.util.*;
 class Employee implements Comparable<Employee> {
	int emp_id;
	String name;
	int salary;
	Employee(int emp_id,String name,int salary){
		this.emp_id=emp_id;
		this.name=name;
		this.salary=salary;
	}
	public int compareTo(Employee e) {
		if(salary==e.salary)
			return 0;
		else if(salary>e.salary)
			return 1;
		else
			return -1;
	}
	

}

public class Comparator_Interface {
public static void main(String[] args) {
	
	ArrayList<Employee> a1=new ArrayList<Employee>();
	a1.add(new Employee(101,"MAHESH",200000));
	a1.add(new Employee(102,"SURESH",150000));
	a1.add(new Employee(103,"NEELESH",170000));
	a1.add(new Employee(104,"NARESH",150000));
//	a1.add(new Employee(105,"NARESH",160000));
	Collections.sort(a1);
	for(Employee a:a1) {
		System.out.println("emp_id"+a.emp_id+" "+" "+"employee name "+ a.name+" "+"emp salary "+ a.salary);
	}
	
	
	
	
	
	
	
}
}
