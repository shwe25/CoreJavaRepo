package edu.jsp.threads;

public class Thread2 implements Runnable{

	@Override
	public void run() {
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		for (int i = 0; i < 15; i++) {
			System.out.println("Thread 2");
		}
	}

}
