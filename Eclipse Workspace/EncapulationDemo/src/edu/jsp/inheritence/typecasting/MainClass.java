package edu.jsp.inheritence.typecasting;

public class MainClass {

	public static void main(String[] args) {
		
		A a = new A();
		B b = new B();
		b.m1();
		A c = b;
		if(b instanceof B){
			//B b1 = (B)a;
			System.out.println(b.x);
		}else{
			System.out.println("Not an instance");
		}
		
	}
}
