package Collection_Practicse;

import java.util.ArrayList;
import java.util.Iterator;

public class ex1Array_List {
public static void main(String[] args) {
	ArrayList al = new ArrayList();
	al.add("rachi");
	al.add(345);
	al.add('A');
	al.add(null);
	al.add(34.5f);
	
	System.out.println(al);
	System.out.println(al.get(0));
	System.out.println(al.isEmpty());
	System.out.println(al.contains('A'));
	System.out.println(al.size());
	
	// update the value
	
	al.set(0, "anu");
	System.out.println(al.get(0));
	System.out.println(al);
	
	//remove the element
	al.remove(1);
	System.out.println(al);
	al.remove(2);
	System.out.println("what"+al);
	System.out.println(al.get(2));
	
	//add the element
	
	al.add(0, "abcd");
	System.out.println(al);
	
	// print data using for loop
	
	for(int i=0;i<=al.size()-1;i++) {
		System.out.println(al.get(i));
	}
	System.out.println("+-------------------");
	
	// print data using for each loop
	
	for(Object s1: al) {
		System.out.println(s1);
	}
	
	System.out.println("--------print data using iterator cursor-------");
	Iterator itr = al.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
	
}
}
