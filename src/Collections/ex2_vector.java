package Collections;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class ex2_vector {
	public static void main(String[] args) {
		Vector v= new Vector();
		v.add("rachi");
		v.add(101);
		v.add(65.5f);
		v.add('A');
		v.add(null);
		
		System.out.println(v.capacity());
		System.out.println(v.size());
		System.out.println(v.get(0));
		System.out.println(v.contains(101));
		System.out.println(v.isEmpty());
		
		//update data
		
		v.set(0, "aniket");
		System.out.println(v);
		
		//add data in between vector-> right shift operation
		v.add(4,100);
		System.out.println(v);
		
		//remove data in between left shift operation
		
		v.remove(4);
		System.out.println(v);
		
		System.out.println("---------------print data for using for each loop---------------- ");   
		for(int i=0;i<=v.size()-1;i++) {
			System.out.println(v.get(i));
		}
		System.out.println("--------------print data for using for each loop--------------");
		for (Object s1:v) {
			System.out.println(s1);
		}
		System.out.println("----------print data using:Iterator cursor---------");
		Iterator itr = v.iterator(); // copy all the data
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("-----------print data using: ListItrator cursor-------------------");
		ListIterator litr = v.listIterator() ;
		while(litr.hasNext()) {
			System.out.println(litr.next());
		}
		System.out.println("--------print data using:Enumeration cursor-----------");
		Enumeration enu = v.elements();
		while(enu.hasMoreElements()) {
			System.out.println(enu.nextElement());
		}
		System.out.println("---------------");
//	    v.clear();
//	    System.out.println(v.size());
//		
		
		
		
		
		
	}

}
