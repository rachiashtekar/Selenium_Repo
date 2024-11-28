package Collections;

import java.util.ArrayList;
import java.util.HashSet;

public class ex4_Hashset2 {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add("amol");
		al.add(101);
		al.add('A');
		al.add(75.5f);
		al.add(null);
		al.add(101);
		al.add(null);
		al.add('A');
		
		System.out.println(al);
		
		HashSet hs = new HashSet(al);     // here we have created hashset from the array 
		System.out.println(hs);
		hs.add("new element");
		System.out.println(hs);     // here we can add the value 
		
		
	}

}
