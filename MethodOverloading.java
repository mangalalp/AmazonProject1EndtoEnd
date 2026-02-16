package mdule1;

public class MethodOverloading {
	
	
	
		static void add(int a,int b)
		{
			int sum=a+b;
			System.out.println(sum);
		}
		static void add(int a,double b)
		{
			double sum=a+b;
			System.out.println(sum);
		}
		static void add(double a,double b)
		{
			double sum=a+b;
			System.out.println(sum);
		}
		void mul(long a, int b)
		{
			long mul=a*b;
			System.out.println(mul);
		}
		void mul(int a, int b)
		{
			int mul=a*b;
			System.out.println(mul);
		}
		
		public static void main(String[] args) 
		{
			add(45,65);
			add(45,65.85);
			add(74.36,65.8525);
			MethodOverloading m1=new MethodOverloading();
			m1.mul(35000, 100);
			m1.mul(3, 2);
			
		}
	
	

		
		

	

}
