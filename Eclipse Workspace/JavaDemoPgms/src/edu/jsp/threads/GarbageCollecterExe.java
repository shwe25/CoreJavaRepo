package edu.jsp.threads;

import java.util.Arrays;

public class GarbageCollecterExe {
	static int i = 1;
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Object Deleted"+i++);
	}
	
	public static void main(String[] args) throws InterruptedException {
		System.out.println("Program starts");
		for (int i = 0; i < 1000000; i++) {			
			new GarbageCollecterExe();
		}
		Thread.sleep(10000);
		System.out.println("Program ends");
	}
}
