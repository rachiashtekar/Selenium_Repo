package Collection_Practicse;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class ex2_Vector {
	public static void main(String[] args) {
		Vector v= new Vector();
		v.add("rachi");
		v.add(101);
		v.add(65.5f);
		v.add('A');
		v.add(null);
		v.add(null);
		v.add("rachi");
		
		System.out.println(v);
		System.out.println(v.size());
		System.out.println(v.get(6));
		System.out.println(v.isEmpty());
		System.out.println(v.contains(101));
		
		// update the value
		
		v.set(6, "aniket");
		System.out.println(v);
		
		//remove the element
		v.remove(5);
		System.out.println(v);
		
		//for loop
		for (int i=0 ;i<=v.size()-1;i++) {
			System.out.println(v.get(i));
		}
		System.out.println("============================================");
		// for each loop
		for (Object s1 : v) {
			System.out.println(s1);
		}
		
		System.out.println("==========================================");
		
		Iterator itr = v.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("-----data using listiterator cursor-----");
		ListIterator litr = v.listIterator();
		while(litr.hasNext()) {
			System.out.println(litr.next());
		}
	
		System.out.println("------data using enumeration---------");
		Enumeration enu = v.elements();
		while(enu.hasMoreElements()) {
			System.out.println(enu.nextElement());
		}
}
}
