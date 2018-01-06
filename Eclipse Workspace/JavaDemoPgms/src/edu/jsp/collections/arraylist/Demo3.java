package edu.jsp.collections.arraylist;

import java.util.ArrayList;
import java.util.List;

public class Demo3 {
	
	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();

		list.add("Abc");
		list.add("99");
		list.add("999");

		for (String x : list) {
			System.out.println(x);
		}
	}

}
