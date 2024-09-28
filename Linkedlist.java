package list;
import java.util.*;
public class Linkedlist {
	public static void main(String [] args) {
	LinkedList<Integer> l1=new LinkedList<>();
	l1.addFirst(50);
	l1.add(100);
	l1.add(200);
	System.out.println(l1);
	LinkedList<Integer> l=new LinkedList<>();
	l.addFirst(500);
	l.add(400);
	l.addLast(1000);
	l1.addAll(l);
	System.out.println(l1);
	l1.removeFirst();
	l1.removeLast();
	for(int i:l1) {
		System.out.println(i);
		
	}
	
	System.out.println(l1.contains((500)));
	System.out.println(l1);
	l1.add(2,800 );
 System.out.println(l1);
 System.out.println(l1.isEmpty());
 System.out.println(l1.size());

}
}