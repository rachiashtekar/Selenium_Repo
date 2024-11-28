package Collection_Practicse;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class ex3LinkedList {
	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.add("rachi");
		ll.add(45);
		ll.add(25);
		ll.add('A');
		ll.add(null);
		
		System.out.println(ll);
		System.out.println(ll.size());
		System.out.println(ll.get(2));
		System.out.println(ll.isEmpty());
		System.out.println(ll.contains("rachi"));
		
		ll.add(2, 56);
		System.out.println(ll.get(3));
		// update the element
		
		ll.set(1, 34.7f);
		System.out.println(ll);
		
		//remove the value
		
	ll.remove(3);
	System.out.println(ll);
	
	// add the element
	
	ll.add(2, "element");
	System.out.println(ll);
	
	// for loop
	
	for(int i=0;i<=ll.size()-1;i++) {
		System.out.println(ll.get(i));
	}
	
	// for each
	System.out.println("-------------------------------------");
	for(Object s2 : ll) {
		System.out.println(s2);
	}
	
	System.out.println("-----------------------------------");
     System.out.println("--------print data using Iterator---------");
     
     Iterator itr = ll.iterator();
     while(itr.hasNext()) {
    	 System.out.println(itr.next());
     }
     
     System.out.println("----------print data using listIterator----------");
     ListIterator litr = ll.listIterator();
     while(litr.hasNext()) {
    	 System.out.println(litr.next());
     }
    		 
     
		
	}

}
