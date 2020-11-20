package com.threads;

public class ThreadPriority extends Thread {
	public void run() {
		System.out.println("Thread Name" + Thread.currentThread().getName());
		System.out.println("Thread Priority" + Thread.currentThread().getPriority());

	}

	public static void main(String[] args) {
		ThreadPriority p1 = new ThreadPriority();
		p1.setPriority(MIN_PRIORITY);
		ThreadPriority p2 = new ThreadPriority();
		p2.setPriority(MAX_PRIORITY);
		ThreadPriority p3 = new ThreadPriority();
		p3.setPriority(NORM_PRIORITY);
		p1.start();
		p2.start();
		p3.start();
	}
}
