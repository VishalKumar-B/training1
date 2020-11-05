package com.Exceptions;

public class StringIndexOutOfBoundexception {
	public static void main(String args[]) 
    { 
        try { 
            String s = "I love my country"; 
            char c = s.charAt(20); 
            System.out.println(c); 
        } 
        catch(StringIndexOutOfBoundsException se) { 
        	se.printStackTrace(); 
        } 
    } 
}
