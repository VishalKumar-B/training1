package com.threads;

import java.util.Scanner;

public class ThreadJoin extends Thread {

	int x,y;
	public void run()	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter x and y values: ");
		x = sc.nextInt();
		y = sc.nextInt();
	}
	public static void main(String[] args) throws InterruptedException {
		ThreadJoin tj = new ThreadJoin();
		tj.start();
		tj.join();
		System.out.println("sum: "+(tj.x+tj.y));
	}

}
