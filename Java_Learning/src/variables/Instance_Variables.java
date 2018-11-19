package variables;

public class Instance_Variables {
	
	public  int a;
	private  int b;

	public static void main(String[] args) {
		Instance_Variables iv=new Instance_Variables();
		iv.m1(5,6);
		m2();

	}
	
	public  void m1(int c,int d)
	{
		
		a=c;
		
		System.out.println(b);
		System.out.println(d);
	}
	public static void m2()
	{
		int a = 0;
		System.out.println(a);
	}

}
