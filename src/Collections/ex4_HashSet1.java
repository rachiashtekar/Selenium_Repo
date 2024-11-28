package Collections;

import java.util.HashSet;
import java.util.Iterator;

public class ex4_HashSet1 {
public static void main(String[] args) {
	
	HashSet hs = new HashSet();
	hs.add("rachi");
	hs.add(101);
	hs.add('A');
	hs.add(75.5f);
	hs.add(null);
	hs.add(101);
	hs.add(null);
	
	System.out.println(hs);
	System.out.println(hs.size());
	System.out.println(hs.isEmpty());
	System.out.println(hs.contains("rachi"));
	
	
	hs.remove('A');
	System.out.println(hs);
	
	System.out.println("----print data using :for each loop----");
	for(Object s1: hs) {
		System.out.println(s1);
	}
	
	System.out.println("---print data using:Iterator-----");
	Iterator itr = hs.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
		
	}
	System.out.println("-----------");
//	hs.clear();
	System.out.println(hs.size());
	
	
	//Both strings are stored in their own memory locations inside the HashSet, even though they are of the same type (String).
	
}
}
