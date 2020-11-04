package com.ClassPrograms;
//Factorial using for loop
public class Factorial1 {
	public static void main(String args[])
	{
		int i=1,n=7,fact=1;
		for(i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		System.out.println("Factorial: " +fact);
	}
}
