package edu.jsp.inheritence;

public class Student extends Person{
	
	int sId;
	String scName;
	double marks;
	
	public Student(int uId, int age, String name, char gender, 
			int sId, String scName, double marks) {
		super(uId, age, name, gender);
		this.sId = sId;
		this.scName = scName;
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [sId=" + sId + ", scName=" + scName + ", marks=" + marks + ", uId=" + uId + ", age=" + age
				+ ", name=" + name + ", gender=" + gender + "]";
	}
	
	
	
}
