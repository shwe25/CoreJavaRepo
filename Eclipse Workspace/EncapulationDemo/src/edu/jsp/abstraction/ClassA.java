package edu.jsp.abstraction;

public abstract class ClassA {

	static int x;
	int y;
	public ClassA() {
		//this.y = y;
		System.out.println("ClassA Constructor");
	}
	//void m4();
	abstract void m1();
	
	void m2(){
		System.out.println("inside m2()");
	}
	
	static void m3(){
		System.out.println("inside static m3()..");
	}
	
}
