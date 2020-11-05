package com.Exceptions;

public class ArrayIndexOutOfBoundexception {
	 public static void main(String args[]) 
	    { 
	        try{ 
	            int x[] = new int[10]; 
	            x[11] = 9;
	        } 
	        catch(ArrayIndexOutOfBoundsException ae){ 
	           ae.printStackTrace(); 
	        } 
	    } 
}
