package edu.jsp.collections.treeset;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		Set<Employee> set = new TreeSet<>();
		set.add(new Employee(123, "BC", 14235.0));
		set.add(new Employee(234, "ABC", 14235.0));
		set.add(new Employee(13, "CED", 14235.0));
		set.add(new Employee(23, "Wec", 14235.0));
		set.add(new Employee(126, "Bes", 14235.0));
		
		Iterator<Employee> iterator = set.iterator();
		for (Iterator iterator1 = set.iterator(); iterator1.hasNext();) {
			Employee employee = (Employee) iterator1.next();
			System.out.println(employee);
		}
			
	}
}
