package com.threads;

public class ThreadName extends Thread{
	
	public void run()	{
		System.out.println("running: " +Thread.currentThread().getName());
	}
	public static void main(String[] args) {
		
		ThreadName t1 = new ThreadName();
		ThreadName t2 = new ThreadName();
		System.out.println(t1.getName());
		System.out.println(t2.getName());
		t1.setName("aa");
		t2.setName("bb");
		t1.start();
		t2.start();
	}

}
