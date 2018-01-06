package edu.jsp.abstraction.impl;

public class LedLight implements Light{

	@Override
	public void onState() {
		System.out.println("LedLight On");
	}

	@Override
	public void offState() {
		System.out.println("LedLight Off");
	}

}
