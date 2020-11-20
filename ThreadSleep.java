package com.threads;

public class ThreadSleep extends Thread {
	public void run() {
		for (int i = 1; i <= 10; i++) {

			try {
				Thread.sleep(1000);

			} catch (Exception e) {
				e.printStackTrace();

			}
			System.out.println(i);
		}

	}

	public static void main(String args[]) {
		ThreadSleep ts = new ThreadSleep();
		ts.start();
	}
}
