package com.Jnit.training;

import java.util.PriorityQueue;

public class PriorityQueueMethods {

	public static void main(String[] args) {
		PriorityQueue<String> pq = new PriorityQueue<String>();
		
		pq.add("l");
		pq.add("s");
		pq.add("r");
		pq.add("m");
		pq.add("s");
		pq.add("h");
		pq.add("b");
		pq.add("p");
		
		System.out.println(pq);
		System.out.println(pq.contains("r")); 		//returns true if the given element is present in the queue
		pq.offer("j");  				//used to add the element to priority queue same as add().
		System.out.println(pq);
		pq.remove("p");					//used to remove the particular element form the queue
		System.out.println(pq);
		System.out.println(pq.spliterator()); 		//Creates a late-binding and fail-fast Split iterator over the elements in this queue
		System.out.println(pq.element()); 		//retrieves the head element.
		System.out.println(pq.remove()); 		//retrieves and removes the head of this queue
		System.out.println(pq.isEmpty()); 		//returns true if this collection contains no elements
		System.out.println(pq.toString()); 		//returns a string representation of this collection.
		System.out.println(pq.hashCode()); 		//Returns the hash code value for this collection
		System.out.println(pq.size()); 			//Returns the number of elements in this collection
		System.out.println(pq.parallelStream()); 	//Returns a possibly parallel Stream with this collection as its source.
		System.out.println(pq.stream()); 		//Returns a sequential Stream with this collection as its source.
	    System.out.println(pq.peek());  			//Retrieves, but does not remove, the head of this queue	
		System.out.println(pq.poll());  		//Retrieves and removes the head of this queue
		System.out.println(pq);
	    
		Object[] a = pq.toArray(); 			//Returns an array containing all of the elements in this queue
		System.out.println("The array is:"); 
        	for (int j = 0; j < a.length; j++) 
        		System.out.println(a[j]); 
		pq.clear();					 //removes all the elements in the queue
		System.out.println(pq);
		
	}

}
