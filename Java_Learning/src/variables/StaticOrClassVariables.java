package variables;

public class StaticOrClassVariables {
	
	public static int a;
	public static char b='a';
	public static float c;
	public static double d;
	public static final short e=1000;
	public static final byte f=100;
	public static final int g=5;
	
	

	public static void main(String[] args) {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
	}
	public void m1(int h)
	{
		
		a=h;
	}

}
