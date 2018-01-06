package edu.jsp.constructorCalling;

public class MainClass {

	public static void main(String[] args) {
		SubClass sub = new SubClass(27);
		System.out.println("x = "+sub.x);
		System.out.println("y = "+sub.y);
		System.out.println("z = "+sub.z);
		sub.m1();
		sub.m2();
	}
}
