package com.Exceptions;

public class Arithmeticexception {
	public static void main(String args[]) 
    { 
        try { 
            int a = 30, b = 0; 
            int c = a/b;  
            System.out.println (c); 
        } 
        catch(ArithmeticException ae) { 
            ae.printStackTrace(); 
        } 
    } 
}
