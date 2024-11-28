package Collections;

import java.util.ArrayList;

public class ex7_generic1 {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("mahesh");
		al.add("rachi");
		al.add("suresh");
		al.add("suresh");
		al.add("anu");
		System.out.println(al);
		
		for(String s1 : al) {
			System.out.println(s1);
		}
	}

}
