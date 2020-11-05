package com.Exceptions;

public class NullPointerexception {
	public static void main(String args[]) 
    { 
        try { 
            String a = null;
            System.out.println(a.length()); 
        } 
        catch(NullPointerException npe) { 
            npe.printStackTrace();
        } 
    } 
}
