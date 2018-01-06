package edu.jsp.inheritence;

public class Employee extends Person{

	int eId;
	String company;
	private double salary;
	
	public Employee(int uId, int age, String name, char gender, 
			int eId, String company, double salary) {
		super(uId, age, name, gender);
		this.eId = eId;
		this.company = company;
		this.salary = salary;
	}
	
	void display(){
		System.out.println("Employee Details");
		System.out.println("--------------------------");
		System.out.println("Emp Id: "+eId);
		System.out.println("Emp Name: "+name);
		System.out.println("Emp company: "+company);
		System.out.println("Emp salary: "+salary);
		System.out.println("Emp uId: "+uId);
		System.out.println("Emp age: "+age);
		System.out.println("Emp gender: "+gender);
		
	}
	
}
