package edu.jsp.constructorCalling;

public class SubClass extends SuperClass {
	int z;
	public SubClass() {
		super(12,23);
		System.out.println("inside Sub class constructor()...");
		//super(2,3); error
	}
	SubClass(int z){
		this();
		this.z=z;
		System.out.println("inside Sub class constructor(int)...");
	}
	void m2(){
		System.out.println("inside m2()...");
	}
}
