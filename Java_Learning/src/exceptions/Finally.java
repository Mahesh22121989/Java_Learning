package exceptions;

public class Finally {

	public static void main(String[] args) {
		m1();

	}
	static void m1()
	{
		String a=null;
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
		
	
		finally{
			System.out.println("Finally block");
		}
	}
}
