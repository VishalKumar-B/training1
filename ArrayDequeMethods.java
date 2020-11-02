package com.Jnit.training;

import java.util.Iterator;
import java.util.ArrayDeque;

public class ArrayDequeMethods {

	public static void main(String[] args) {
		ArrayDeque<String> ad=new ArrayDeque<>();
		ad.add("mi");
		ad.add("csk");
		ad.add("srh");
		ad.add("rr");
		ad.add("dd");
		ad.add("kkr");
		System.out.println(ad);
		System.out.println(ad.size());		//returns the size of PriorityQueue
		ad.remove(5);				//remove the value of index
		System.out.println(ad.peek()); 		//returns the first element from list
		System.out.println(ad.poll()); 		//returns the first element from list and remove from it
		Iterator<String> i=ad.iterator();
		
		while (i.hasNext()) {
			System.out.print(i.next()+" ");
		}
		System.out.println(ad.isEmpty());		//it checks whether PriorityQueue empty or not
		System.out.println(ad.contains("csk"));		//it checks whether the String is there in PriorityQueue or not
		ad.clear();					//it clears the data
		System.out.println(ad.isEmpty());
		System.out.println(ad.removeAll());		//removes all the elements in arraydequeue

	}

}