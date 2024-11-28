package Collection_Practicse;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList_mock {
	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.add("rachi");
		ll.add(34);
		ll.add(56.7f);
		ll.add('A');
		
		System.out.println(ll);
		
		System.out.println("-----print data using iterator---");
		
		Iterator itr = ll.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
		System.out.println("----update the rachi as RACHI");
		
		ll.set(0, "RACHI");
		System.out.println(ll.get(0));
		
	}
	

}
