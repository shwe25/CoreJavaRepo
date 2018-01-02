package edu.jsp.abstraction.obj;

import edu.jsp.abstraction.impl.LedLight;
import edu.jsp.abstraction.impl.Light;
import edu.jsp.abstraction.impl.TubeLight;

public class Switch {

	public static Light light;
	
	public static Light getLight(String type) {
		if("led".equalsIgnoreCase(type))
			light=new LedLight();
		else if("tube".equalsIgnoreCase(type))
			light=new TubeLight();
		return light;
	}
}
