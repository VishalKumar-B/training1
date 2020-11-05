package com.Exceptions;

public class NumberFormatexception {
	public static void main(String args[]) 
    { 
        try { 
            int n = Integer.parseInt("virat") ; 
            System.out.println(n); 
        } 
        catch(NumberFormatException ne) { 
             ne.printStackTrace();
        } 
    } 
}
