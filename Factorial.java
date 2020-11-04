package com.ClassPrograms;
//Factorial using while loop
public class Factorial {
	public static void main(String args[])
	{
		int i=1,n=7,fact=1;
		while(i<=n)
		{
			fact=fact*i;
			i++;
		}
		System.out.println("facttorial: " +fact);
		
	}
}
