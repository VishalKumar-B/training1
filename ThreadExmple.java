package com.threads;

class Trainees {
	public synchronized void message(String companyName) {
		for (int i = 0; i < 5; i++) {
			System.out.print("welcome to the company ");
			try {
				Thread.sleep(1000);
				System.out.println(companyName);
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}

class Company extends Thread {
	Trainees c;
	String comapnyName;

	public Company(Trainees c, String comapnyName) {
		this.c = c;
		this.comapnyName = comapnyName;
	}

	public void run() {
		c.message(comapnyName);
	}
}

class ThreadExmple {

	public static void main(String[] args) {
		Trainees t = new Trainees();
		Company x = new Company(t, "Motivity");
		Company y = new Company(t, "JNIT");
		x.start();
		y.start();

	}
}
