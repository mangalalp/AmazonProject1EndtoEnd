package mdule1;
public class Ifelse 
{
	static void add()
	{
		int a=10;
		int b=20;
		
		if(a>b)          //false
		{
			System.out.println("1");
		}
		if(a<b)        //true
		{
			System.out.println("2");
		}
		if(a>=b)  //false
		{
			System.out.println("3");
		}
		if(a<=b) //true
		{
			System.out.println("4");
		}
		if(a==b) //false
		{
			System.out.println("5");
		}
		if(a!=b) //true
		{
			System.out.println("6");
		}
		
	}
	
	public static void main(String[] args)
	{
		add();
	}

}
