package exceptions;

import java.io.IOException;

public class Throws {

	public  static void main(String[] args) throws IndexOutOfBoundsException, IOException, InterruptedException {
		m1();

	}
	
	public static void m1() throws IOException,IndexOutOfBoundsException,InterruptedException
	{
		int a=0;
		int b=a/5;
		int c=a%5;
		System.out.println(b);
		System.out.println(c);
		
	}

}
