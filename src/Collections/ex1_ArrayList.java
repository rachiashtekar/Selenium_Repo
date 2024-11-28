package Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ex1_ArrayList {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add("rahul");
		al.add(101);
		al.add(65.5f);
		al.add('A');
		al.add(null);
		
		System.out.println(al);
		System.out.println(al.size());
		System.out.println(al.get(0));
		System.out.println(al.contains(null));
		System.out.println(al.isEmpty());
		
		//update data
		al.set(0, "Rachi");
		System.out.println(al);
		System.out.println(al.get(0));
		
		//add data in between Arraylist -> right shift operation
		
		al.add(3, 300);
		System.out.println(al);
		
		System.out.println(al.get(3));
		
		//remove data in between Arraylist-> left shift operation
		al.remove(3);
		System.out.println(al);
		
		System.out.println("------print data using: for loop------");
		for(int i=0;i<=al.size()-1;i++) {
			System.out.println(al.get(i));
		}
		
		System.out.println("------print data using:for each loop-----");
		for(Object s2:al)
		{
			System.out.println(s2);
		}
		
		System.out.println("--------print data using : Iterator cursor ---------");
		Iterator itr = al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
		
	}

}

//Iterator itr = al.iterator();
//
//The iterator() method of the ArrayList returns an Iterator object for the list al.
//An Iterator is an object that provides methods to traverse or iterate through a collection (like an ArrayList).
//while(itr.hasNext())
//
//The hasNext() method checks if there are more elements left in the collection to iterate over.
//If there are more elements, it returns true and the loop continues. If not, the loop ends.
//System.out.println(itr.next());
//
//The next() method of the Iterator returns the next element in the collection and moves the iterator forward.
