package edu.jsp.accessSpecifiers.firstProject.module2;

import edu.jsp.accessSpecifiers.firstProject.module1.FirstClass;

public class Second extends FirstClass{
	
	public static void main(String[] args) {
		FirstClass fc = new FirstClass();
		//System.out.println(fc.x);
		System.out.println("From Second");
		Second s = new Second();
		System.out.println(s.x);
	}
}
