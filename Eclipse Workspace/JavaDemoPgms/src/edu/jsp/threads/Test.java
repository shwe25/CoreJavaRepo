package edu.jsp.threads;

public class Test {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("Program Starts");
		Thread1 t1 = new Thread1();
		Thread2 t2 = new Thread2();
		Thread t = new Thread(t2);
		
		t.setDaemon(true);
		
		t1.start();
		t.start();
		
		Thread.sleep(500);
		System.out.println("Program Ends");
	}
}
