package Collections;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class ex5_LinkedHashset1 {
public static void main(String[] args) {
	LinkedHashSet lhs = new LinkedHashSet();
	lhs.add("amol");
	lhs.add(101);
	lhs.add('A');
	lhs.add(75.5f);
	lhs.add(null);
	lhs.add(101);
	lhs.add("amol");
	
	
	System.out.println(lhs);
	System.out.println(lhs.size());
	System.out.println(lhs.isEmpty());
	System.out.println(lhs.contains("amol"));
	
	lhs.remove('A');
	System.out.println(lhs);
	
	
	
	lhs.add("rachi");     // here i have added the value
	System.out.println(lhs);
	
	System.out.println("-- print data using for each loop ---");
	for(Object s1:lhs) {
		System.out.println(s1);
	}
	System.out.println("---print data using:Iterator----");
	Iterator itr = lhs.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
	System.out.println("----------");
//	lhs.clear();
	System.out.println(lhs.size());
	
	
}
}
