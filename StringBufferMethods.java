package com.Exceptions;

public class StringBufferMethods {
	public static void main(String args[])	{
	StringBuffer sb=new StringBuffer("Virat");
	
	System.out.println(sb);
	
	System.out.println(sb.append("Kohli"));			//combine and returns string 
	System.out.println(sb.replace(5, 10, " Captain"));	//replace the characters in given range
	System.out.println(sb.indexOf("i"));			//returns the index of a given character
	System.out.println(sb.substring(0, 5));			//returns sub string in given range
	System.out.println(sb.deleteCharAt(6));			//delete the character at given index.
	sb.setCharAt(2, 'A');					//replace the character at given index
	System.out.println(sb.equals("Virat"));			//returns true only when the given object address is equal to string object
	System.out.println(sb.charAt(1));			//returns the character at given index 
	System.out.println(sb.substring(2));			//returns the sub string from given index
	System.out.println(sb.reverse());			//reverse the string
	}
}
