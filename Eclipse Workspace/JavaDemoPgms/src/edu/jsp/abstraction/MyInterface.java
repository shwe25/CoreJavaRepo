package edu.jsp.abstraction;

interface MyInterface extends Interface2,Interface3 {

	void m1();
	int X=19;
	static void m2(){
		System.out.println("Interface static method...");
	}
	default void m3(){
		System.out.println("Default method...");
	}
}
