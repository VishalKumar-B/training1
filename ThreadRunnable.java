package com.threads;

public class ThreadRunnable implements Runnable {

	public static void main(String[] args) {
		ThreadRunnable tr = new ThreadRunnable();
		Thread t = new Thread(tr);
		t.start();

		for (int j = 0; j <= 20; j++) {
			System.out.println("j value: " +j);
		}
	}
	
	@Override
	public void run() {
		for (int i = 0; i <= 20; i++) {
			System.out.println("i value: " + i);
		}
	}
}
