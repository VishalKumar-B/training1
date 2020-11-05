package com.Exceptions;

public class StringMethods {
	public static void main(String args[])	{
		String s = "Virat Kohli is number 1 ODI & T20 batsman.";
		System.out.println(s.toLowerCase());		//converts to lower case
		System.out.println(s.toUpperCase());		//converts to Upper case
		System.out.println(s.isEmpty());		//checks whether the string is empty or not
		System.out.println(s.isBlank());        	//same as isEmpty()
		System.out.println(s.lastIndexOf('s')); 	//returns the the last index of the given character
		System.out.println(s.trim());			//removes the space at starting and ending
		System.out.println(s.charAt(1));		//returns the character which is at given index
		System.out.println(s.indexOf('n'));		//returns the the index of a given character
		String[] s1=s.split(" ");			//it split into array using with given char
		System.out.println(s1[0]);
		System.out.println(s.substring(6));		//returns sub string from given index
		System.out.println(s.substring(6, 11));		//return sub string in given range
		char[] s2=s.toCharArray();			//it will split to character array
		System.out.println(s2[0]+" "+s2[6]);
		
		System.out.println(s.equals("Virat Kohli is number 1 ODI & T20 batsman")); 		//returns true only when given string is equal
		System.out.println(s.equalsIgnoreCase("virat kohli is number 1 ODI & T20 batsman")); 	//returns true only when given string is equal and it ignores the upper case or lower case
		System.out.println(s.concat(" He is team India captain"));				//combines and returns string but it doesn't store
	}
}
