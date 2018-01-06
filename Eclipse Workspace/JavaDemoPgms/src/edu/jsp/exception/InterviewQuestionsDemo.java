package edu.jsp.exception;

import java.io.FileNotFoundException;
import java.io.IOException;

public class InterviewQuestionsDemo {
	public static void main(String[] args) throws Exception
	{
		try {
			System.out.println("Begin main");
			//return;-> executes finally
			//throw new Exception("simply");-> executes finally
			System.exit(0);//finally will not executed 
		}finally{
			System.out.println("End main");
		}

	}
}

class X
{
	void m1() throws IOException
	{
		
	}
}

class Y extends X
{
	void m1() throws FileNotFoundException
	{
		
	}
	
}
