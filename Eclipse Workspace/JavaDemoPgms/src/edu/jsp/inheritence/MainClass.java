package edu.jsp.inheritence;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		System.out.println("Main begins");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter id:");
		int uId=sc.nextInt();
		System.out.println("Enter age:");
		int age=sc.nextInt();
		System.out.println("Enter name:");
		String name=sc.next();
		System.out.println("Enter gender:");
		char gender=sc.next().charAt(0);
		System.out.println("Enter eId:");
		int eId=sc.nextInt();
		System.out.println("Enter company:");
		String company=sc.next();
		System.out.println("Enter salary:");
		double salary=sc.nextDouble();
		Employee emp1 = new Employee(uId, age, name, gender, eId, company, salary);
		emp1.display();
		System.out.println("Enter age:");
		int sId=sc.nextInt();
		System.out.println("Enter s/c name:");
		String scName=sc.next();
		System.out.println("Enter marks:");
		double marks=sc.nextDouble();
		Student s1 = new Student(uId, age, name, gender, sId, scName, marks);
		System.out.println(s1);
		sc.close();
		System.out.println("Main ends");
	}
}
