package mdule1;

public class AS_WithinClass // access specifier with in class
{
	public void add()
	{
		System.out.println("addition of two numbers");
	}
	private static void addition()
	{
		System.out.println("heavily raining outside");
	}
	protected void sub()
	{
		System.out.println("java is easy to learn");
	}
   void mul()
   {
	   System.out.println("multiple of 2*2 is 4");
   }
	public static void main(String[] args) {
		AS_WithinClass t1=new AS_WithinClass();
		t1.add();
		addition();
		t1.mul();
		t1.sub();

	}

}
