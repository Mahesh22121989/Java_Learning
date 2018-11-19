package variables;

public class Local_Variables {
	
	

	public static void main(String[] args) {
		Local_Variables lv=new Local_Variables();
		int a = 0;
		System.out.println(a);
		System.out.println();
		m1(5);
		lv.m2();

	}
	
	public static void m1(int a)
	{
		
		System.out.println(a);
	}
	public  void m2()
	{
		int b=6;
		System.out.println(6);
	}
	
	Local_Variables()
	{
		System.out.println("My name is mahesh");
	}
	

}


