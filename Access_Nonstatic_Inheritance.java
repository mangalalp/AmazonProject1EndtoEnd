package mdule1;


class Inheritance6
{
	static void add()
	{
		System.out.println("addition");
	}
	static void add1()
	{
		System.out.println("addition1");
	}
	 void add2()
	{
		System.out.println("addition2");
	}
	 void add3()
	{
		System.out.println("addition3");
	}
}
	

public class Access_Nonstatic_Inheritance extends Inheritance6{
	void add6()
	{
		System.out.println("addition5");
	}

	public static void main(String[] args) {
		add();
		add1();
		Access_Nonstatic_Inheritance a1= new Access_Nonstatic_Inheritance();
		a1.add2();
		a1.add3();
		a1.add6();
		
		

	}
}



