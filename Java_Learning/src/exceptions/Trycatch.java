package exceptions;

public class Trycatch {
	static String a=null;

	public static void main(String[] args) {
		m1();

	}
	
	static void m1()
	{
		try {
			if(a.equalsIgnoreCase("mahi"))
			{
				System.out.println("A value is 10");
			}
		}
			catch(NullPointerException ill)
			{
				System.out.println(ill.getMessage());
			}
		
	
		
	}
}
