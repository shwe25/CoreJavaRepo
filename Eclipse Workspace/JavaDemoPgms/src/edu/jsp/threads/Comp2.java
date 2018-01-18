package edu.jsp.threads;

public class Comp2 extends Thread {
	Printer ptr1 = null;
	Printer ptr2 = null;
	public Comp2(Printer ptr1, Printer ptr2) {
		this.ptr1 = ptr1;
		this.ptr2 = ptr2;
	}
	
	@Override
	public void run() {
		synchronized (ptr2) {			
			ptr2.print("Computer 2 Printer 2");
			synchronized (ptr1) {
				ptr1.print("Computer 2 Printer 1");
				ptr1.notify();
			}
			
		}
	}
}
