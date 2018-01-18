package edu.jsp.collections.arraylist;

import java.util.ArrayList;
import java.util.List;

public class Demo2 {
	
	public static void main(String[] args) {
		// generics 
		List<Integer> list = new ArrayList<Integer>();

		// autoboxing
		list.add(66);
		list.add(44);
		list.add(22);
		list.add(55);
		list.add(11);
		
		// for each loop & auto unboxing
		for (int x : list) {
			System.out.println(x);
		}
	}

}
