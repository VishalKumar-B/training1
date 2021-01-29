package com.motivity;

public class Program5 {

	static int fact(int num) {
		int factorial;

		for (factorial = 1; num > 1; num--) {
			factorial = factorial * num;
		}
		return factorial;
	}

	static int ncr(int n, int r) {
		int a = fact(n) / (fact(n - r) * fact(r));
		return a;
	}

	public static void main(String args[]) {
		int rows = 5, i, j;

		for (i = 0; i < rows; i++) {
			for (j = 0; j < (rows-1) - i; j++) {
				System.out.print(" ");
			}
			for (j = 0; j <= i; j++) {
				System.out.print(ncr(i, j)+" ");
			}
			System.out.println();
		}
	}
}
