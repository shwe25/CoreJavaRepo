package edu.jsp.collections.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo1 {
public static void main(String[] args) {
		
		ArrayList list = new ArrayList();
		
		list.add("abc");
		list.add(new Integer(99));
		list.add(new Double(99.99));
		
		Iterator it = list.iterator();//abstraction
		while(it.hasNext())
		{
			Object o = it.next();
			if(o instanceof String)
			{
				String str = (String) o;
				System.out.println(str);
			}
			else if(o instanceof Integer)
			{
				Integer i = (Integer) o;
				System.out.println(i);
			}
			else if(o instanceof Double)
			{
				Double d = (Double) o;
				System.out.println(d);
			}
		}
	}

}
