package com.ClassPrograms;
//sum using for loop
public class Sum1 {
	public static void main(String[] args) {
		int r,sum=0,num=123;
		for( ;num>0; ) {
			r=num%10;
			sum=sum+r;
			num=num/10;
		}
		System.out.println("Sum: "+ sum);
	}
}
