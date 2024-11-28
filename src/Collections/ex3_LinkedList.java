package Collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class ex3_LinkedList {
	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.add("rachi");
		ll.add(102);
		ll.add('A');
		ll.add(77.5f);
		ll.add(null);
		ll.add(102);
		ll.add(null);
		
		System.out.println(ll);
		System.out.println(ll.size());
		System.out.println(ll.get(3));
		System.out.println(ll.isEmpty());
		System.out.println(ll.contains(102));
		
		//update data
		
	    ll.set(0, "aniket");
		System.out.println(ll);
		System.out.println(ll.get(0));
		
		//add data in between LinkedList
		ll.add(4,600);
		System.out.println(ll);
		
		//remove data in between linkedList
		ll.remove(4);
		System.out.println(ll);
		
		System.out.println("---------print data for using for loop------");
		for(int i=0;i<=ll.size()-1;i++) {
			System.out.println(ll.get(i));
		}
		
		System.out.println("------print data for using for each loop----");
		for(Object s1 :ll) {
			System.out.println(s1);
		}
		System.out.println("--------print data iterator cursor--------");
		Iterator itr = ll.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("--------print data using listiterator cursor-------");
		ListIterator litr = ll.listIterator();
		while(litr.hasNext()) {
			System.out.println(litr.next());
		}
		
		

}
}
