package edu.jsp.collections.set;

import java.util.HashSet;
import java.util.Set;

public class Demo1 {

	public static void main(String[] args) {

		Set<Integer> set = new HashSet<Integer>();

		set.add(111);
		set.add(222);
		set.add(333);
		set.add(444);
		set.add(555);

		for (int x : set) {
			System.out.println(x);
		}

	}

}
