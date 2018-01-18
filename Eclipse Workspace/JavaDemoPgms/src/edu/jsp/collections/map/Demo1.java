package edu.jsp.collections.map;

import java.util.Map;
import java.util.TreeMap;

public class Demo1 {
	
	public static void main(String[] args) {

		Map<Integer, String> map = new TreeMap<Integer, String>();

		map.put(103, "AAA");
		map.put(105, "EEE");
		map.put(102, "BBB");
		map.put(101, "AAA");
		map.put(104, "DDD");

		String s = map.get(104);
		System.out.println("Value of 104 is: " + s);

	}

}
