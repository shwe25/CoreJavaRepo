package edu.jsp.string;

public class StringDemo {

	public static void main(String[] args) {
		String st = "ABC";
		String st1 = new String("ABC");
		System.out.println(st1);
		System.out.println(st);
		System.out.println(st1.hashCode());
		System.out.println(st.hashCode());
		st = "BXS";
		System.out.println(st.hashCode());
		System.out.println(st.equals(st1));

	}
}
