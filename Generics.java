package com.generics;

 class Test <T,V>{
	 T obj1;
	 V obj2;
	 Test(T obj1,V obj2){
		 this.obj1=obj1;
		 this.obj2=obj2;
	 }
	 
	 public void print() {
		 System.out.println(obj1);
		 System.out.println(obj2);
	 }
	 

}
 public class Generics{
	 public static void main(String [] args) {
		 Test<Integer,String> t=new Test<Integer,String>(101,"new delhi");
		 System.out.println("value are");
		 t.print();
		 
	 }
 }
