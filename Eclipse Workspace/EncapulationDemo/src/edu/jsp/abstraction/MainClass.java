package edu.jsp.abstraction;

public class MainClass {

	public static void main(String[] args) {
		ClassA a = new ClassB();
		System.out.println(a.y);
		System.out.println(a.x);//good way of accessing static member is by class name
		a.m3();//even we can still able to access by using reference variable also
		a.m1();
		a.m2();
		MyInterface.m2();
		
		MyInterface i = new ImplementationClass();
		
	}
}
