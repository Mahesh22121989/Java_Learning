package exceptions;

import javax.management.StringValueExp;

public class Throw_exception {

	public static void main(String[] args) {
		String n="mahesh";
		try {
			m1(10,5);
			int result=m1(10,5);
			System.out.println(result);
			int result1=m1(5,10);
			System.out.println(result1);
			if(n.equalsIgnoreCase("Mahesh"))
			{
				System.out.println("Expected result");
			}
			m2();
		}
		catch(StringIndexOutOfBoundsException ss)
		{
			
		}
		catch(IndexOutOfBoundsException sss)
		{
			System.out.println("Index out of bound");
		}
		finally
		{
			System.out.println("command is executed");
		}
	}
	
	public static int  m1(int a,int b) 
	{
		if(b==0)
		{
			
			throw new StringIndexOutOfBoundsException("hello world");
			
		}
		return a/b;
	}
	
	public static void m2()
	{
		throw new IndexOutOfBoundsException("hello world 123");
	}

}
