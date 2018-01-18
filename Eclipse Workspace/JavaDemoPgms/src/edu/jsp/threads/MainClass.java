package edu.jsp.threads;

public class MainClass {
	public static void main(String[] args) {
		Printer ptr1 = new Printer();
		Printer ptr2 = new Printer();
		Comp1 c1 = new Comp1(ptr1,ptr2);
		Comp2 c2 = new Comp2(ptr1,ptr2);
		c1.start();
		c2.start();
	}
}
