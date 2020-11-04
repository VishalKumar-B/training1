package com.ClassPrograms;
//sum using do-while loop
public class Sum2 {
	public static void main(String[] args) {
		int r,sum=0,num=123;
		do{
			r=num%10;
			sum=sum+r;
			num=num/10;
		}while(num>0);
		System.out.println("Sum: " +sum);
	}
}
