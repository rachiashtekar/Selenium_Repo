package Collections;

import java.util.Iterator;
import java.util.TreeSet;

public class ex6_TreeSet2 {
	public static void main(String[] args) {
		TreeSet ts = new TreeSet(); 
//		ts.add("rachi");   // so in treeset we can add only one type of data
		ts.add(102);
		ts.add(101);
		ts.add(108);
		ts.add(105);
		ts.add(103);
		ts.add(104);
		ts.add(107);
		ts.add(106);
		
		System.out.println(ts);
		System.out.println(ts.size());
		System.out.println(ts.contains(102));
		
		ts.remove(108);
		System.out.println(ts);
	
		
		//get first data
		System.out.println(ts.first());
		
		//get last data
		
		System.out.println(ts.last());
		
		//delete data from first position
		ts.pollFirst();
		System.out.println(ts);
		
		//delete data from second position
		
		ts.pollLast();
		System.out.println(ts);
		
		// print data using for each loop
		for(Object s1 : ts) {
			System.out.println(s1);
		}
		
		//print data for using iterator cursor
		
		Iterator itr = ts.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		//print data using decending iterator cursor
		Iterator dlitr =ts.descendingIterator();
		while(dlitr.hasNext())
		{
			System.out.println(dlitr.next());
		}
		
		
	}

}
