package edu.jsp.threads;

public class Comp1 extends Thread {
	Printer ptr1 = null;
	Printer ptr2 = null;
	public Comp1(Printer ptr1, Printer ptr2) {
		this.ptr1 = ptr1;
		this.ptr2 = ptr2;
	}
	
	@Override
	public void run() {
		synchronized (ptr1) {			
			ptr1.print("Computer 1 Printer 1");
			try {
				ptr1.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			synchronized (ptr2) {
				ptr2.print("Computer 1 Printer 2");
			}
			
		}
	}
}
