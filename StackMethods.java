package com.Jnit.training;

import java.util.Stack;

public class StackMethods {

	public static void main(String[] args) {
		Stack<String> s = new Stack<String>();
		
		s.push("mi");
		s.push("srh");
		s.push("rr");
		s.push("dc");
		s.push("csk");
		s.push("kkr");
		s.push("kxip");
		s.push("blr");
		
		System.out.println(s);
		
		System.out.println(s.isEmpty());  	//returns true if nothing is on the top of the stack else returns false.
		System.out.println(s.peek());  		//returns the element on the top of the stack but does not remove it.
		System.out.println(s.pop());  		//removes and returns the top element of the stack
		System.out.println(s.push("knockout")); //Pushes an element on the top of the stack.
		System.out.println(s.search("srh"));  	//it determines whether an object exists in the stack if the element is found, it returns the position of the element from the top of the stack. Else, it returns -1
		System.out.println(s);
		
		
	}

}
