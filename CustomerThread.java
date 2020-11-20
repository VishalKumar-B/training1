package com.threads;

class Customer {

	int amount = 10000;

	synchronized void withdraw(int amount) {
		System.out.println("going to withdraw...");
		if (this.amount < amount) {
			System.out.println("less balance go and deposit ");
			try {
				wait();
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
		}
		this.amount = this.amount - amount;
		System.out.println("withdrawal successful ");
	}

	synchronized void deposit(int amount) {
		System.out.println("going to deposit");
		this.amount = this.amount + amount;
		System.out.println("deposit done ");
		notify();
	}
}

class CustomerThread {

	public static void main(String args[]) {
		Customer raju = new Customer();
		new Thread() {
			public void run() {
				raju.withdraw(15000);
			}
		}.start();

		new Thread() {
			public void run() {
				raju.deposit(20000);
			}
		}.start();
	}
}