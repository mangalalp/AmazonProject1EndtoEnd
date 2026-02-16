package mdule1;

public class CTM_polymorphism {
	
	static void add(int a,int b,int c)
	{
  int sum =a+b+c;
  System.out.println("sum of 3 integer-->"+ sum);
		
		}
	
	static void add(int a, double b)
	{
		 double sum=a+b;
		 System.out.println("sum of int and double-->"+ sum); 
	}
	static void add(double a,double b,double c)
	{
		double sum=a+b+c;
		System.out.println("sum of 3 double-->"+ sum); 
	}


	public static void main(String[] args) {
		CTM_polymorphism s=new CTM_polymorphism();
s.add(20, 30.5);	
		s.add(60.4, 50.25, 60.5);
		s.add(255, 100, 600);
		
		//CTM is depend on argument passed at time complile time
		
	}

}
