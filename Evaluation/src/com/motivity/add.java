package com.motivity;

import java.util.Scanner;

public class add {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
			int first = 0;
			int last;
			int sum = 0;
			last = a % 10;
			while (a!=0) {
				first = a % 10;
				a = a / 10;
			}
			sum = first + last;
			System.out.println(sum);
		sc.close();
	}

}
