package LinkedHashset;
import java.util.*;
public class Linkedhashset {
public static void main(String[] args) {
	LinkedHashSet h1=new LinkedHashSet();
	h1.add(100);
	h1.add("litchi");
	h1.add(true);
	h1.add(20);
	h1.add(500);
	 LinkedHashSet h2=new LinkedHashSet();
	 h2.add(800);
	 h2.add("prachi");
	 h2.add(400);
	  System.out.println(h1);
	  h1.addAll(h2);
	  for(Object e: h1) {
		  System.out.println(e);
		  
	  }
	 
	
	
	
	
	
	
}
}
