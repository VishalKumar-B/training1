package com.ClassPrograms;
//Factorial using do-while loop
public class Factorial2 {
	public static void main(String args[])
	{
		int n=7,fact=1,i=1;
		do
		{
			fact=fact*i;
			i++;
		} while(i<=n);
		System.out.println("Factorial: " +fact);
	}
}
