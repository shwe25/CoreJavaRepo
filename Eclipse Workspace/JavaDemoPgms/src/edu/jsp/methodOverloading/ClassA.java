package edu.jsp.methodOverloading;

public class ClassA {

	public static void main(String[] args) {
		System.out.println(args[1]);
		ClassA a = new ClassA();
		a.m1();
	}
	void m1(){
		System.out.println("inside m1()");
	}
}

class ClassB extends ClassA{
	
	void m1(){
		System.out.println();
	}
}
