package edu.jsp.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Common {

	public static void main(String[] args) {
		List c = new ArrayList();
		c.add(12);
		c.add(2.3);
		List c1 = new ArrayList();
		c1.addAll(c);
		c.add("Str");
		c.add(null);
		System.out.println(c);
		System.out.println(c.isEmpty());
		System.out.println(c1);
		System.out.println(c.get(2));
	}
}
