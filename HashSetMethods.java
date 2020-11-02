package com.Jnit.training;

import java.util.HashSet;

public class HashSetMethods {

	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>();
		hs.add("l");
		hs.add("s");
		hs.add("r");
		hs.add("m");
		hs.add("s");
		hs.add("h");
		hs.add("b");
		hs.add("p");
		
		System.out.println(hs);
		System.out.println(hs.size()); 			//returns the size of the HashSet
		System.out.println(hs.isEmpty()); 		//returns boolean weather the elements are present or not
		System.out.println(hs.contains("r")); 		//return true if an element is present in set 
		System.out.println(hs.remove("p"));   		//removes the element if it is present in set
		System.out.println(hs.clone());			// will make another copy of the HashSet
		System.out.println(hs.iterator());  		//return an iterator over the element in the set
		hs.clear(); 					//clears all the elements present in the HashSet
		System.out.println(hs);
	}

}
