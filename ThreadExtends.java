package com.threads;

public class ThreadExtends extends Thread {

	public void run() {
		for (int i = 0; i <= 20; i++) {
			System.out.println("i value: " + i);
		}
	}

	public static void main(String[] args) {
		ThreadExtends te = new ThreadExtends();
		te.start();
		for (int j = 0; j <= 20; j++) {
			System.out.println("j value: " + j);
		}
	}
}
