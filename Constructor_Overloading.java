package mdule1;

public class Constructor_Overloading {

	Constructor_Overloading()//non parameterized
	{
		System.out.println("constructor1");
	}
	
	
	public static void main(String[] args)
	{
		//Constructor_Overloading a1=new Constructor_Overloading();
		//Constructor_Overloading a2=new Constructor_Overloading("mangala",'m');
		//Constructor_Overloading a3=new Constructor_Overloading(100);
		
		
		new Constructor_Overloading();
		new Constructor_Overloading("mangala",'m');
		new Constructor_Overloading(100);
	}
	Constructor_Overloading(String a, char b)
	{
		System.out.println("constructor can acess any acess specifier");
	}
	
	Constructor_Overloading(int a)
	{
		System.out.println("constrctor does not have return type");
	}

		
		
		

	
	
	

}
