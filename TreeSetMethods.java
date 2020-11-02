package com.Jnit.training;

import java.util.ArrayList;
import java.util.TreeSet;

public class TreeSetMethods {

	public static void main(String[] args) {
		TreeSet<String> ts = new TreeSet<String>();
		
		ts.add("l");
		ts.add("s");
		ts.add("r");
		ts.add("m");
		ts.add("n");
		ts.add("h");
		ts.add("b");
		ts.add("p");
		
		System.out.println(ts);
		System.out.println(ts.ceiling("b")); 		//returns the least element in this set greater than or equal to the given element
		System.out.println(ts.clone());
		
		System.out.println(ts.contains("r")); 		//will return true if given element is present in TreeSet else it will return false.
		System.out.println(ts.descendingIterator()); 	// returns an iterator over the elements in this set in the descending order
		System.out.println(ts.descendingSet()); 	//returns a reverse order view of the elements contained in this set.
		System.out.println(ts.first());  		//return first element in TreeSet
		System.out.println(ts.floor("h")); 		//returns the greatest element in this set less than or equal to the given element
		System.out.println(ts.headSet("r")); 		//will return elements of TreeSet which are less than the specified element.
		System.out.println(ts.headSet("r", true)); 	//will include the element given
		System.out.println(ts.higher("r")); 		//returns the least element in this set strictly greater than the given element
		System.out.println(ts.isEmpty()); 		//return false if this set contains elements
		System.out.println(ts.last()); 			//return the last element in the set.
		System.out.println(ts.lower("h")); 		//returns the greatest element less than the given element
		System.out.println(ts.pollFirst());  		//returns and removes the first element
		System.out.println(ts.pollLast());	 	// returns and removes the last element 
		System.out.println(ts.size()); 			// returns the size of the set
		System.out.println(ts.tailSet("h"));  		// returns the elements greater than the given elements 
		System.out.println(ts.tailSet("h", true)); 	// returns the elements equals and greater than given element
		
		System.out.println(ts.subSet("r", "l")); 	//returns the subset
		
		ts.remove("p"); 				//removes the element 
		System.out.println(ts);
		
		ArrayList<String> al = new ArrayList<String>();
		al.add("hello");
		al.add("world");
		ts.addAll(al);					// addAll() will add all elements of specified Collection to the set.
		System.out.println(ts);
	}

}
