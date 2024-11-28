package Collections;

import java.util.TreeSet;

public class ex6_TreeSet1 {
	public static void main(String[] args) {
		TreeSet ts = new TreeSet();
		ts.add("rahul");
		ts.add("mahesh");
		ts.add("ramesh");
		ts.add("suresh");
		ts.add("ramesh");
//		ts.add(null)   we cant add the null value as  well as duplicate value
		
		System.out.println(ts);
	}

}
