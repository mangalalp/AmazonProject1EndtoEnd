package mdule1;

public class Local_Variable {

	static void add()
	{
	
		int a;//declaration
		a=100;//initializtion
		int b;
		b=200;
				int c=a+b;
				System.out.println(c);//utilization
	}
	static void student()
	{
		String name="Mangala";
		char gender='f';
				System.out.println(name +" "+ gender);
		
		
	}
	static void sub(int a,int b)
	{
		 a=300;
		 b=200;
		 int c=a-b;
		 System.out.println(c);
		
	}
	void mul()
	{
		double a=2.2;
		int b=3;
		double d=a*b;
		System.out.println(d);
	}
	public static void main(String[] args) {
		add();
		student();
		sub(300,200);
		Local_Variable t1=new Local_Variable();
				t1. mul();
		
		

	}
		
	
		
			
		
									
			
	

	}


