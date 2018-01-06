package edu.jsp.exception;

public class TryCatchDemo2 {
	public static void main(String[] args) {
		System.out.println("Begin main");
		try 
		{
		System.out.println("Begin try");
		int a[] = new int[5];
		a[9] = 102;// Exception occurs.  JVM identifies and creates a corresponding exception object.
		System.out.println("End try");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
		System.out.println("End of main");
	}
}

