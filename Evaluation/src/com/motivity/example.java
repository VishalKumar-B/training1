package com.motivity;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class example {

	static int factorial(int number) {
		 int i,fact=1;  
		  for(i=1;i<=number;i++){    
		      fact=fact*i;    
		  }    
		  return fact;
	}
	
	public static void main(String[] args) {

		/*
		 * Map<Integer, String> m = new HashMap<Integer, String>(); m.put(1, "a");
		 * m.put(2, "b"); for (Entry<Integer, String> m1 : m.entrySet()) {
		 * System.out.println(m1.getKey() + " " + m1.getValue()); }
		 */
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int sum=0;
		
		while(a>0) {
			sum += factorial(a%10);
			a=a/10;
		}
		System.out.println(sum);
	}
}
