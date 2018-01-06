package edu.jsp.abstraction.impl;

public class TubeLight implements Light{

	@Override
	public void onState() {
		System.out.println("TubeLight On");
	}

	@Override
	public void offState() {
		System.out.println("TubeLight Off");
	}

}
