package com.ClassPrograms;
//pattern using nested for loop
public class Pattern1 {
	public static void main(String args[])
	{
		int i,j,k=1;
		for(i=1;i<=5;i++) {
			for(j=1;j<=i;j++)
			{
				if(k%2==1)
				System.out.print("1");
				else
				System.out.print("0");
				k++;
			}
		System.out.println();
		}
	}
}