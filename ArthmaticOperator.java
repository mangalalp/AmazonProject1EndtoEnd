package mdule1;

public class ArthmaticOperator {

	static void add()
	{
		int a=600;
		int b=500;
		int c=a+b;
		System.out.println(c);
	}
	static void sub()
	{
	int a=600;
	int b=500;
	int c=a-b;
	System.out.println(c);
	}
	static void mul()
	{
	int a=600;
	int b=500;
	int c=a*b;
	System.out.println(c);
	}
	static void div()
	{
	int a=600;
	int b=500;
	int c=a/b;
	System.out.println(c);
	}
	static void mod()
	{
	int a=600;
	int b=500;
	int c=a%b;// it gives always remainder ans
	System.out.println(c);
	}
	public static void main(String[] args) {
		add();
		sub();
		mul();
		div();
		mod();
		
	}

}
