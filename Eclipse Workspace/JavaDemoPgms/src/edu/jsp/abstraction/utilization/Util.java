package edu.jsp.abstraction.utilization;

import edu.jsp.abstraction.impl.Light;
import edu.jsp.abstraction.obj.Switch;

public class Util {

	public static void main(String[] args) {
		
		Light light = Switch.getLight("tube");
		if(light != null){
			light.onState();
		}
		
		System.out.println(light.toString());
		System.out.println(light);
		System.out.println(light.hashCode());
		System.out.println(Integer.toHexString(light.hashCode()));
		System.out.println("10 = "+Integer.toHexString(10));
		Object obj = new Object();
		Object obj2 = obj;
		System.out.println(obj);
		System.out.println(obj.hashCode());
		System.out.println(obj2.hashCode());
		System.out.println(obj2.equals(obj));
	}
}
