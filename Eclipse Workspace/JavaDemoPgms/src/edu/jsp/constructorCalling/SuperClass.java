package edu.jsp.constructorCalling;

public class SuperClass {
	int x,y;
	public SuperClass(int x,int y) {
		System.out.println("inside super constructor");
		this.x = x;
		this.y = y;
	}
	
	void m1(){
		System.out.println("inside m1()...");
	}
}
