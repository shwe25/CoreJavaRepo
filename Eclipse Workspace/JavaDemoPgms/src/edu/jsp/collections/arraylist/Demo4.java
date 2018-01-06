package edu.jsp.collections.arraylist;

import java.util.ArrayList;

public class Demo4 {

	public static void main(String[] args) {

		ArrayList<Object> list = new ArrayList<Object>();

		list.add("abc");
		list.add(new Integer(99));
		list.add(new Double(99.99));

		for (Object x : list) {
			System.out.println(x);
		}
	}
}
