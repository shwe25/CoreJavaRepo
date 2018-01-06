package edu.jsp.exception;

public class ThrowsDemo1 {
	public static void main(String[] args) 
	{
		System.out.println("Begin ... main");
		try
		{
			System.out.println("Begin try in main");
			A a = new A();
			a.m1(10,2);
			System.out.println("End try in main");
		}
		catch (ArithmeticException e)
		{
			System.out.println("Inside catch " + e);
			//	e.printStackTrace();
		}
		catch (ArrayIndexOutOfBoundsException e)
		{
			System.out.println(" Inside catch " + e );
			//e.printStackTrace();
		}
		System.out.println("End ... main");
	}
}

class A
{
	void m1(int x,int y)throws ArithmeticException,ArrayIndexOutOfBoundsException
	{
		System.out.println("Begin m1");
		int p=x/y;
		System.out.println("Value of p is" +p);
		B b = new B();
		b.m2();
		System.out.println("End m1");
	}
}


class B
{
	void m2()throws ArrayIndexOutOfBoundsException
	{
		System.out.println("Begin m2");
		int a[] = new int[5];
		a[6]=20;
		System.out.println("End m2");
	}
}


