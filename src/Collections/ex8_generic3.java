package Collections;

import java.util.TreeSet;

public class ex8_generic3 {
	public static void main(String[] args) {
		TreeSet <String> ts = new TreeSet<String>();
		ts.add("shu");
		ts.add("dtu");
		ts.add("anu");
		ts.add("aa");
	
		
		for(String num : ts) {
			System.out.println(num);
		}
	}

}
