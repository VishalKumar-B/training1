package practice;

class Test {

	int count;

	public synchronized void counter() {
		count++;
	}
}

public class Synchronization {

	public static void main(String[] args) throws Exception {
		Test s = new Test();

		Thread t1 = new Thread(new Runnable() {

			public void run() {
				for (int i = 1; i <= 1000; i++) {
					s.counter();
				}
			}
		});

		Thread t2 = new Thread(new Runnable() {

			public void run() {
				for (int i = 1; i <= 1000; i++) {
					s.counter();
				}
			}

		});

		t1.start();
		t2.start();

		t1.join();
		t2.join();

		System.out.println("count value is: " + s.count);
	}
}
