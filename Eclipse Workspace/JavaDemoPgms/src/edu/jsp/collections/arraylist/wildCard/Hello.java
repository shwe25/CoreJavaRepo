package edu.jsp.collections.arraylist.wildCard;

import java.util.List;

public class Hello{
	// unbounded
	void m1(List<?> list)
	{
		for (Object e:list)
		{
			System.out.println("Inside m1" + e);
		}
	}
	// upper bound
	void m2(List<? extends Animal> list)
	{
		for (Animal e:list)
		{
			System.out.println("Inside m2" + e);
		}
	}
	//lower bound
	void m3(List<? super Dog> list)
	{
		for (Object e:list)
		{
			System.out.println("Inside m3" + e);
		}
	}
}
